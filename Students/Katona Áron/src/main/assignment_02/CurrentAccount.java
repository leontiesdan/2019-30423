package assignment_02;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int number, double overdraftLimit) {
        super(number);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return super.toString() + " overdraftLimit = " + overdraftLimit;
    }
}

