import java.util.Scanner;
interface Purchase {
    void buy(int qty);
}
abstract class Product implements Purchase {
    String name;
    int price, stock = 10;
    Product(String n, int p) {
        name = n;
        price = p;
    }
    abstract void display();
    public void buy(int qty) {
        if (qty > 0 && qty <= stock) {
            stock -= qty;
            System.out.println("Total Bill: Rs." + price * qty);
            System.out.println("Purchase Successful!");
        } else {
            System.out.println("Stock unavailable!");
        }
    }
}

class Chips extends Product {
    Chips() {
        super("Chips", 20);
    }

    void display() {
        System.out.println(name + " - Rs." + price);
    }
}

class Chocolate extends Product {
    Chocolate() {
        super("Chocolate", 30);
    }

    void display() {
        System.out.println(name + " - Rs." + price);
    }
}

public class VendingMachine4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] p = {new Chips(), new Chocolate()};

        for (int i = 0; i < p.length; i++) {
            System.out.print((i + 1) + ". ");
            p[i].display();
        }

        System.out.print("Choose product (1-2): ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= p.length) {
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            p[choice - 1].buy(qty);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}