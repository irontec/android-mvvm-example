package com.irontec.axier.mvvmexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.irontec.axier.mvvmexample.adapters.ArticleAdapter;
import com.irontec.axier.mvvmexample.databinding.ActivityMainBinding;
import com.irontec.axier.mvvmexample.mock.ArticleMockHelper;
import com.irontec.axier.mvvmexample.model.Article;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.contactList.setLayoutManager(layoutManager);

        List<Article> articles = ArticleMockHelper.getMockArticleData();

        ArticleAdapter adapter = new ArticleAdapter(articles);
        binding.contactList.setAdapter(adapter);
    }
}
