package method;

class Mayanur {
    String name = "Sourav";
}

public class BasicMethod {

    static void greet() {
        System.out.println("How are u?");
    }

    public static void main(String[] args) {
        Mayanur maruf = new Mayanur();
        System.out.println("firstCall" + " " + maruf);
        maruf = null;//dissmiss
        Mayanur hasan = new Mayanur(); //new tempo;
        System.out.println("secondCall" + " " + maruf);
    }
}
