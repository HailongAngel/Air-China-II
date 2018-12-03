package com.example.demo.utils;

import java.util.ResourceBundle;

/**
 * @program: demo
 * @description:
 * @author: Hailong
 * @create: 2018-11-13 14:32
 **/
public class RetMessageUtils {
    //返回数据成功
    public final static  String SUCCESS = "0000";

    //抛出异常
    public final static String EXCEPTION = "1111";

    //查询参数为空
    public final static String ERROR_QERUEST_PARAM = "9001";

    //没有查询到发票
    public final static String NO_LIST = "9012";
    //邮件发送异常
    public final static String  SEND_EXCEPTION= "9005";

    //添加/修改用户 参数验证相关提示
    public final static String USERNAME_INCORRENT = "5001";
    public final static String PASSWORD_INCORRENT = "5002";
    public final static String REALNAME_INCORRENT = "5003";
    public final static String PHONE_INCONRRENT = "5004";
    public final static String EMAIL_INCONRRENT = "5005";
    public static final String JG_ID_EMPTY = "5006";
    public static final String USER_STATUS_INCONRRENT = "5007";
    public static final String USER_GSD_ZRZXD_REPEAT = "5008";

    public final static String USERNAME_USED = "5009";
    public final static String ROLENAME_INCORRENT = "5010";
    public final static String INFO_TOO_LONG = "5011";
    public static final Object USER_NO_JG = "5012";

    public final static String USER_NON_EXISTENT = "5032";
    public final static String ROLE_NON_EXISTENT = "5033";
    public final static String USERNAME_PASSWORD_INCORRENT = "5034";
    public final static String FORBID_DISABLED_DELETE_USER = "5035";
    public final static String ACCOUNT_FORBIDDEN = "5036";
    public final static String ROLE_NAME_USED = "5037";
    public static final String PASSWORD_USED = "5038";
    public static final String ACCOUNT_LOCKED = "5039";
    public static final String ROLE_RELATION_USER = "5040";
    public static final String JG_CANNOT_ADD_USER = "5041";

    //删除组织 错误提示
    public static final String ZZ_ORGANIZATION_HAS_CHILD = "5061";
    public static final String ZZ_ORGANIZATION_HAS_PEOPLE = "5062";
    public static final String ZZ_ORGANIZATION_CANNOT_DELETE = "5063";

    //添加/修改组织 参数验证相关提示
    public static final String ZZ_BM_CANNOT_ADD_JG = "5070";
    public static final String ZZ_ORGANIZATION_CJ_TOO_DEPTH = "5071";
    public static final String ZZ_XFDM_INCORRENT = "5072";
    public static final String ZZ_XFDM_USED = "5073";
    public static final String ZZ_MC_INCORRENT = "5074";
    public static final String ZZ_MC_USED = "5075";
    public static final String ZZ_NSRSBH_INCORRENT = "5076";
    public static final String ZZ_NSRSBH_USED = "5077";
    public static final String ZZ_ZC_DZ_INCORRENT = "5078";
    public static final String ZZ_ZC_DZ_USED = "5079";
    public static final String ZZ_ZC_DH_INCORRENT = "5080";
    public static final String ZZ_ZC_DH_USED = "5081";
    public static final String ZZ_KHH_MC_INCORRENT = "5082";
    public static final String ZZ_KHH_ZH_INCORRENT = "5083";
    public static final String ZZ_KHH_ZH_USED = "5084";
    public static final String ZZ_GSD_INCORRENT = "5085";
    public static final String ZZ_GSD_USED = "5086";
    public static final String ZZ_ZRZXD_INCORRENT = "5087";
    public static final String ZZ_ZRZXD_USED = "5088";
    public static final String ZZ_KPZDBS_INCORRENT = "5089";
    public static final String ZZ_XE_INCORRENT = "5090";

    //审批管理
    public static final String SP_SQR_EMPTY = "5100";
    public static final String SP_YJSPR_EMPTY = "5101";
    public static final String SP_EJSPR_EMPTY = "5102";
    public static final String SP_KPR_EMPTY = "5103";
    public static final String SP_WRONG_PARAM = "5104";
    public static final String SP_SQR_JG_REPEAT = "5105";

    //商品信息
    public static final String SP_BH_INCORRENT = "5110";
    public static final String SP_BH_USED = "5111";
    public static final String SP_MC_INCORRENT = "5112";
    public static final String SP_SSBM_INCORRENT = "5113";
    public static final String SP_SL_INCORRENT = "5114";
    public static final String SP_YHZCBS_INCORRENT = "5115";
    public static final String SP_SKFPLX_INCORRENT = "5116";
    public static final String SP_USE_FLAG_INCORRENT = "5117";
    public static final String SP_LSLBS_INCORRENT = "5118";
    public static final String SP_LSLBS_SL_INCORRENT = "5119";
    public static final String SP_YHZCBS_LSLBS_INCORRENT = "5120";

    //客户信息
    public static final String KH_BH_INCORRENT= "5130";
    public static final String KH_MC_INCORRENT = "5131";
    public static final String KH_SH_INCORRENT = "5132";
    public static final String KH_SH_USED = "5133";
    public static final String KH_DZDH_INCORRENT = "5134";
    public static final String KH_YHZH_INCORRENT = "5135";
    public static final String KH_BZ_INCORRENT = "5136";
    public static final String KH_BH_USED = "5137";

    public final static String PARAM_INCONRRENT = "5970";
    public final static String PARAM_VALUE_INCONRRENT = "5971";
    public static final String PARAM_NO_FILE = "5980";
    public static final String NONSUPPORT_FILE_TYPE = "5981";
    public static final String EXCEL_NO_DATA = "5982";
    public static final String EXCEL_DATA_INCORRENT = "5983";
    public static final String NO_AUTH_OPERATION = "5989";
    public static final String NO_AUTH = "5990";
    public final static String NO_LOGIN = "5999";


    private static ResourceBundle resource = ResourceBundle.getBundle("message");

    /**
     * 获得资源
     *
     * @param messageKey 消息key
     * @return 消息内容
     */
    public static String getMessage(String messageKey)
    {
        return resource.getString(messageKey);
    }



    public static String getStackMsg(Exception e)
    {
        StackTraceElement[] stackArray = e.getStackTrace();
        if (stackArray != null && stackArray.length > 0)
        {
            StringBuffer stringBuffer;
            stringBuffer = new StringBuffer();
            for (StackTraceElement element : stackArray)
            {
                stringBuffer.append(element.toString());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }
        return "";
    }

}
