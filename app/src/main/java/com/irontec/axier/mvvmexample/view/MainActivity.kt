package com.irontec.axier.mvvmexample.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.irontec.axier.mvvmexample.R
import com.irontec.axier.mvvmexample.databinding.ActivityMainBinding
import com.irontec.axier.mvvmexample.mock.ArticleMockHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val layoutManager = LinearLayoutManager(this)
        binding.contactList.layoutManager = layoutManager

        val articles = ArticleMockHelper.mockArticleData

        val adapter = ArticleAdapter(articles)
        binding.contactList.adapter = adapter
    }
}
