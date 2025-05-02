class SuperClass {
    private String privateMessage = "This is a private member of SuperClass";

    public String getPrivateMessage() {
        return privateMessage;
    }
}

class SubClass extends SuperClass {
    public void showPrivateMessage() {
        System.out.println("Cannot access private member directly!");
        System.out.println("Accessing via public method: " + getPrivateMessage());
    }
}

public class PrivateAccessDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.showPrivateMessage();
    }
}
