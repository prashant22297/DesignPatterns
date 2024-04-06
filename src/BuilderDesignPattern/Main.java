package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserEmailId("Prashant22297@gmail.com")
                .setUserId("PrashantS22")
                .setUserName("Prashant")
                .build();
        System.out.println(user);
    }
}
