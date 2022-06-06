public class ToyRunnable implements Runnable {

    private Toy toy;
    private Thread userThread;

    public ToyRunnable(Toy toy, Thread UserThread) {
        this.toy = toy;
        this.userThread = UserThread;
    }

    @Override
    public void run() {
        while (userThread.isAlive()) {
            if (toy.isFlag()) {
                toy.setFlag(false);
                System.out.println("flag = of");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Game over");
    }
}
