package task4;

import java.util.UUID;

public class TransactionLinkedList implements TransactionList {
    private int length = 0;
    private TransactionNode head;
    private TransactionNode tail;

    public TransactionLinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }


    @Override
    public void addTransaction(Transaction transaction) {
        TransactionNode transactionNode = new TransactionNode(transaction);
        if(head == null){
            head = transactionNode;
            tail = transactionNode;
        }else {
            tail.setNext(transactionNode);
            transactionNode.setPrevious(tail);
            tail = transactionNode;
        }
        length++;
    }

    @Override
    public void removeTransaction(UUID transactionId) {
        TransactionNode current = head;
        while (current != null) {
            if (current.getTransaction().getTransID().equals(transactionId)) {
                TransactionNode prev = current.getPrevious();
                TransactionNode next = current.getNext();
                if (prev == null && next == null) {
                    head = null;
                    tail = null;
                } else if (prev == null) {
                    head = next;
                    head.setPrevious(null);
                } else if (next == null) {
                    tail = prev;
                    tail.setNext(null);
                } else {
                    prev.setNext(next);
                    next.setPrevious(prev);
                }
                length--;
                return;
            }
            current = current.getNext();
        }
    }

    @Override
    public Transaction[] toArray() {
        return new Transaction[0];
    }

    public static class TransactionNode {
        private Transaction transaction;
        private TransactionNode previous;//начало
        private TransactionNode next;//конец

        public TransactionNode(Transaction transaction) {
            this.transaction = transaction;
            this.previous = null;
            this.next = null;
        }
        public Transaction getTransaction(){
            return transaction;
        }
//
        public void setTransaction(Transaction transaction) {
            this.transaction = transaction;
        }

        public TransactionNode getPrevious() {
            return previous;
        }

        public void setPrevious(TransactionNode previous) {
            this.previous = previous;
        }

        public TransactionNode getNext() {
            return next;
        }

        public void setNext(TransactionNode next) {
            this.next = next;
        }
    }


}
