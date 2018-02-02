package com.irontec.axier.mvvmexample.view

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import com.irontec.axier.mvvmexample.R
import com.irontec.axier.mvvmexample.databinding.RowArticleBinding
import com.irontec.axier.mvvmexample.model.Article
import com.irontec.axier.mvvmexample.viewmodel.ArticleViewModel

/**
 * Created by oneil on 28/07/2017.
 */

class ArticleAdapter(private val mArticles: List<Article>) : RecyclerView.Adapter<ArticleAdapter.BindingHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
        val binding = DataBindingUtil.inflate<RowArticleBinding>(
                LayoutInflater.from(parent.context),
                R.layout.row_article, parent, false)

        return BindingHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingHolder, position: Int) {
        val binding = holder.binding
        binding.avm = ArticleViewModel(mArticles[position])
    }

    override fun getItemCount(): Int {
        return mArticles.size
    }

    class BindingHolder(val binding: RowArticleBinding) : RecyclerView.ViewHolder(binding.mainLayout)
}
