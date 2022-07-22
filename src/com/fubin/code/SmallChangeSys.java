package com.fubin.code;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    public static void main(String[] args) {

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String shop = "";
        String choose = "";

        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        double money = 0;
        double balance = 0;

        String details = "--------------零钱明细--------------";
        String earnings = "--------------收益入账--------------";
        String expenditures = "--------------消费支出--------------";
        String exitMenu = "--------------退出菜单--------------";

        do {

            System.out.println("--------------零钱通菜单--------------");
            System.out.println("\t\t\t1. 零钱明细");
            System.out.println("\t\t\t2. 收益入账");
            System.out.println("\t\t\t3. 消费支出");
            System.out.println("\t\t\t4. 退出菜单");
            System.out.println("请输入(1-4):");

            input = scanner.next();
            switch (input) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println(earnings);
                    System.out.println("收益金额:");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("金额输入错误，收益入账失败");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println(expenditures);
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额输入错误或余额不足，消费失败");
                        break;
                    }
                    System.out.println("商家名称:");
                    shop = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + shop + "\t" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
                    break;
                case "4":
                    System.out.println(exitMenu);
                    while (true) {
                        System.out.println("确定退出输入Y，继续使用输入N:");
                        choose = scanner.next();
                        if ("Y".equals(choose) || "N".equals(choose) ||
                                "y".equals(choose) || "n".equals(choose)) {
                            break;
                        }
                    }
                    if ("Y".equals(choose) || "y".equals(choose)) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (loop);
        System.out.println("成功退出");
    }
}
