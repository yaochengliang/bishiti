/**
 * 字符串压缩，aaaabbcccddeaacdd 输出为a4b2c3d2e1a2c1d2，如果压缩后的字符串长度不小于原来字符串，则输出原来字符串
 */
package array;

public class CompactString {

    /**
     * 遍历一遍字符串，使用StringBuffer来存储数据，拼接字符串耗时
     * @param str
     * @return
     */
    public static String compactString(String str){
        if (null == str || " " == str){
            return str;
        }

        char[] strChar = str.toCharArray();
        int length = strChar.length;
        StringBuffer sb = new StringBuffer();
        int i = 0;
        char before = strChar[0];
        int count = 1;
        for(i = 1;i < length;i++){
            if (strChar[i] == before ){
                count ++;
            } else {
                sb.append(before);
                sb.append(count);
                count = 1;
                before = strChar[i];
            }
        }
        sb.append(before);
        sb.append(count);

        if (strChar.length <= sb.length()){
            return str;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compactString("aaaaaccccc"));
        System.out.println(compactString("abc"));
    }
}
