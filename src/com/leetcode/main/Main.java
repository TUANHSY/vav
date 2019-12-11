package com.leetcode.main;

import com.chinasoftware.aboutobjectlist.CustomizeBilateralLinkedList;
import com.leetcode.recursive.Solution;

/**
 * @author: DX
 * @date: 2019/12/4 18:54
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] chars = {'h','e','l','l','o','q','w'};
        for (char c : chars){
            System.out.print(c+" ");
        }
        solution.reverseStr(chars);
        System.out.println();
        for (char c : chars){
            System.out.print(c+" ");
        }
        System.out.println();

        CustomizeBilateralLinkedList list = new CustomizeBilateralLinkedList();
        list.addAfterHead("23");
        list.addAfterHead("23");
        list.addAfterHead("23");
        System.out.println(list.toString()+"\n"+list.getIndex("23"));
    }
}
