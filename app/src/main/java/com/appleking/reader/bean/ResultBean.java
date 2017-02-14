package com.appleking.reader.bean;

import java.util.List;

/**
 * Created by appleking on 2017/2/14.
 */

public class ResultBean {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"ret_code":0,"typeList":[{"id":"1","name":"玄 幻 魔 法"},{"id":"2","name":"武 侠 修 真"},{"id":"3","name":"现 代 都 市"},{"id":"4","name":"言 情 小 说"},{"id":"5","name":"历 史 军 事"},{"id":"6","name":"游 戏 竞 技"},{"id":"7","name":"科 幻 灵 异"},{"id":"8","name":"耽 美 小 说"},{"id":"9","name":"同 人 小 说"},{"id":"10","name":"其 他 类 型"}]}
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
         * ret_code : 0
         * typeList : [{"id":"1","name":"玄 幻 魔 法"},{"id":"2","name":"武 侠 修 真"},{"id":"3","name":"现 代 都 市"},{"id":"4","name":"言 情 小 说"},{"id":"5","name":"历 史 军 事"},{"id":"6","name":"游 戏 竞 技"},{"id":"7","name":"科 幻 灵 异"},{"id":"8","name":"耽 美 小 说"},{"id":"9","name":"同 人 小 说"},{"id":"10","name":"其 他 类 型"}]
         */

        private int ret_code;
        private List<TypeListBean> typeList;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public List<TypeListBean> getTypeList() {
            return typeList;
        }

        public void setTypeList(List<TypeListBean> typeList) {
            this.typeList = typeList;
        }

        public static class TypeListBean {
            /**
             * id : 1
             * name : 玄 幻 魔 法
             */

            private String id;
            private String name;

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
        }
    }
}
