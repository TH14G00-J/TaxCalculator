package model;

public abstract class TaxPayer {
    private String name;
    private Double annualIncome;

    public TaxPayer() {}

    public TaxPayer(Double annualIncome, String name) {
        this.annualIncome = annualIncome;
        this.name = name;
    }

    public abstract Double tax();

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
