import model.Company;
import model.Individual;
import model.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<TaxPayer> taxPayerList = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Tax payer #%d data:%n", i);
            System.out.print("Individual or company (i/c)? ");
            char chatAt = sc.next().trim().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (chatAt == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayerList.add(new Individual(annualIncome, name, healthExpenditures));
            }else if (chatAt == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                taxPayerList.add(new Company(annualIncome, name, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID");
        double sum = 0.0;
        for (TaxPayer payer : taxPayerList) {
            double tax = payer.tax();
            System.out.printf("%s: $ %.2f%n", payer.getName(), tax);
            sum += tax;
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: %.2f", sum);
    }
}