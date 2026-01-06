package com.jrs.mhxy2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.jrs.mhxy2.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var WelComebinding: ActivityWelcomeBinding
    private lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //初始化binding
        WelComebinding = ActivityWelcomeBinding.inflate(layoutInflater)
        //设置binding  WelComebinding.root功能等同于R.layout.activity_welcome
        setContentView(WelComebinding.root)
        //初始化方法调用
        initView()
        setListener()
    }

    private fun setListener(){
        //lambda 表达式
        tv.setOnClickListener{
            view ->
            //处理点击事件
            var intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun initView(){
        tv = WelComebinding.welcomeTvCome
    }
}