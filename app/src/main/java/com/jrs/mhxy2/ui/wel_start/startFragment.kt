package com.jrs.mhxy2.ui.wel_start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.jrs.mhxy2.R
import com.jrs.mhxy2.databinding.WelFragmentStartBinding

class startFragment : Fragment() {

    private var _binding: WelFragmentStartBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var bt_login: Button
    private lateinit var bt_regist: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(startViewModel::class.java)

        _binding = WelFragmentStartBinding.inflate(inflater, container, false)
        val root: View = binding.root

        initView()
        setListener()


//        val textView: TextView = binding.textFirst
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    //设置监听
    private fun setListener() {
        bt_login.setOnClickListener {
            //lambda 表达式
//            findNavController().navigate(R.id.action_startFragment_to_loginFragment)
            findNavController().navigate(R.id.action_startFragment_to_registFragment)

        }
        bt_regist.setOnClickListener {
            //lambda 表达式

        }
    }

    //初始化控件
    private fun initView() {
        bt_login = binding.startButtonLogin
        bt_regist = binding.startButtonRegist
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}