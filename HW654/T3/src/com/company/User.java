package com.company;

public class User {
    public String username;
    private String password;
    private String account;//long term - shor trem
    private float custody;
    private boolean block;

    public User() {
        custody = 0;
        block = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccount(int account) {
        if (account == 1)
            this.account = "long-term";
        else if (account == 2)
            this.account = "short-term";
        else
            System.out.println("Invalid number for account type");
    }


    public void deposite(float custody) {

        if (!this.block) {
            if (custody > 0)
                this.custody += custody;
            else
                System.out.println("please enter a valid number");
        } else
            System.out.println("your account is blocked");
    }

    public void withdraw(float custody) {
        if (!this.block) {
            if(custody <= 0)
            {
                System.out.println("please enter a valid number");
            }
            else if (custody < this.custody) {
                this.custody -= custody;
                System.out.println("withdraw completed");
            } else
                System.out.println("you haven't enough custody");
        } else
            System.out.println("your account is blocked");

    }

    public void setBlock(boolean block) {
        if (this.account.equals("long-term")) {
            this.block = block;
            System.out.println("your account blocked successfully");
        }
        else
            System.out.println("you can't block short term account");
    }

    @Override
    public String toString() {
        return
                "username=" + username + "\n" +
                        "password=" + password + "\n" +
                        "account type=" + account + "\n" +
                        "custody=" + custody + "\n" +
                        "block=" + block + "\n";
    }
}
