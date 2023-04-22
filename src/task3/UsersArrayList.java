package task3;

import java.util.Arrays;

public class UsersArrayList implements UserList{
    private User[] users;
    private int usersN;

    public UsersArrayList() {
        users = new User[10];
        usersN = 0;
    }

    private void expandUsersArray() {
        users = Arrays.copyOf(users, (int)( users.length * 1.5));
    }
    @Override
    public void addUser(User user) {
        int res = 0;
        while(usersN != users.length){
            res++;
            users[res] = user;

        }
        expandUsersArray();
    }

    @Override
    public User getUserByID(int id) throws UserNotFoundException {
        for (int i = 0; i < usersN; i++) {
            if(users[i].getUserID() == id){
                return users[i];
            }
        }
        throw new UserNotFoundException();
    }

    @Override
    public User getUserByInd(int ind) throws UserNotFoundException {
        if(ind > 0 || ind >= usersN){
            return users[ind];
        }else{
            throw new UserNotFoundException();
        }
    }

    @Override
    public int getNumberOfUsers() {
        return usersN;
    }
}
