package task3;

import task2.UserIdsGenerator;

public class User {
    private int userID;
    private String name;
    private double balance;

    public User(String name, double balance) {
        this.userID = UserIdsGenerator.getInstance().generateId();
        this.name = name;
        this.balance = balance;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
