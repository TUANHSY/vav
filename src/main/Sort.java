package main;

import java.util.Arrays;
import java.util.Queue;

/**
 * 各大排序算法
 * @author: DX
 * @date: 2019/11/27 10:57
 */
public class Sort{

    /**
     * 猴子排序--随机排序，只要次数够多总有一个是有序的，但是猴子会累死的
     * @param array 待排序数组
     */
    public static void monkeySort(int [] array){
        System.out.println(Arrays.toString(array));
        int count =0;
        int [] sort = new int[array.length];
        boolean flag = true;
        int [] index = random(array.length);
        while (flag){
            for (int j=0;j<index.length;j++){
                sort[j]= array[index[j]];
            }
            if (order(sort)==1){
                flag=false;
                System.out.println("============猴子共排序了"+count+"次==============");
                System.out.println(toString(sort));
            }
            index = random(array.length);

            if (count>99999999){
                flag=false;
                System.out.print("\n次数："+count+" 猴子累死了！");
            }
            count++;
        }

    }

    /**
     * 获取N个不重复的随机数
     * @param n 范围[0,N]
     * @return a[N]= 无序的{0,1,2,...N}
     */
    public static int[] random(int n) {
        int []a = new int[n];
        for (int i = 0; i < a.length; ++i) {
            while (true) {
                //生成[1,N]之间的一个随机数
                a[i] = (int) Math.floor(Math.random()*n)+1;
                int j = 0;
                for (; j < i; ++j) {
                    if (a[i] == a[j]) {
                        break;//如果这个随机数已经在前面出现过了,break,下一轮继续生成另一个随机数,直至a[i]与前面所有的数不同
                    }
                }
                if(j == i) {
                    //本次生成的a[i]在前面没有出现过, break while, i++,下一轮生成a[i+1]
                    break;
                }
            }
        }
        return a;
    }

    /**
     * 判断数组是否有序
     * @param num
     * @return 0：无序 1：升序 -1：降序
     */
    private static int order(int[] num){
        int j,k;
        int lenth=num.length;
        for(k=0,j=1;j<lenth;j++)
        {
            if(num[j]<num[j-1])
            {
                //第一次遇到不同的数，降
                if ( k == 0 )
                {
                    k=-1;
                    //如果当前是升序，则说明无序
                } else if ( k > 0 )
                {
                    return 0;
                }
            }
            else if(num[j]>num[j-1])
            {
                //第一次遇到不同的数，升
                if ( k == 0 )
                {
                    k=1;
                    //如果当前是降序，则说明无序
                } else if ( k < 0 )
                {
                    return 0;
                }
            }
        }
        //这里如果k=0,则说明数组是常数数组，元素全相同，返回1
        if ( k == 0 ) {
            k=1 ;
        }
        //升序返回1，降序返回-1
        return k ;
    }

    /**
     * 打印数组
     * @param array
     */
    private static void printArray(int[] array){
        System.out.println();
        for (int i: array){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static String toString(int[] a) {
        if (a == null) {
            return "null";
        }
        int iMax = a.length - 1;
        if (iMax == -1) {
            return "[]";
        }

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax) {
                return b.append(']').toString();
            }
            b.append("< ");
        }
    }
    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int []array){
        if (array==null){
            return;
        }
        System.out.println(Arrays.toString(array));
        for (int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if (order(array)==1){
                break;
            }
        }
        System.out.println(toString(array));
    }

    public static void selectionSort(int []array) {

    }

    public static void selectSort(int[] arr) {
        if(arr==null) {
            return;
        }
        System.out.println(Arrays.toString(arr));
        int len=arr.length;
        //i控制循环次数，长度为len的数组只需要循环len-1次，i的起始值为0所以i<len-1
        for(int i=0;i<len-1;i++) {
            //minIndex 用来保存每次比较后较小数的下标。
            int minIndex=i;
            //j控制比较次数，因为每次循环结束之后最小的数都已经放在了最前面，
            //所以下一次循环的时候就可以跳过这个数，所以j的初始值为i+1而不需要每次循环都从0开始，并且j<len即可
            for(int j=i+1;j<len;j++) {
                //每比较一次都需要将较小数的下标记录下来
                if(arr[minIndex]>arr[j]) {
                    minIndex=j;
                }
            }
            //当完成一次循环时，就需要将本次循环选取的最小数移动到本次循环开始的位置。
            if(minIndex!=i) {
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
            //打印每次循环结束之后数组的排序状态（方便理解）
//            System.out.println("第"+(i+1)+"次循环之后效果："+ Arrays.toString(arr));
        }
        System.out.println(toString(arr));
    }


}
