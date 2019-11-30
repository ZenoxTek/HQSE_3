public class User {

    String username;

    public User() { }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getUserName() {
        return this.username;
    }

    public void getUserMessage(String msg) {
        System.out.println("[" + this.username + "]" + " " +  msg + "\n");
    }
}
