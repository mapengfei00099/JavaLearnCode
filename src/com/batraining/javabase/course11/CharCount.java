package com.batraining.javabase.course11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharCount {
    public static void main(String[] args) {
        String str = "abccabafdafsgasdfgfdsffdasf";
        char[] charArr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : charArr) {
            Integer count = (Integer) map.get(c);
            //如果不为空，就代表已经放过字符及其数量，只需要在count 上加1 即可；
            if (count != null) {
                map.put(c, count + 1);
            } else {
                //首次放入字符及其数量
                map.put(c, 1);
            }

        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println("字符" + entry.getKey() + "出现了" + entry.getValue() + "次");
        }
    }
}
