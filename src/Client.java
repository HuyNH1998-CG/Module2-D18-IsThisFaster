public class Client {
    public static void main(String[] args) {
        LazyPrim lazyPrim = new LazyPrim();
        Prim prim = new Prim();
        Thread t1 = new Thread(lazyPrim);
        Thread t2 = new Thread(prim);
        t1.start();
        t2.start();
    }
}
