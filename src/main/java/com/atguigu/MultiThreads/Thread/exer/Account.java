package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/30 09:26
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */

class Customer extends Thread {
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    private static Object object = new Object();
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (object) {
            account.deposit(1000);
            }
        }
    }

}
public class Account {
    private double balance = 0d;


    public void deposit(double amt) {
        if (amt > 0) {
//            synchronized (Account.class) {

                this.balance += amt;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "存钱，存完之后，账户余额为：" + getBalance());
//            }
        }
    }

    public double getBalance() {
        return balance;
    }
}

class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);
        c1.setName("储户1");
        c2.setName("储户2");
        c1.start();
        c2.start();
    }
}
