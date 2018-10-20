/**
 * 将排好序的B插入排好序的A中，假设A后面有足够的空间位置容纳B
 */
package sort;

public class InsertBToA {

    /**
     *
     * @param strA
     * @param strB
     * @param lengthA A的已有数据长度，如果不提供这个数据就新建一个数组存储结果，没啥印象的
     * @return
     */
    public static int[] insertBtoA(int[] strA,int[] strB, int lengthA){
        int lengthB = strB.length;
        int length = lengthA + lengthB - 1;
        lengthA -- ;
        lengthB --;

        while (lengthB >= 0){
            if (lengthA < 0){
                strA[length] = strB[lengthB];
                lengthB -- ;
                length --;
            } else if (strB[lengthB] > strA[lengthA]){
                strA[length] = strB[lengthB];
                lengthB -- ;
                length --;
            } else {
                strA[length] = strA[lengthA];
                lengthA --;
                length --;
            }
        }

        return strA;
    }

    public static void main(String[] args) {
        int[] strA = new int[10];
        strA[0]=0;
        strA[1]=4;
        strA[2]=6;
        int[] strB = new int[]{1,3,5};
        int[] result = insertBtoA(strA,strB,3);

        //末尾的0代表空元素
        for (int re:result) {
            System.out.print(re + " ");
        }
    }
}
