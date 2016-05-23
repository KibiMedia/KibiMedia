/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.beans;

import java.util.ArrayList;
import ru.sfedu.kibimedia.tables.News;

/**
 *
 * @author DPosadsky
 */
public class NewsBean {
    
    private ArrayList<News> allNews;
    
    public void setAllNews(ArrayList<News> allNews) {
        this.allNews = allNews;
    }
    
    public ArrayList<News> getAllNews() {
        return allNews;
    }
    
}
