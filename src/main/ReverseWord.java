package main;

/**
 * @author: DX
 * @date: 2019/11/25 10:49
 */
public class ReverseWord {

    /**
     * 对String进行反转
     * @param str 要转换的字符串
     * @return str 转换后的字符串
     */
    public static String  reserve(String str) {
        String [] strs = str.split("");
        for (int i=0,j=strs.length-1;i<=j;i++,j--){
           String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
        }
        str="";
        for (int i=0;i<strs.length;i++){
            str=str+strs[i];
        }
        return str;
    }

    /**
     * reserve应用：
     * * 寻找n以内的回文数
     * 比如 121  131 1221
     * @param n 【0-n】范围
     */
    public static void seekNumberOfTracts(int n){
        String[] strs = new String[n];
        for (int i=0,j=0;i<=n;i++,j++){
            if ( String.valueOf(i).equals(reserve(String.valueOf(i)))){
                strs[j]=String.valueOf(i);
            }
        }

        for (String st : strs){
            if (st!=null){
                System.out.println(st);
            }

        }
    }


}
