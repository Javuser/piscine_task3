package task4;

import task4.UserIdsGenerator;

import java.util.UUID;

public class User {
    private final int id;
    private String name;
    private String email;
    private TransactionList transactionList;

    public User(String name, String email) {
        this.id = UserIdsGenerator.getInstance().generateId();
        this.name = name;
        this.email = email;
        this.transactionList = new TransactionLinkedList();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TransactionList getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(TransactionList transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", transactionList=" + transactionList +
                '}';
    }
}
