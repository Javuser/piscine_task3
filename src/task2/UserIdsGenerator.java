package task2;

import java.util.concurrent.atomic.AtomicInteger;

public class UserIdsGenerator {
    //cnt
    private static final AtomicInteger cnt = new AtomicInteger(1);//1
    private static final UserIdsGenerator generator = new UserIdsGenerator();

    private UserIdsGenerator(){
    }
    public static UserIdsGenerator getInstance() {
        return generator;
    }
    public int generateId() {
        return cnt.getAndIncrement(); //автоикрементирует айди+1
    }


}
