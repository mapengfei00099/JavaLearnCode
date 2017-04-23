package com.batraining.javabase.course12;

import java.util.*;

/**
 * Created by pengfei on 2017/4/23.
 */
public class CaipiaoTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        Random random = new Random();
        while (set.size() != 6) {
            set.add(random.nextInt(16));
        }
        System.out.println(set);
        int count = 0;
        List<Integer> userInputs = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (userInputs.size() < 6) {
            int tempUserInput = scanner.nextInt();
            if (!userInputs.contains(tempUserInput)) {
                userInputs.add(tempUserInput);
                if (set.contains(tempUserInput)) {
                    count++;
                }
            } else {
                System.out.println("你的输入重复，请重新输入");
            }

        }
        String name = "";
        if (count < 3) {
            name = "没有中奖";
        } else if (count == 3) {
            name = "三等奖";
        } else if (count == 4) {
            name = "四等奖";
        } else if (count == 5) {
            name = "四等奖";
        } else if (count == 6) {
            name = "特等奖";
        }

        if (name.equals("没有中奖")) {
            System.out.println("你的号码是" + userInputs + "没有中奖");

        } else {
            System.out.println("你的号码是" + userInputs + "中了" + name + ",恭喜你！");
        }
    }


}
