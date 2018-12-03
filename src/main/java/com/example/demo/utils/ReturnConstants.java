package com.example.demo.utils;

/**
 * @program: demo
 * @description:返回参数常量类
 * @author: Hailong
 * @create: 2018-11-23 14:49
 **/
public class ReturnConstants {
    //成功
    public static final String SUCCESS = "SUCCESS";

    //系统异常
    public static final String ERROR = "ERROR";


    /**
     * 请求参数
     */
    //请求非法
    public static final String REQUEST_ERROR = "REQUEST_ERROR";

    //请求参数错误
    public static final String REQUEST_PARAM_ERROR = "REQUEST_PARAM_ERROR";

    //INTERFACECODE非法
    public static final String REQUEST_INTERFACECODE_ILLEGAL = "REQUEST_INTERFACECODE_ILLEGAL";

    //APPID非法
    public static final String REQUEST_APPID_ILLEGAL = "REQUEST_APPID_ILLEGAL";

    //content非法
    public static final String REQUEST_CONTENT_ILLEGAL = "REQUEST_CONTENT_ILLEGAL";

    //请求包含不允许的特殊字符，请仔细检查
    public static final String REQUEST_SPECAL_PARAM = "REQUEST_SPECAL_PARAM";

    //dataExchangeId已存在
    public static final String REQUEST_EXCHANGEID_CONFlICT = "REQUEST_EXCHANGEID_CONFlICT";

    /**
     * 发票查询及订单查询功能相关
     */
    //没有订单
    public static final String NO_ORDER = "NO_ORDER";

    //没有对应的商品信息
    public static final String NO_COMMODITY = "NO_COMMODITY";

    //未查询到列表
    public static final String NO_LIST = "NO_LIST";

    //没有查询到红票
    public static final String NO_RED_INVOICE = "NO_RED_INVOICE";

    //红冲时不存在原蓝票
    public static final String NO_BLUE_INVOICE = "NO_BLUE_INVOICE";

    //没有销售方信息
    public static final String NO_SELLER_INFO = "NO_SELLER_INFO";

    /**
     * 参数解析异常
     */

    //数据不正确
    public static final String PARAM_ERROR = "PARAM_ERROR";

    //金额参数错误
    public static final String PARAM_MONEY = "PARAM_MONEY";

    //金额计算错误
    public static final String PARAM_MONEY_CALCULATE = "PARAM_MONEY_CALCULATE";

    //邮箱格式不正确
    public static final String PARAM_EMAIL_FORMAT = "PARAM_EMAIL_FORMAT";

    //手机号码格式不正确
    public static final String PARAM_PHONE_FORMAT = "PARAM_PHONE_FORMAT";

    //emd编号不能为空
    public static final String PARAM_NO_EMD = "PARAM_NO_EMD";

    //购买方纳税人识别号含有特殊字符
    public static final String PARAM_GMF_NSRSBH_FORMAT = "PARAM_GMF_NSRSBH_FORMAT";

    //购买方纳税人识别号长度非法
    public static final String PARAM_GMF_NSRSBH_LENGTH = "PARAM_GMF_NSRSBH_LENGTH";

    //购买方名称含有特殊字符
    public static final String PARAM_GMF_MC_FORMAT = "PARAM_GMF_MC_FORMAT";

    //购买方名称长度不能超过100
    public static final String PARAM_GMF_MC_LENGTH = "PARAM_GMF_MC_LENGTH";

    //购买方地址电话长度不能超过100
    public static final String PARAM_GMF_DZDH_LENGTH = "PARAM_GMF_DZDH_LENGTH";

    //购买方银行账号长度不能超过100
    public static final String PARAM_GMF_YHZH_LENGTH = "PARAM_GMF_YHZH_LENGTH";

    //发票流水号长度不能超过18位
    public static final String PARAM_LSH_LENGTH = "PARAM_LSH_LENGTH";

    //购货方单位名称长度不超过100
    public static final String PARAM_GHF_LENGTH = "PARAM_GHF_LENGTH";

    //购货方单位名称不能为空
    public static final String PARAM_GHF_NULL = "PARAM_GHF_NULL";
    //复核人长度不能超过8位
    public static final String PARAM_FHR_LENGTH = "PARAM_FHR_LENGTH";

    //收款人长度不能超过8位
    public static final String PARAM_SKR_LENGTH = "PARAM_SKR_LENGTH";

    //开票人长度不能超过8位
    public static final String PARAM_KPR_LENGTH = "PARAM_KPR_LENGTH";

    //备注长度不能超过160
    public static final String PARAM_BZ_LENGTH = "PARAM_BZ_LENGTH";

    //数据被锁定，无法修改
    public static final String PARAM_ORDER_LOCK = "PARAM_ORDER_LOCK";

