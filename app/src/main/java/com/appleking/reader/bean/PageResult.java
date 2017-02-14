package com.appleking.reader.bean;

import java.util.List;

/**
 * Created by appleking on 2017/2/14.
 */

public class PageResult {


    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"book":{"author":"肉丝抓饭","chapterList":[{"bookId":"124227","cid":"22048512","name":"第一章 古界"}],"id":"124227","name":"审判界 下载","newChapter":" 第19章 我准备好了","size":"83K","type":"1","typeName":"玄幻魔法","updateTime":"15-08-09"},"ret_code":0}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * book : {"author":"肉丝抓饭","chapterList":[{"bookId":"124227","cid":"22048512","name":"第一章 古界"}],"id":"124227","name":"审判界 下载","newChapter":" 第19章 我准备好了","size":"83K","type":"1","typeName":"玄幻魔法","updateTime":"15-08-09"}
         * ret_code : 0
         */

        private BookBean book;
        private int ret_code;

        public BookBean getBook() {
            return book;
        }

        public void setBook(BookBean book) {
            this.book = book;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public static class BookBean {
            /**
             * author : 肉丝抓饭
             * chapterList : [{"bookId":"124227","cid":"22048512","name":"第一章 古界"}]
             * id : 124227
             * name : 审判界 下载
             * newChapter :  第19章 我准备好了
             * size : 83K
             * type : 1
             * typeName : 玄幻魔法
             * updateTime : 15-08-09
             */

            private String author;
            private String id;
            private String name;
            private String newChapter;
            private String size;
            private String type;
            private String typeName;
            private String updateTime;
            private List<ChapterListBean> chapterList;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNewChapter() {
                return newChapter;
            }

            public void setNewChapter(String newChapter) {
                this.newChapter = newChapter;
            }

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public List<ChapterListBean> getChapterList() {
                return chapterList;
            }

            public void setChapterList(List<ChapterListBean> chapterList) {
                this.chapterList = chapterList;
            }

            public static class ChapterListBean {
                /**
                 * bookId : 124227
                 * cid : 22048512
                 * name : 第一章 古界
                 */

                private String bookId;
                private String cid;
                private String name;

                public String getBookId() {
                    return bookId;
                }

                public void setBookId(String bookId) {
                    this.bookId = bookId;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }
    }
}
