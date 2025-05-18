public class Application {
    public static void main(String[] args) {
        Users users = new Users("Adam", 40.5,178);
        UserValidator userValidator = new UserValidator();
        userValidator.checkAgeHeight(users);
    }
}
