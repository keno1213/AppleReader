package com.appleking.reader.bean;

/**
 * Created by appleking on 2017/2/14.
 */

public class ContentResult {


    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"cid":"22048512","cname":"第一章 古界","id":"124227","ret_code":0,"txt":"上古世界，昏天黑地，可依旧有人类坚强生活，......."}
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
         * cid : 22048512
         * cname : 第一章 古界
         * id : 124227
         * ret_code : 0
         * txt : 上古世界，昏天黑地，可依旧有人类坚强生活，.......
         */

        private String cid;
        private String cname;
        private String id;
        private int ret_code;
        private String txt;

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }
}
