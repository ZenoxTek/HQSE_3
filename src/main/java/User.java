package java;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public void getUserMessage(String msg) {
        System.out.println("[" + this.name + "]" + " " +  msg + "\n");
    }
}
