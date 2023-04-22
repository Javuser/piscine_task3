package task3;

public class UserNotFoundException extends Exception{
    public UserNotFoundException() {
        System.out.println("User not found");
    }

}
