public class Main {

    public static void main(String[] args) {
        Toy toy = new Toy();
        Thread userTread = new Thread(null, new UserRunnable(toy), "User");
        Thread toyTread = new Thread(null, new ToyRunnable(toy, userTread), "Toy");
        userTread.start();
        toyTread.start();
    }
}
