import java.util.Scanner;

public class transaction {
    public String custID; // works similar to regular coding. you can change this class's properties within the method's code
    public String item1, item2;
    public double price1, price2;
    public boolean done = false; // declarations of class's attributes
    public boolean fin = false;

    public boolean nextCustomer() {
        greet();
        while (!done) {
            scanItems();
        } 
        checkout();
        return fin;
    }

    public void greet(){
        System.out.println("Hello");
    }

    public void scanItems() {
        for (int i = 0; i < 3; i++) System.out.println("Scan the next item");
        done = true;
    }

    public void checkout() {
        System.out.println("credit or debit!");
    }
}
