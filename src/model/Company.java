package model;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(Double annualIncome, String name, int numberOfEmployees) {
        super(annualIncome, name);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double incomeTax;

        if(numberOfEmployees > 10) {
            incomeTax = getAnnualIncome() * 0.14;
        }else {
            incomeTax = getAnnualIncome() * 0.16;
        }

        return incomeTax;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
