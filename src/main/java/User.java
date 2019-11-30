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

    public void getUserMessage(String msg) {
        System.out.println(msg);
    }

    public void displayUserName() {
        System.out.print("[" + this.username + "] ");
    }

    public void sayByeToBot() {
        displayUserName();
        System.out.println(SAY_FOO);
        displayUserName();
        System.out.println(EXIT);
    }
}
