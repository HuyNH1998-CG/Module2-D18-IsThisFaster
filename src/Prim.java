public class Prim implements Runnable {
    public Prim() {
        System.out.println("A less lazy prime finder is here");
    }

    @Override
    public void run() {
        try {
            int number = 10;
            int count = 0;
            int N = 2;
            while (count < number) {
                boolean Check = true;
                for (int i = 2; i <= Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        Check = false;
                        break;
                    }
                }
                if (Check) {
                    count++;
                    System.out.println("Fast?: " + N);
                }
                N++;

            }
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
