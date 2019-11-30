public class User {

    private String username;
    private static final String SAY_FOO = "foo";
    private static final String EXIT = "++";

    public User() { }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getUserName() {
        return this.username;
    }

    public void displayUserName() {
        System.out.print("[" + this.username + "] ");
    }
}
