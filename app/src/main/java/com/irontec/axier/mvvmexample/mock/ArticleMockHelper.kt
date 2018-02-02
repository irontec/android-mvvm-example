package com.irontec.axier.mvvmexample.mock

import com.irontec.axier.mvvmexample.model.Article
import java.util.*

/**
 * Created by oneil on 28/07/2017.
 */

object ArticleMockHelper {

    val mockArticleData: List<Article>
        get() {
            val list = ArrayList<Article>()
            for (i in 0..24) {
                val article = Article()
                article.title = "Nuevo evento de desarrollo"
                article.subtitle = "Los lugareños han creado un nuevo evento de desarrollo web cerca de su zona."
                article.excerpt = "La cita de referencia en España para los profesionales del marketing online vuelve al World Trade Center. Zaragoza acoge cada año a cientos de profesionales para aprender sobre SEO, Social Media, Analítica y Optimización, Desarrollo, actualizarse con los últimos cambios en Internet y realizar mucho… mucho networking."
                article.date = Date()

                list.add(article)
            }
            return list
        }

}
