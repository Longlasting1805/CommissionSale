import java.util.Scanner;

public class SaleCommission2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double amount_received_per_week = 200.0;
        double gross_rate_commission = 0.09;
        double totalSales = 0.0;

            System.out.print("Enter items sold: ");
            int item_sold = input.nextInt();

            for (int i = 1; i <= item_sold; i++){
                System.out.print("Enter the value of item" + i + ": $");
                double itemValue = input.nextDouble();
                totalSales = totalSales + itemValue;
            }

        // Calculate the commission
        double commission = totalSales * gross_rate_commission;
        // Calculate the total earnings
        double totalPay = amount_received_per_week + gross_rate_commission;

        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Commission: $" + commission);
        System.out.println("Fixed Salary: $" + amount_received_per_week);
        System.out.println("Total Earnings: $" + totalPay);
    }

}
