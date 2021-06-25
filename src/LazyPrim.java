public class LazyPrim implements Runnable {

    public LazyPrim() {
        System.out.println("A lazy prime finder is here");
    }

    @Override
    public void run() {
        try {
            int number = 10;
            int count = 0;
            int N = 2;
            while (count < number) {
                boolean Check = true;
                for (int i = 2; i <= N / 2; i++) {
                    if (N % i == 0) {
                        Check = false;
                        break;
                    }
                }
                if (Check) {
                    count++;
                    System.out.println("Lazy: " + N);
                }
                N++;
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
