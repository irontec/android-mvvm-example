package com.irontec.axier.mvvmexample.mock;

import com.irontec.axier.mvvmexample.model.Article;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by oneil on 28/07/2017.
 */

public class ArticleMockHelper {

    public static List<Article> getMockArticleData() {
        List<Article> list = new ArrayList<>();
        for (int i = 0; i <= 24; i++) {
            Article article = new Article();
            article.setTitle("Nuevo evento de desarrollo");
            article.setSubtitle("Los lugareños han creado un nuevo evento de desarrollo web cerca de su zona.");
            article.setExcerpt("La cita de referencia en España para los profesionales del marketing online vuelve al World Trade Center. Zaragoza acoge cada año a cientos de profesionales para aprender sobre SEO, Social Media, Analítica y Optimización, Desarrollo, actualizarse con los últimos cambios en Internet y realizar mucho… mucho networking.");
            article.setDate(new Date());

            list.add(article);
        }
        return list;
    }

}