    //订单已开票，无法修改
    public static final String PARAM_ORDER_INVOICED = "PARAM_ORDER_INVOICED";
    //原发票代码长度是10
    public static final String  PARAM_LENGTH_YFPDM  = "PARAM_LENGTH_YFPDM";
    //原发票代码长度是8
    public static final String  PARAM_LENGTH_YFPHM  = "PARAM_LENGTH_YFPHM";
    //红字信息编号的长度是16
    public static final String  PARAM_LENGTH_HZXXBH  = "PARAM_LENGTH_HZXXBH";
    //申请单号的长度是24
    public static final String  PARAM_LENGTH_SQDH  = "PARAM_LENGTH_SQDH";

    /**
     * 开票相关提示代码
     */
    //红票不能红冲
    public static final String INVOICE_IS_RED = "INVOICE_IS_RED";

    //已红冲的票不能红冲
    public static final String INVOICE_HAS_RED = "INVOICE_HAS_RED";

    //流水号重复
    public static final String INVOICE_FPQQLSH_REPEAT = "INVOICE_FPQQLSH_REPEAT";

    //未填写邮箱
    public static final String INVOICE_NO_EMAIL = "INVOICE_NO_EMAIL";

    //请求税控异常代码
    public static final String INVOICE_SK_ERROR = "INVOICE_SK_ERROR";

    //开票运行异常编码
    public static final String INVOICE_RUNTIME_ERROR = "INVOICE_RUNTIME_ERROR";

    //业务处理失败代码
    public static final String INVOICE_BUSINESS_ERROR = "INVOICE_BUSINESS_ERROR";

    //待开数据上传业务编号冲突
    public static final String INVOICE_CONFLICT_YWBH = "INVOICE_CONFLICT_YWBH";

    //待开数据上传发票请求流水号已存在
    public static final String INVOICE_CONFLICT_FPQQLSH = "INVOICE_CONFLICT_FPQQLSH";

    //未传入开票类型
    public static final String INVOICE_NO_FPLX = "INVOICE_NO_FPLX";

    //开票类型非法
    public static final String INVOICE_FPLX_ILLEGAL = "INVOICE_FPLX_ILLEGAL";

    //请传入正确的发票明细
    public static final String INVOICE_FPMX_ERROR = "INVOICE_FPMX_ERROR";

    //未找到该销售方信息
    public static final String INVOICE_NO_SELLER_INFO = "INVOICE_NO_SELLER_INFO";

    //流水号中包含特殊字符
    public static final String INVOICE_FPQQLSH_FORMAT = "INVOICE_FPQQLSH_FORMAT";

    //业务编号重复
    public static final String INVOICE_YWBH_REPEAT = "INVOICE_YWBH_REPEAT";

    //明细必填项不能为空
    public static final String INVOICE_NO_FPMX = "INVOICE_NO_FPMX";
    //填开日期不能为空
    public static final String PARAM_NO_TKRQ = "PARAM_NO_TKRQ";
    //纳税人编号不能为空
    public static final String PARAM_NO_NSRSBH = "PARAM_NO_NSRSBH";
    //信息表编号不能为空
    public static  final  String PARAM_XXBH_NULL = "PARAM_XXBH_NULL";
    //开票终端代码不能为空
    public static final String PARAM_NO_KPZDDM = "PARAM_NO_KPZDDM";
   //联系方式不能为空
    public static final String PARAM_NO_LXFS = "PARAM_NO_LXFS";
    //购货单位识别号不能为空
    public static final String PARAM_NO_GHDWSBH = "PARAM_NO_GHDWSBH";
    //购货单位名称不能为空
    public static final String PARAM_NO_GHDWMC = "PARAM_NO_GHDWMC";


    //销货单位名称不能为空
    public static final String PARAM_XXFMC_NULL = "PARAM_XXFMC_NULL";
    //未找到商品
    public static final String INVOICE_NO_COMMODITY  = "INVOICE_NO_COMMODITY";

    //商品信息不合法
    public static final String INVOICE_COMMODITY_ERROR  = "INVOICE_COMMODITY_ERROR";

    //未找到该销方用户的appid和appkey
    public static final String INVOICE_NO_APP_INFO = "INVOICE_NO_APP_INFO";

    //开票入参存在不合法数据
    public static final String INVOICE_ERROR_PARAM = "INVOICE_ERROR_PARAM";

    //发票流水号为空
    public static final String NO_FPQQLSH = "NO_FPQQLSH";

    //发票流水号不能超过20位
    public static final String PARAM_FPQQLSH_LENGTH_WEBSERVICE = "PARAM_FPQQLSH_LENGTH_WEBSERVICE";

