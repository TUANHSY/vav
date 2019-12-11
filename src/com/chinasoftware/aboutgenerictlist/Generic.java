package com.chinasoftware.aboutgenerictlist;

/**
 * @author: DX
 * @date: 2019/12/6 13:48
 */
public class Generic {
    public void getRandomArray(int n ,int k){
        CustomizeBilateralLinkedList linkedList = new CustomizeBilateralLinkedList();
        for (int i=1;i<=n;i++){
            linkedList.addAfterHead(i);
        }
        System.out.println(linkedList.toString());
        while (n>k){
            int x = (int) Math.floor(Math.random()*n)+1;
            System.out.print(x+" ");
            linkedList.remove(x);
            n--;
        }
        System.out.println();
        System.out.println(linkedList.toString());

    }
}
