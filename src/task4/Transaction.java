package task4;

import java.util.UUID;

public class Transaction {
    private UUID ID;
    private User recipient;
    private User sender;
    private TransCategory transCategory;
    private double TransAmount;

    public Transaction(UUID ID, User recipient, User sender, TransCategory transCategory, double transAmount) {
        this.ID = ID;
        this.recipient = recipient;
        this.sender = sender;
        this.transCategory = transCategory;
        this.TransAmount = transAmount;
    }

    public UUID getTransID() {
        return ID;
    }

    public void setTransID(UUID transID) {
        this.ID = transID;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public TransCategory getTransCategory() {
        return transCategory;
    }

    public void setTransCategory(TransCategory transCategory) {
        this.transCategory = transCategory;
    }

    public double getTransAmount() {
        return TransAmount;
    }

    public void setTransAmount(double transAmount) {
        this.TransAmount = transAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "ID=" + ID +
                ", recipient=" + recipient +
                ", sender=" + sender +
                ", transCategory=" + transCategory +
                ", TransAmount=" + TransAmount +
                '}';
    }
}

enum TransCategory {
    DEBITS,
    CREDITS

}
