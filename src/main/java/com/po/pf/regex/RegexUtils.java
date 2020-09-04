package com.po.pf.regex;

/**
 * @Auther wangzekun
 * @Date 2020/9/4 11:00
 * @Description 校验Authorization的值 防止恶意输入非法字符比如加入Peter\r\nHTTP/1.1
 */
public class RegexUtils {


    /**
     *
     * @param value
     * @return 过滤掉用户恶意输入的危险字符
     */
    public static String filterDangerString(String value) {
        if (value == null) {
            return null;
        }
        value = value.replaceAll("\\|", "");
        value = value.replaceAll("&", "&");
        value = value.replaceAll(";", "");
        value = value.replaceAll("@", "");
        value = value.replaceAll("\"", "");
        value = value.replaceAll("<", "<");
        value = value.replaceAll(">", ">");
        value = value.replaceAll("\\(", "");
        value = value.replaceAll("\\)", "");
        value = value.replaceAll("\\+", "");
        value = value.replaceAll("\r", "");
        value = value.replaceAll("\n", "");
        value = value.replaceAll("script", "");
        value = value.replaceAll("'", "");
        value = value.replaceAll("/", "");
        return value;
    }

}
