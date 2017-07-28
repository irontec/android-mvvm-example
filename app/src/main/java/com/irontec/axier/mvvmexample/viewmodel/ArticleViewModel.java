package com.irontec.axier.mvvmexample.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.irontec.axier.mvvmexample.BR;
import com.irontec.axier.mvvmexample.model.Article;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * Created by oneil on 28/07/2017.
 */

public class ArticleViewModel extends BaseObservable {

    private Article mArticle;

    public ArticleViewModel(Article mArticle) {
        this.mArticle = mArticle;
    }

    @Bindable
    public String getTitle() {
        return mArticle.getTitle();
    }

    public void setTitle(String title) {
        mArticle.setTitle(title);
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public String getSubtitle() {
        return mArticle.getSubtitle();
    }

    public void setSubtitle(String subtitle) {
        mArticle.setSubtitle(subtitle);
        notifyPropertyChanged(BR.subtitle);
    }

    @Bindable
    public String getExcerpt() {
        return mArticle.getExcerpt();
    }

    public void setExcerpt(String excerpt) {
        mArticle.setExcerpt(excerpt);
        notifyPropertyChanged(BR.excerpt);
    }

    @Bindable
    public String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm", Locale.getDefault());
        return sdf.format(mArticle.getDate());
    }

    public void setDate(Date date) {
        mArticle.setDate(date);
        notifyPropertyChanged(BR.formattedDate);
    }
}
