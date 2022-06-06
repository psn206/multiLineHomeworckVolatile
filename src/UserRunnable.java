import java.util.concurrent.Callable;

public class UserRunnable implements Runnable {
    private Toy toy;
    final private int ch = 3;


    public UserRunnable(Toy toy){
        this.toy= toy;

    }


    @Override
    public void run() {
        try {
            for (int i  = 0; i < ch; i++) {
                if (!this.toy.isFlag()) {
                    this.toy.setFlag(true);
                    System.out.println("flag = on");
                    Thread.sleep(2000);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    }

