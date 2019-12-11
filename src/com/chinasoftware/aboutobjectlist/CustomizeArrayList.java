package com.chinasoftware.aboutobjectlist;

/**
 * @author: DX
 * @date: 2019/12/5 11:25
 */
public class CustomizeArrayList {
    /**
     * obj数组
     */
    private Object[] objects;
    CustomizeArrayList(){
        objects = new Object[0];
    }

    /**
     * 增加object
     * @param o 增加内容
     */
    void add(Object o){
        Object[] objects1 = new Object[objects.length+1];
        for (int i=0;i<objects1.length;i++){
          if (i<objects.length){
                objects1[i]=objects[i];
            }else {
                objects1[i]=o;
            }
        }
        objects=objects1;
    }

    /**
     * 更改指定索引位置的值
     * @param index 更改的索引 int 从 0 开始
     * @param object 新的值
     */
    public void set(int index,Object object){
        for (int i=0;i<objects.length;i++){
            if (i==index){
                objects[i]=object;
            }
        }
    }

    /**
     * 获得特定索引位置的值
     * @param index 索引 int 从 0 开始
     * @return 返回值 Object
     */
    public Object get(int index){
        for (int i=0;i<objects.length;i++){
            if (i==index){
                return objects[i];
            }
        }
        return null;
    }

    /**
     * 删掉指定索引位置的值
     * @param index 索引int 0 开始
     */
    public void remove(int index){
        int length = objects.length;
        for (int i=0;i<objects.length;i++){
            if (i==index){
                i++;
                length--;
            }
        }
        Object[] objects1 = new Object[length];
        for (int i=0;i<objects1.length;i++){

            if (i<index){
                objects1[i]=objects[i];
            }else{
                objects1[i]=objects[i+1];
            }
        }
        objects=objects1;
    }
    @Override
    public String toString() {
        StringBuilder string =new StringBuilder();
        string.append("ArrayList<Object>={");
        for (Object object:objects){
            string.append("【"+object.getClass().toString().substring(object.getClass().toString().lastIndexOf(".")+1)+" , "+object.toString()+"】");
        }
        string.append("}");
        return string.toString();
    }
}
