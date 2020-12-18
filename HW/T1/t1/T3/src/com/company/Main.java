package com.company;

import java.util.Scanner;

public class Main {
    public static void firstMenu(){
        System.out.println("please enter a menu number:");
        System.out.println("1) create account");
        System.out.println("2) login");
        System.out.println("3) exit");
    }
    public static void secondMenu(){
        System.out.println("please enter a menu number:");
        System.out.println("1) show Profile");
        System.out.println("2) Withdraw");
        System.out.println("3) Deposit");
        System.out.println("4) Block");
        System.out.println("5) exit");
    }
    public static void main(String[] arg) {
        int menu = 0;
        Scanner input = new Scanner(System.in);
        firstMenu();
        menu = input.nextInt();
        User user = new User();
        while(menu!=3){
            switch (menu){
                case 1:
                        System.out.println("please enter a username:");
                        String username = input.next();
                        user.setUsername(username);
                        System.out.println("please enter a password:");
                        String password = input.next();
                        user.setPassword(password);
                        System.out.println("please chose your account type:\n1)long term\t2)short term");
                        int accountType = input.nextInt();
                        user.setAccount(accountType);
                        System.out.println("Account Created");
                    break;
                case 2:
                    System.out.println("please enter your username");
                    String Username = input.next();
                    String Password = input.next();
                    if(user.getUsername().equals(Username) && user.getPassword().equals(Password))
                    {
                        System.out.println("welcome ...\nyou are login now\n");
                        secondMenu();
                        menu = input.nextInt();
                        while(menu!=5){
                            switch (menu){
                                case 1:
                                    System.out.println(user.toString());
                                    break;
                                case 2:
                                    System.out.print("how many:");
                                    float how = input.nextFloat();
                                    user.withdraw(how);
                                    break;
                                case 3:
                                    System.out.print("how many:");
                                    float How = input.nextFloat();
                                    user.deposite(How);
                                    break;
                                case 4:
                                    System.out.println("Are you sure you want to block this account?(yes/no)");
                                    if(input.next().equals("yes"))
                                        user.setBlock(true);
                                    break;
                            }
                            secondMenu();
                            menu = input.nextInt();
                        }
                    }
                    break;
            }
            firstMenu();
            menu = input.nextInt();
        }
    }
}
