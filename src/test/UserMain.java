package test;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User("김철수", UserStatus.USER);
        User user2 = new User("관리자", UserStatus.ADMIN);

        user1.printRole();
        user2.printRole();
    }
}