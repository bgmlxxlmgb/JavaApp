package common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10673 on 2017/12/21.
 */
public class StringReplaceTools {
    /**
     * 判断字符是否是中文
     *
     * @param c 字符
     * @return 是否是中文
     */
    public static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
                || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
            return true;
        }
        return false;
    }
    /**
     * 判断字符串是否是乱码
     *
     * @param strName 字符串
     * @return 是否是乱码
     */
    public static boolean isMessyCode(String strName) {
        Pattern p = Pattern.compile("\\s*|t*|r*|n*");
        Matcher m = p.matcher(strName);
        String after = m.replaceAll("");
        String temp = after.replaceAll("\\p{P}", "");
        char[] ch = temp.trim().toCharArray();
        float chLength = ch.length;
        float count = 0;
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (!Character.isLetterOrDigit(c)) {
                if (!isChinese(c)) {
                    count = count + 1;
                }
            }
        }
        float result = count / chLength;
        if (result > 0.4) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String args[]){
        //System.out.println(isMessyCode("Ã©Å¸Â©Ã©Â¡ÂºÃ¥Â¹Â³￤☆€*��JTP.jar�ļ����JTP�ļ���ȡ��ͼƬ��Դ你好123,<《"));
        System.out.println("Ã©Å¸Â©Ã©Â¡ÂºÃ¥Â¹Â³￤☆€*��JTP.jar�ļ����JTP�ļ���ȡ��ͼƬ��Դ你好123,<《".replaceAll("[^0-9a-zA-Z\\u4e00-\\u9fa5]+",""));
    }
}
