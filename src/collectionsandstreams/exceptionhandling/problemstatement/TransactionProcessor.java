package collectionsandstreams.exceptionhandling.problemstatement;

class TransactionException extends Exception {
    TransactionException(String msg) {
        super(msg);
    }
}

public class TransactionProcessor {
    static void processTransaction(double amount) throws TransactionException {
        try {
            if (amount < 0)
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new TransactionException("Transaction failed for amount: " + amount);
        }
    }

    public static void main(String[] args) {
        try {
            processTransaction(-500);
        } catch (TransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}
