import java.util.Scanner;

class account {
    int accountNumber;
    String name;
    String accountType;
    double balance;
    Scanner input = new Scanner(System.in);

    account() {
        System.out.println("Enter Account Number:");
        accountNumber = input.nextInt();
        System.out.println("Enter Your Name");
        name = input.nextLine();
        System.out.println("Enter Account type");
        accountType = input.nextLine();
        balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "Rs. successfully added to your account.");
        System.out.println("Your current balance is: " + balance);
    }

    void withdraw() {
        System.out.println("Your current balance is: " + balance);
        System.out.println("Enter Amount to withdraw");
        double amount = input.nextDouble();
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("insufficient Balance");
    }

    void getDetails() {
        System.out.println("Your name is " + name);
        System.out.println("Current Balance " + balance);
    }
}

public class exam {
    public static void main(String[] args) {
        account obj = new account();
        obj.deposit(1000);
        obj.withdraw();
        obj.getDetails();
    }
}
