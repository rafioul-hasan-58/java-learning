
public class Interface {
    interface Device {
        void turnOn();

        void turnOff();
    }

    static class Phone implements Device {
        public void turnOn() {
            System.out.println("phone turned on!");
        }

        public void turnOff() {
            System.out.println("phone turned off!");
        }

    }

    public static void main(String[] args) {
        Phone myPhone=new Phone();
        myPhone.turnOff();
    }

}
