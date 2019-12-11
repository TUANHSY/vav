package com.leetcode.recursive;

/**
 * @author: DX
 * @date: 2019/12/4 18:52
 */
public class Solution {

    public void reverseStr(char[] chars){
        reverseStr(chars,chars.length);
    }

    /**
     * 字符串反转
     * @param chars 字符串数组
     * @param length 要反转的字符串部分长度
     */

    public void reverseStr(char[] chars,int length){
        char temp = chars[0];
        for (int i=0;i<=length-1;i++){
            if (i<length-1){
                chars[i]=chars[i+1];
            }else {
                chars[i]=temp;
            }
        }
        if (length==1){
            return;
        }
        length--;
        reverseStr(chars,length);
    }
}
