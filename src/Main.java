import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Nurbakyt", 52000);
        User user2 = new User(2, "Sultan Alibekov", 152000);

        System.out.println(user1);
        System.out.println(user2);
        UUID transID = UUID.randomUUID();
        Scanner sc = new Scanner(System.in);

        System.out.println("How much money do you need ?");
        int money = sc.nextInt();//5000

        Transaction transaction = new Transaction(transID, user1, user2, TransCategory.DEBITS, money);
        //Отправил 5000
        System.out.println(transaction);
    }
}
