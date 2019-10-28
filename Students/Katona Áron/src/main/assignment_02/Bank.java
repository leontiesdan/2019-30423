package assignment_02;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void openAccount(Account account) {
        this.accounts.add(account);
    }

    public void closeAccount(int accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);
    }

    public void update() {
        accounts.stream()
                .filter(account -> account instanceof SavingsAccount)
                .forEach(account -> ((SavingsAccount) account).addInterest());
        accounts.stream()
                .filter(account -> account instanceof CurrentAccount)
                .filter(account -> account.getBalance() < ((CurrentAccount) account).getOverdraftLimit())
                .forEach(account -> System.out.println("Account " + (int) account.getAccountNumber() + " is in overdraft"));
    }

    public void payDividend(double sum) {
        double dividend = sum / accounts.size();
        accounts.forEach(account -> account.deposit(dividend));
    }

    @Override
    public String toString() {
        return "Bank:" +
                accounts.stream()
                        .map(account -> "\n\t" + account)
                        .reduce((string1, string2) -> string1 + string2)
                        .orElse("");
    }
}
