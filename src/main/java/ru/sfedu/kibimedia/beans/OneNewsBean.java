/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.beans;


import ru.sfedu.kibimedia.tables.News;

/**
 *
 * @author DPosadsky
 */
public class OneNewsBean {
    
    private News news;
    
    public void setNews(News news) {
        this.news = news;
    }
    
    public News getNews() {
        return news;
    }
    
    public void setTitle(String title) {
        news.setTitle(title);
    }
    
    public String getTitle() {
        return news.getTitle();
    }
    
}
