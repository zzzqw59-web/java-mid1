package test;

public class User {
    private String name;
    private UserStatus status;

    public User(String name, UserStatus status) {
        this.name = name;
        this.status = status;
    }

    public void printRole() {
        if (status == UserStatus.USER) {
            System.out.println(name + "의 권한: " + status);
        } else if (status == UserStatus.ADMIN) {
            System.out.println(name + "의 권한: " + status);
        } else if (status == UserStatus.GUEST) {
            System.out.println(name + "의 권한: " + status);
        }
    }
}
