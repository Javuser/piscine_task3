package task3;

import task2.UserIdsGenerator;

public class Main {
    public static void main(String[] args) {
        UserList userList = new UsersArrayList();
        User user1 = new User( "Nurbakyt", 49000);
        User user2 = new User( "Sultan", 30000);
        System.out.println(user1);
        System.out.println(user2);
    }
}
