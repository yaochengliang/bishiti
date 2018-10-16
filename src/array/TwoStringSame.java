/**
 * 两个字符串，判断一个字符串经过变换后是否可以和另一个相同
 */
package array;

import java.util.Arrays;

public class TwoStringSame {

    /**
     * 判断方法1，排序后两个字符串相等
     * @param str1
     * @param str2
     * @return boolean
     */
    public static boolean isTwooStringSame(String str1,String str2){
        if (null == str1 && null == str2){
            return true;
        }

        if ("" == str1 && "" == str2){
            return true;
        }

        if (str1.length() != str2.length()){
            return false;
        }

        char[] str1Char = str1.toCharArray();
        Arrays.sort(str1Char);
        char[] str2Char = str2.toCharArray();
        Arrays.sort(str2Char);

        if (!Arrays.equals(str1Char,str2Char)){
            return false;
        }

        return true;
    }

    /**
     * 统计每个字符的出现次数，查看是否相等
      * @param str1
     * @param str2
     * @return
     */
    public static boolean isTwooStringSame2(String str1,String str2){
        if (null == str1 && null == str2){
            return true;
        }

        if ("" == str1 && "" == str2){
            return true;
        }

        if (str1.length() != str2.length()){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isTwooStringSame("hello world","world hello"));
    }
}
