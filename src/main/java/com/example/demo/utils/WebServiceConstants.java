package com.example.demo.utils;

/**
 * @program: demo
 * @description:
 * @author: Hailong
 * @create: 2018-11-13 15:02
 **/
public class WebServiceConstants {
    /**
     * 接口编号类
     */
    public static class InterfaceCode {

        /**
         * 发票开具
         */
        public static final String AIRCHINA1001 = "AIRCHINA1001";

        /**
         * 发票查询
         */
        public static final String AIRCHINA1002 = "AIRCHINA1002";

        /**
         * 板式文件下载
         */
        public static final String AIRCHINA1003 = "AIRCHINA1003";

        /**
         * 红冲通知
         */
        public static final String AIRCHINA1004 = "AIRCHINA1004";

        /**
         * 查询是否打印行程单
         */
        public static final String AIRCHINA1005 = "AIRCHINA1005";

        /**
         * EMD数据仓库查询
         */
        public static final String AIRCHINA1006 = "AIRCHINA1006";

        /**
         * 发票数据上传接口
         */
        public static final String AIRCHINA1007 = "AIRCHINA1007";

        /**
         * EMD数据状态变更
         */
        public static final String AIRCHINA1008 = "AIRCHINA1008";

        /**
         * 用户查询接口（国航之翼）
         */
        public static final String AIRCHINA1009 = "AIRCHINA1009";

        /**
         * 插卡数据查询接口
         */
        public static final String AIRCHINA1010 = "AIRCHINA1010";
    }

    /**
     * 返回参数类
     */
    public static class ResponseParam {

        /**
         * 返回码
         */
        public static final String RETURN_CODE = "returnCode";

        /**
         * 返回信息
         */
        public static final String RETURN_MESSAGE = "returnMessage";

        /**
         * 返回的contentMap（自定义）
         */
        public static final String CONTENT_MAP = "contentMap";


        /**
         * 查询结果返回的LIST_MAP
         */
        public static final String LIST_MAP = "LIST_MAP";


        /**
         * 返查询结果返回的COUNT
         */
        public static final String COUNT = "COUNT";



    }

    /**
     * 返回参数类
     */
    public static class ReturnCode {

        /**
         * 成功返回码
         */
        public static final String SUCCESS_CODE= "0000";

        /**
         * 成功返回消息
         */
        public static final String SUCCESS_MESSAGE= "成功";

        /**
         * 错误返回码
         */
        public static final String ERROR_CODE= "9999";

        /**
         * 错误返回消息
         */
        public static final String ERROR_MESSAGE= "错误";

        /**
         * 没有订单错误码
         */
        public static final String NO_SUCH_ORDER_CODE = "0011";

        /**
         * 没有订单错误信息
         */
        public static final String NO_SUCH_ORDER_MESSAGE = "没有该订单";

        //未查询到列表
        public final static String  NO_LIST= "9012";

        //未查询到列表错误描述
        public final static String  NO_LIST_message= "没有该发票";

        //没有查询到红票
        public final static String NO_REDLIST= "9013";

        //未查询到红票列表错误描述
        public final static String  NO_REDLIST_message= "没有该红票";

        /**
         * 数据不正确
         */
        public static final String WRONG_DATA_CODE = "9997";

        /**
         * 红冲时不存在原蓝票
         */
        public static final String NO_INVOICE_CODE = "8880";

        /**
         * 红票不能红冲
         */
        public static final String IS_RED_INVOICE_CODE = "8881";

        /**
         * 已红冲的票不能红冲
         */
        public static final String HAS_INVOICE_RED_CODE = "8882";

        /**
         * 流水号重复
         */
        public static final String FPQQLSH_REPEAT_CODE = "8883";

        /**
         * 没有销售方信息
         */
        public static final String NO_SELLER_INFO = "8884";

        /**
         * 未填写邮箱
         */
        public static final String NO_EMAIL_CODE = "8885";

        /**
         * 邮箱格式不正确
         */
        public static final String WRONG_EMAIL_FORMAT_CODE = "8886";

        /**
         * 数据不正确描述
         */
        public static final String WRONG_DATA_MESSAGE = "数据不正确";

        /**
         * 请求税控异常代码
         * */
        public static final String ERROR_SKSERVER_CODE = "9992";

        /**
         * 请求税控异常信息
         */
        public static final String ERROR_SKSERVER_MESSAGE = "请求税控异常";

        /**
         * 开票运行异常编码
         * */
        public static final String ERROR_INVOICE_RUNTIME_CODE = "9995";

        /**
         * 开票运行异常信息
         */
        public static final String ERROR_INVOICE_RUNTIME_MESSAGE = "开票运行异常";

        /**
         * 报文格式错误编码
         */
        public static final String ERROR_REQUEST_CODE = "9996";

        /**
         * 报文格式错误信息
         */
        public static final String ERROR_REQUEST_MESSAGE = "报文格式错误";

        /**
         * 业务处理失败代码
         */
        public static final String ERROR_BUSINESS_CODE = "9999";

        /**
         * 业务处理失败信息
         */
        public static final String ERROR_BUSINESS_MESSAGE = "业务处理失败";

        /**
         * 待开数据上传业务编号冲突代码
         */
        public static final String ERROR_CONFLICT_YWBH_CODE = "9951";

        /**
         * 待开数据上传业务编号冲突信息
         */
        public static final String ERROR_CONFLICT_YWBH_MESSAGE = "业务编号已存在";

        /**
         * 待开数据上传发票请求流水号已存在代码
         */
        public static final String ERROR_CONFLICT_FPQQLSH_CODE = "9952";

        /**
         * 待开数据上传发票请求流水号已存在信息
         */
        public static final String ERROR_CONFLICT_FPQQLSH_MESSAGE = "发票请求流水号已存在";

        /**
         * 请求非法代码
         */
        public static final String ERROR_ILLEGAL_REQUEST_CODE = "9001";

        /**
         * 请求非法信息
         */
        public static final String ERROR_ILLEGAL_REQUEST_MESSAGE = "请求非法";

        /**
         * INTERFACECODE非法代码
         */
        public static final String ERROR_ILLEGAL_INTERFACECODE_CODE = "9002";

        /**
         * INTERFACECODE非法信息
         */
        public static final String ERROR_ILLEGAL_INTERFACECODE_MESSAGE = "INTERFACECODE不合法";

        /**
         * APPID非法代码
         */
        public static final String ERROR_ILLEGAL_APPID_CODE = "9003";

        /**
         * APPID非法信息
         */
        public static final String ERROR_ILLEGAL_APPID_MESSAGE = "APPID不合法";

        /**
         * content非法代码
         */
        public static final String ERROR_ILLEGAL_CONTENT_CODE = "9004";

        /**
         * content非法信息
         */
        public static final String ERROR_ILLEGAL_CONTENT_MESSAGE = "请求content数据不合法";


    }

}
