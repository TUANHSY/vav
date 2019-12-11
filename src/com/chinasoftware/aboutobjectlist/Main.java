package com.chinasoftware.aboutobjectlist;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义数组集合
 * @author: DX
 * @date: 2019/12/5 11:27
 */
public class Main {
    public static void main(String[] args) {
        CustomizeArrayList list = new CustomizeArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(233);
        list.add('s');
        System.out.println("原始数据："+list.toString()+"\nlist[0]=:"+list.get(0));
        list.set(0,"你好坏");
        System.out.println("修改数据："+list.toString()+"\nlist[0]=:"+list.get(0));
        list.remove(1);
        System.out.println("修改数据："+list.toString()+"\nlist[0]=:"+list.get(0));

        System.out.println("====================================================================================================");

        CustomizeBilateralLinkedList linkedList = new CustomizeBilateralLinkedList();
        linkedList.addAfterHead( "a");
        linkedList.addAfterHead( "b");
        linkedList.addAfterHead( "a");
        linkedList.addAfterHead( "d");
        linkedList.addBeforeTail("e");
        linkedList.addBeforeTail("f");
        linkedList.addBeforeTail(993);
        linkedList.addBeforeTail('a');
        linkedList.addBeforeTail("a");
        System.out.println(linkedList.toString());
//        linkedList.remove((Integer)3);
//        System.out.println(linkedList.toString());
//        linkedList.remove(3);
        System.out.println("长度："+linkedList.getLength());
        System.out.println(linkedList.getIndex("e",4));

        Map<Integer,String> map = new HashMap<>(0);
        map.put(1,"a");
        System.out.println(map.size()+"\n"+map.get(1));

    }
}

