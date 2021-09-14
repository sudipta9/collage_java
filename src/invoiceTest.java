import java.util.Scanner;

public class invoiceTest {

    public static void main(String[] args) {
        invoice obj = new invoice();
        obj.getInvoice();
    }
}

class invoice {
    private String vegetableNumber;
    private String vegetableDescription;
    private int quantity;
    private int price;

    invoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter vegetable number: ");
        vegetableNumber = input.nextLine();
        System.out.print("Enter vegetable description: ");
        vegetableDescription = input.nextLine();
        System.out.print("Enter vegetable quantity: ");
        quantity = input.nextInt();
        System.out.print("Enter vegetable Price: ");
        price = input.nextInt();
        input.close();
    }

    void getInvoice() {
        System.out.println("**************** INVOICE ***************");
        System.out.println("Number: " + vegetableNumber);
        System.out.println("Description: " + vegetableDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total: " + price * quantity);
        System.out.println("****************************************");
    }
}