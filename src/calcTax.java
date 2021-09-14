import java.util.Scanner;

public class calcTax {
    double salary;
    double tax;

    calcTax() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your total income: ");
        salary = input.nextDouble();
        input.close();
    }

    double calcPercent(double percent, double salary_) {
        return (salary_ * (percent / 100));
    }

    double taxAmount() {
        if (salary <= 400000) {
            return 0;
        } else if (salary > 400000 && salary <= 500000) {
            return this.calcPercent(2, salary - 400000);
        } else if (salary > 500000 && salary <= 750000) {
            return 2000 + this.calcPercent(5, salary - 500000);
        } else if (salary > 750000 && salary <= 1400000) {
            return 14500 + this.calcPercent(10, salary - 750000);
        } else
            return 17500 + this.calcPercent(10, salary - 750000);
    }

    public static void main(String[] args) {
        calcTax obj = new calcTax();
        System.out.println(obj.taxAmount());
    }
}
