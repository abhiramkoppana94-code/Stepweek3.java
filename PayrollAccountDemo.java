import java.util.Scanner;

class PayrollAccount {

    private double basicSalary;
    private double bonus;

    public PayrollAccount(double openingBasicSalary) {
        if (openingBasicSalary < 0) {
            System.out.println("Warning: Negative basic salary. Starting with 0.");
            basicSalary = 0;
        } else {
            basicSalary = openingBasicSalary;
        }

        bonus = 0;
    }

    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Bonus rejected: amount must be greater than 0");
        } else {
            bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Tax rejected: percent must be between 0 and 100");
        } else {
            basicSalary = basicSalary - (basicSalary * percent / 100);
            System.out.println("Tax deducted: " + percent + "%");
        }
    }

    public double getNetSalary() {
        return basicSalary + bonus;
    }
}

public class PayrollAccountDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        PayrollAccount account = new PayrollAccount(basicSalary);

        System.out.print("Enter bonus: ");
        double bonus = scanner.nextDouble();
        account.creditBonus(bonus);

        System.out.print("Enter tax percentage: ");
        double taxPercent = scanner.nextDouble();
        account.deductTax(taxPercent);

        System.out.println("Net salary: Rs " + account.getNetSalary());

        scanner.close();
    }
}