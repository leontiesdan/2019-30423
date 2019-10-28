package assignment_02;

public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int number, double interest) {
        super(number);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void addInterest() {
        this.deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + " interest = " + interest;
    }
}
