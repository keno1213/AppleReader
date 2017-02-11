package com.appleking.reader.bean;

import java.util.List;

/**
 * Created by appleking on 2017/2/10.
 * 图书数据结构
 */

public class Book {
    public String id;
    public String name;
    public String author;
    public String newChapter;
    public String size;
    public String type;
    public String typeName;
    public String updateTime;
    public List<Chapter> chapterList;
}
