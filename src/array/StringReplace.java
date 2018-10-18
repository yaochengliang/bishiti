/**
 * 将字符串中的空格全部替换为"20%"
 * 使用数组操作，以便直接对字符串操作
 */
package array;

public class StringReplace {

    /**
     * 算法进行两次扫描，如果知道字符串数组够长的话，第一次扫描出共有多少个空格字符，计算需要新增多少空间
     * 第二次扫描反向编辑字符串数组，从后向前移动数组，这样移动的数据最少
     *
     * 这里新建一个数组复制数据
     * @param str
     * @return
     */
    public static String changeString(String str){
        char[] strChar = str.toCharArray();
        int length = strChar.length;
        int spaceCount = 0,newLength,i;

        for (i = 0; i < length; i++){
            if (' ' == strChar[i]){
                spaceCount ++ ;
            }
        }

        newLength = length + spaceCount * 2;//原来空格占据一个空间，只需要多2个
        char[] strNew = new char[newLength];

        for (i=length-1;i>=0;i--){
            if (strChar[i] == ' '){
                strNew[--newLength] = '0';
                strNew[--newLength] = '2';
                strNew[--newLength] = '%';
            } else {
               strNew[--newLength] = strChar[i];
            }
        }


        return String.valueOf(strNew);
    }

    public static void main(String[] args) {
        System.out.println(changeString("hello world "));
    }
}
