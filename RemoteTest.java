interface Remote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}

class Television implements Remote {
    public void powerOn() {
        System.out.println("TV is now ON");
    }

    public void powerOff() {
        System.out.println("TV is OFF");
    }

    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }
}

public class RemoteTest {
    public static void main(String[] args) {
        Remote tvRemote = new Television();
        tvRemote.powerOn();
        tvRemote.changeChannel(5);
        tvRemote.powerOff();
    }
}
