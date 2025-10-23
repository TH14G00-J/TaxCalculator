package model;

public class Individual extends TaxPayer{

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(Double annualIncome, String name, Double healthExpenditures) {
        super(annualIncome, name);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double incomeTax;
       if (getAnnualIncome() < 20000.00) {
           incomeTax = getAnnualIncome() * 0.15;
       } else {
           incomeTax = getAnnualIncome() * 0.25;
       }

       if (healthExpenditures != 0) {
           incomeTax -= healthExpenditures * 0.50;
       }
       return incomeTax;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
