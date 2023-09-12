public class register {
    public static void main(String[] args) {
        transaction t1 = new transaction();
        t1.nextCustomer();
        while (!fin) {
            finished = t1.nextCustomer();
        }
    }
}
