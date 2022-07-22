package com.fubin.code.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {

    private boolean loop = true;
    private Scanner scanner = new Scanner(System.in);
    private String input = "";
    private String shop = "";
    private String choose = "";

    Date date = null;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private double money = 0;
    private double balance = 0;

    private String details = "--------------零钱明细--------------";
    private String earnings = "--------------收益入账--------------";
    private String expenditures = "--------------消费支出--------------";
    private String exitMenu = "--------------退出菜单--------------";

    public void mainMenu() {
        do {
            System.out.println("--------------零钱通菜单--------------");
            System.out.println("1. 零钱明细");
            System.out.println("2. 收益入账");
            System.out.println("3. 消费支出");
            System.out.println("4. 退出菜单");
            System.out.println("请输入(1-4):");

            input = scanner.next();
            switch (input) {
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (loop);
        System.out.println("成功退出");
    }

    public void details() {
        System.out.println(details);
    }

    public void income() {
        System.out.println(earnings);
        System.out.println("收益金额:");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("金额输入错误，收益入账失败");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
    }

    public void pay() {
        System.out.println(expenditures);
        System.out.println("消费金额:");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额输入错误或余额不足，消费失败");
            return;
        }
        System.out.println("商家名称:");
        shop = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + shop +  " \t" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
    }

    public void exit() {
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
    }
}
