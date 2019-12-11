package com.chinasoftware.aboutobjectlist;

/**
 * CustomizeBilateralLinkedList:自定义双向链表集合
 * 【八阿哥---不想改】：按值查找，删除，修改时只能修改到第一个出现的那个，改进思路：重载该方法，添加一个表示出现次数的参数
 * 【修改】：已重载查找时
 * @author: DX
 * @date: 2019/12/5 11:25
 */
public class CustomizeBilateralLinkedList {
    /**
     * 内部类：双向节点类
     */
    private static class Node{
        /**
         * 前驱
         */
        Node pre;
        /**
         * 节点值
         */
        Object object;
        /**
         * 后继
         */
        Node next;

        /**
         * 构造 有参
         * @param pre 前驱
         * @param object 当前节点值
         * @param next 后继
         */
        Node(Node pre, Object object, Node next) {
            this.pre = pre;
            this.object = object;
            this.next = next;
        }
    }

    /**
     * 头节点
     */
    private Node firstNode;
    /**
     * 尾节点
     */
    private Node lastNode;

    /**
     * ---------构造-----------
     * 构建带头节点尾节点的链表
     * 头节点前驱尾NULL
     * 头节点后继指向尾节点
     * 尾节点前驱为头节点
     * 尾节点后继为NULL
     */
    public CustomizeBilateralLinkedList() {
        this.firstNode= new Node(null,"head",null);
        this.lastNode = new Node(null,"tail",null);
        firstNode.next=lastNode;
        lastNode.pre=firstNode;
    }

    /**
     * -----------------尾插--------------------
     * 尾插：每次插入元素在链表尾部（尾节点之前）
     * 将要插入节点的前驱指向尾节点的前驱节点
     * 将要插入节点的后继指向尾节点
     * 将尾节点的前驱节点的后继指向当前节点
     * 将尾节点的前驱指向当前节点
     * @param object 插入元素
     */
    public void addAfterHead(Object object){
        //将当前值加入到节点
        Node currentNode = new Node(null,object,null);
        //让当前节点的前驱指向最后节点前驱,当前节点的后继指向尾节点
        currentNode.pre = lastNode.pre;
        currentNode.next = lastNode;
        //断开尾节点和其前驱，并将尾节点的前驱节点的后继指向当前节点，尾节点的前驱指向当前节点
        lastNode.pre.next=currentNode;
        lastNode.pre = currentNode;

    }

    /**
     * -----------------头插----------------------
     * 头插：每次插入节点在链表头部（在头节点之后）
     * 当前节点的前驱指向头节点，后继指向头节点的后继节点
     * 头节点的后继节点的前驱指向当前节点
     * 头节点的后继指向当前节点
     * @param object 插的入元素
     */
    public void addBeforeTail(Object object){
        //将当前值加入到节点
        Node currentNode = new Node(null,object,null);
        //让当前节点的后继指向头节点的后继
        currentNode.next = firstNode.next;
        //找到首节点的前一个节点，让其前驱指向当前插入节点
        firstNode.next.pre=currentNode;
        //断开首节点，将其接到当前节前，完成一次头部插入
        firstNode.next=currentNode;
        currentNode.pre=firstNode;
    }

    /**
     * 找到相等节点 并返回起位置索引
     * @param object 要找的值
     * @param node 当前节点
     * @param index 当前节点的索引
     * @return 当前节点索引
     */
    private int  nodeEqual(Object object,Node node, int index){
        while (!node.object.equals(object)){
            node = node.next;
            if (node.next==null){
                System.out.println("没找到该值，请检查！");
                return -1;
            }
            index++;
        }
        return index;
    }

    /**
     *查找（通过值）只能找到第一个
     * 根据节点值来找节点位置索引 0 开始
     * 将头节点的后继节点放到node节点中
     * 定义 计数器 index
     * 比较node节点值与要查找的值
     * 如果不等 计数器自加，如果越界 返回 -1
     * 如果相等 返回计数器的值
     * @param object 要找的节点值
     * @return 节点索引（0 开始）
     */
    public int  getIndex(Object object){
        Node node = firstNode.next;
        int index =0;
        index=nodeEqual(object,node,index);
        return index;
    }

    /**
     * 查找第 i 次出现的Object
     * @param object 查找值
     * @param i 出现次数 1 开始
     * @return 出现的位置索引 0 开始
     */
    public int getIndex(Object object,int i){
        Node node = firstNode.next;
        int index =0;
        int count =0;
        while (count<i){
            index=nodeEqual(object,node,index);
            node=node.next;

            count++;
        }
        return index;
    }

    /**
     * -----------查找（索引）-----------
     * @param index 索引
     * @return 节点值
     */
    public Node getNode(int index){
        Node node = firstNode.next;
        //寻找到后继与要删除的节点相等的节点
        for(int i=0;i<index;i++){
            node=node.next;
            if (node.next == null){
                System.out.println("没找到该值！");
                return null;
            }
        }
        return node;
    }



    /**
     * ----------获取长度---------
     * @return 链表长度
     */
    public int getLength(){
        Node node = firstNode.next;
        int index =0;
        while (node.next !=lastNode){
            node = node.next;
            index++;
        }
        return index+1;
    }


    public void modify(int index,Object object){
        if(index<0||index>=getLength()){
            System.out.println("范围不正确，无法修改");
            return;
        }else {
            getNode(index).object=object;
        }
    }


    /**
     * ---------删除（值）-----------
     * 根据内容删除节点
     * @param object 节点内容
     */
    public void remove(Object object){
        Node node = firstNode.next;
        //寻找到后继与要删除的节点相等的节点
        while (!node.object.equals(object)){
            node = node.next;
            if (node.next==null){
                System.out.println("没找到该值，请检查！");
                return;
            }
        }
        node.pre.next = node.next;
        node.next.pre=node.pre;
    }

    /**
     * ------------删除（索引）------------
     * 通过序号删除节点
     * @param index 索引 0 开始，不含头节点
     */
    public void remove(int index){
        Node node = firstNode.next;
        //寻找到后继与要删除的节点相等的节点
        for(int i=1;i<index;i++){
            node=node.next;
            if (node.next == null){
                return;
            }
        }
        node.pre.next = node.next;
        node.next.pre=node.pre;
    }

    /**
     * 输出当前linkedList
     * @return String
     */
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LinkList<object>={["+firstNode.object+"]-->");
        Node currentNode = firstNode.next;
        while (currentNode.next!=null){
            stringBuilder.append("["+currentNode.object+","+currentNode.object.getClass().toString().substring(currentNode.object.getClass().toString().lastIndexOf(".")+1)+"]-->");
            currentNode = currentNode.next;
        }
        stringBuilder.append("["+lastNode.object+"]};");
        return stringBuilder.toString();
    }
}
