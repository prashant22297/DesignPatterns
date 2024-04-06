package BuilderDesignPattern;

public class User {
    private final String userName;
    private final String userId;
    private final String userEmailId;

    private User(UserBuilder userBuilder) {
        this.userName = userBuilder.userName;
        this.userId = userBuilder.userId;
        this.userEmailId = userBuilder.userEmailId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userEmailId='" + userEmailId + '\'' +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    static class UserBuilder {
        private String userName;
        private String userId;
        private String userEmailId;

        public UserBuilder() {

        }

        public UserBuilder setUserEmailId(String userEmailId) {
            this.userEmailId = userEmailId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}