    //原发票不存在
    public static final String NO_OLD_INVOICE = "NO_OLD_INVOICE";

    //系统中不存在此来源系统数值
    public static final String NO_LYXT_CODE = "NO_LYXT_CODE";

    //系统中不存在此业务类型数值
    public static final String NO_YWLX_CODE = "NO_YWLX_CODE";

    //业务类型包含特殊字符
    public static final String YWLX_FORMAT_CODE = "YWLX_FORMAT_CODE";

    //商品编码长度1-30位
    public static final String SPBM_LENGTH_CODE = "SPBM_LENGTH_CODE";

    //商品名称长度不能超过90位
    public static final String XMMC_LENGTH_CODE = "XMMC_LENGTH_CODE";

    //单位长度不能超过20位
    public static final String DW_LENGTH_CODE = "DW_LENGTH_CODE";

    //单位长度不能超过20位
    public static final String GGXH_LENGTH_CODE = "GGXH_LENGTH_CODE";

    //没有邮箱
    public static final String PARAM_NO_YX = "PARAM_NO_YX";

    //项目数量不正确
    public static final String PARAM_XMSL_TYPE_ILLEGAL = "PARAM_XMSL_TYPE_ILLEGAL";

    //项目单价不正确
    public static final String PARAM_XMDJ_TYPE_ILLEGAL = "PARAM_XMDJ_TYPE_ILLEGAL";

    //项目单价和项目数量必须同时填写
    public static final String PARAM_XMDJ_XMSL_MUST_TOGETHER = "PARAM_XMDJ_XMSL_MUST_TOGETHER";

    //项目金额为空
    public static final String PARAM_NO_XMJE = "PARAM_NO_XMJE";

    //项目金额不正确
    public static final String PARAM_XMJE_TYPE_ILLEGAL = "PARAM_XMJE_TYPE_ILLEGAL";

    //税率不正确
    public static final String PARAM_SL_TYPE_ILLEGAL = "PARAM_SL_TYPE_ILLEGAL";

    //税额不正确
    public static final String PARAM_SE_TYPE_ILLEGAL = "PARAM_SE_TYPE_ILLEGAL";

    //项目单价乘以项目数量不等于项目金额
    public static final String PARAM_XMDJ_MULTI_XMSL_NOEQUAL_XMJE = "PARAM_XMDJ_MULTI_XMSL_NOEQUAL_XMJE";

    //序号为空
    public static final String PARAM_XH_EMPTY = "PARAM_XH_EMPTY";

    //购买方名称不能为空
    public static final String PARAM_NO_GMF_MC = "PARAM_NO_GMF_MC";

    //开票人不能为空
    public static final String PARAM_NO_KPR = "PARAM_NO_KPR";

    //项目名称不能为空
    public static final String PARAM_NO_XMMC = "PARAM_NO_XMMC";

    //税率不能为空
    public static final String PARAM_NO_SL = "PARAM_NO_SL";

    //税额不能为空
    public static final String PARAM_NO_SE = "PARAM_NO_SE";

    //业务类型不正确
    public static final String PARAM_YWLX_INCORRENT = "PARAM_YWLX_INCORRENT";

    //业务类型不正确
    public static final String PARAM_YWBH_INCORRENT = "PARAM_YWBH_INCORRENT";

    //业务类型和业务编号重复
    public static final String PARAM_YWLX_YWBH_REPEAT = "PARAM_YWLX_YWBH_REPEAT";

    //上传的excel里无数据
    public static final String EXCEL_NO_DATA = "EXCEL_NO_DATA";

    //商品编号不正确
    public static final String PARAM_SPBH_INCORRENT = "PARAM_SPBH_INCORRENT";

    //商品编码不正确
    public static final String PARAM_SPSSBM_INCORRENT = "PARAM_SPSSBM_INCORRENT";

    //项目名称和商品编码不匹配
    public static final String PARAM_XMMC_SPBM_MISMATCH = "PARAM_XMMC_SPBM_MISMATCH";

    //税率和商品编码不匹配
    public static final String PARAM_SL_SPBM_MISMATCH = "PARAM_SL_SPBM_MISMATCH";

    //发票类型为空
    public static final String PARAM_NO_FPLX = "PARAM_NO_FPLX";

    //发票类型不正确
    public static final String PARAM_FPLX_INCORRENT = "PARAM_FPLX_INCORRENT";

    //发票类型为普票或专票时，流水号不能为空
    public static final String PARAM_NO_LSH_FPLX_NOT_DP = "PARAM_NO_LSH_FPLX_NOT_DP";

    //该条待开信息不能更新或删除
    public static final String INVOICE_PRE_CANNOT_OPERATE = "INVOICE_PRE_CANNOT_OPERATE";


}