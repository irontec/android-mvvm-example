package com.irontec.axier.mvvmexample.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.irontec.axier.mvvmexample.R;
import com.irontec.axier.mvvmexample.databinding.RowArticleBinding;
import com.irontec.axier.mvvmexample.model.Article;
import com.irontec.axier.mvvmexample.viewmodel.ArticleViewModel;

import java.util.List;

/**
 * Created by oneil on 28/07/2017.
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.BindingHolder> {

    private List<Article> mArticles;

    public ArticleAdapter(List<Article> mArticles) {
        this.mArticles = mArticles;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RowArticleBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.row_article, parent, false);

        return new BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        RowArticleBinding binding = holder.binding;
        binding.setAvm(new ArticleViewModel(mArticles.get(position)));
    }

    @Override
    public int getItemCount() {
        return mArticles.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private RowArticleBinding binding;

        public BindingHolder(RowArticleBinding binding) {
            super(binding.mainLayout);
            this.binding = binding;
        }
    }
}
