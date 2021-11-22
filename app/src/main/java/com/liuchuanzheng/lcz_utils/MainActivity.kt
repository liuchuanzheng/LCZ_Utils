package com.liuchuanzheng.lcz_utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.liuchuanzheng.lib_util.TestUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestUtil.test()
    }
}