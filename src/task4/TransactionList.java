package task4;

import java.util.UUID;

public interface TransactionList {
    void addTransaction(Transaction transaction);
    void removeTransaction(UUID transactionId);
    Transaction[] toArray();
}
