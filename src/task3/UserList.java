package task3;

public interface UserList {
    void addUser(User user);
    User getUserByID(int id) throws UserNotFoundException;
    User getUserByInd(int ind) throws UserNotFoundException;
    int getNumberOfUsers();
}
