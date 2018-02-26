package com.spider.gather.data.constants;

/**
 * 状态码
 * 
 * @author 豆芽菜橙
 *
 */
public enum SpiderStatusEnum {

        SUCCESS("5000", "成功"),
        FAILED("7000", "失败"),
        
        PARAM_ERROR("7001", "参数错误"),
        PARAM_NOT_NULL("7002", "参数不能为空");
        
        /**
         * 系统码
         */
        private String code;

        /**
         * 描述
         */
        private String desc;

        SpiderStatusEnum(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static SpiderStatusEnum getWebStatusEnumByKey(String key){
                for(SpiderStatusEnum bt : values()){
                        if(bt.getCode().equals(key) )
                                return bt;
                }
                return null;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
}
