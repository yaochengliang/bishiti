/**
 * 判断字符串是否包含重复字符，空格也视为一个字符
 */
package array;

import java.util.Arrays;

public class IsStringRepeat {

    /**
     * 假设字符串只有ASCII码，字符最多256个
     * @param str
     */
    private static boolean isStringRepeatAsc(String str){
        if (str.length() > 256){
            return false;
        }

        int[] strCount = new int[256];
        for (int i = 0; i< str.length(); i++) {
            int asc_index = (int)str.charAt(i);
            if (strCount[asc_index] != 0){
                return false;
            }
            strCount[asc_index] += 1;
        }
        return true;
    }

    /**
     * 假设字符串时unicode码，字符串很多，无法通过长度判断
     * @param str
     */
    private static boolean isStringRepeatUnicode(String str){
        if (null == str || "" == str){
            return false;
        }

        for (int i=0; i<str.length()-1;i++){
            for (int j=i+1;j<str.length();j++){
                if (str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

    /**
     *
     * @param str
     * @return
     */
    private static boolean isStringRepeatUnicode2(String str){
        if (null == str || "" == str){
            return false;
        }
        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);

        for (int i=0;i<strArray.length-1;i++){
            if (strArray[i] == strArray[i+1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        boolean result = isStringRepeatAsc("123456789 ert");
        boolean result = isStringRepeatUnicode2("123 ewq");
        System.out.println(result);
    }
}
