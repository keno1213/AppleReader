package com.appleking.reader.bean;

import java.util.List;

/**
 * Created by appleking on 2017/2/14.
 */

public class BookResult {


    @Override
    public String toString() {
        return "BookResult{" +
                "showapi_res_code=" + showapi_res_code +
                ", showapi_res_error='" + showapi_res_error + '\'' +
                ", showapi_res_body=" + showapi_res_body +
                '}';
    }

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"pagebean":{"allNum":113128,"allPages":11313,"contentlist":[{"author":"心若言","id":"114440","name":"雍正熹妃传","newChapter":" 第五百七十五章 知情（三更到）","size":"3508K","type":"1","typeName":"玄幻魔法","updateTime":"15-07-18"}],"currentPage":1,"maxResult":10},"ret_code":0}
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
         * pagebean : {"allNum":113128,"allPages":11313,"contentlist":[{"author":"心若言","id":"114440","name":"雍正熹妃传","newChapter":" 第五百七十五章 知情（三更到）","size":"3508K","type":"1","typeName":"玄幻魔法","updateTime":"15-07-18"}],"currentPage":1,"maxResult":10}
         * ret_code : 0
         */

        private PagebeanBean pagebean;
        private int ret_code;

        @Override
        public String toString() {
            return "ShowapiResBodyBean{" +
                    "pagebean=" + pagebean +
                    ", ret_code=" + ret_code +
                    '}';
        }

        public PagebeanBean getPagebean() {
            return pagebean;
        }

        public void setPagebean(PagebeanBean pagebean) {
            this.pagebean = pagebean;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public static class PagebeanBean {
            @Override
            public String toString() {
                return "PagebeanBean{" +
                        "allNum=" + allNum +
                        ", allPages=" + allPages +
                        ", currentPage=" + currentPage +
                        ", maxResult=" + maxResult +
                        ", contentlist=" + contentlist +
                        '}';
            }

            /**
             * allNum : 113128
             * allPages : 11313
             * contentlist : [{"author":"心若言","id":"114440","name":"雍正熹妃传","newChapter":" 第五百七十五章 知情（三更到）","size":"3508K","type":"1","typeName":"玄幻魔法","updateTime":"15-07-18"}]
             * currentPage : 1
             * maxResult : 10
             */

            private int allNum;
            private int allPages;
            private int currentPage;
            private int maxResult;
            private List<ContentlistBean> contentlist;

            public int getAllNum() {
                return allNum;
            }

            public void setAllNum(int allNum) {
                this.allNum = allNum;
            }

            public int getAllPages() {
                return allPages;
            }

            public void setAllPages(int allPages) {
                this.allPages = allPages;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public int getMaxResult() {
                return maxResult;
            }

            public void setMaxResult(int maxResult) {
                this.maxResult = maxResult;
            }

            public List<ContentlistBean> getContentlist() {
                return contentlist;
            }

            public void setContentlist(List<ContentlistBean> contentlist) {
                this.contentlist = contentlist;
            }

            public static class ContentlistBean {
                /**
                 * author : 心若言
                 * id : 114440
                 * name : 雍正熹妃传
                 * newChapter :  第五百七十五章 知情（三更到）
                 * size : 3508K
                 * type : 1
                 * typeName : 玄幻魔法
                 * updateTime : 15-07-18
                 */

                private String author;
                private String id;
                private String name;
                private String newChapter;
                private String size;
                private String type;
                private String typeName;
                private String updateTime;

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
            }
        }
    }
}
