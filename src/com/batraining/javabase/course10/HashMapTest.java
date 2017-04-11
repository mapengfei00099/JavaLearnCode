package com.batraining.javabase.course10;

import java.util.*;

/**
 * Created by pengfei on 2017/4/9.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("xupt","西安邮电大学");
        map.put("sust","陕西科技大学");
        map.put("sutp","陕西理工大学");

        System.out.println(map.get("xupt"));
        //是否包含制定的key值
        System.out.println(map.containsKey("xupt"));
        System.out.println(map.containsValue("西安邮电大学"));
        map.remove("sutp");
        Set keySet = map.keySet();
        Iterator iterator =  keySet.iterator();
        while (iterator.hasNext()){
            String key =(String) iterator.next();
            System.out.println(key + "对应的学校名是：" + map.get(key));
        }
        //Collection 的实现类及其子类都是支持使用foreach 写法
        Collection values = map.values();//获取map 所有的values
        for (Object value : values) {
            System.out.println(value);
        }

        //Map下的Entry 接口可以认为是key，value的一个抽象
       Set<Map.Entry>   set =  map.entrySet();
        for (Map.Entry temp: set) {
            System.out.println(temp.getKey() +"-" + temp.getValue());
        }


    }
}
