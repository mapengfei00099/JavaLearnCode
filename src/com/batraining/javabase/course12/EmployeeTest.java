package com.batraining.javabase.course12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by pengfei on 2017/4/23.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("张三", "男", 88907);
        Employee e2 = new Employee("李四", "男", 76895);
        Employee e3 = new Employee("王五", "男", 8900);
        Employee e4 = new Employee("周六", "男", 90000);
        Employee e5 = new Employee("赵七", "女", 79989);
        Map<String, Employee> map = new HashMap<String, Employee>();
        map.put(e1.getName(), e1);
        map.put(e2.getName(), e2);
        map.put(e3.getName(), e3);
        map.put(e4.getName(), e4);
        map.put(e5.getName(), e5);
        System.out.println("姓名\t性别\t销售额\t计提百分比\t奖金额\t");
        Set<Map.Entry<String, Employee>> set = map.entrySet();
        for (Map.Entry<String, Employee> temp : set) {
            String employeeName = temp.getKey();
            Employee employee = temp.getValue();
            int salePercent = 20;
            if (employee.getSales() > 80000) {
                salePercent = 25;
            }
            double cash = employee.getSales() * (salePercent * 1.0 / 100);
            System.out.println(employeeName + "\t" + employee.getSex() + "\t" + employee.getSales() + "\t" + salePercent + "%\t" + cash + "\t");
        }

    }
}
