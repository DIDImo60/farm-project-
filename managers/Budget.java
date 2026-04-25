package managers;

public class Budget {
    private double totalBalance;
    private double income;
    private double expenses;

    public Budget() {
        this.totalBalance = 0;
        this.income = 0;
        this.expenses = 0;
    }

    public void addIncome(double amount) {
        income += amount;
        totalBalance += amount;
    }

    public void addExpense(double amount) {
        expenses += amount;
        totalBalance -= amount;
    }

    public void getBalance() {
        System.out.println("=== Budget ===");
        System.out.println("Income   : " + income);
        System.out.println("Expenses : " + expenses);
        System.out.println("Balance  : " + totalBalance);
        System.out.println("==============");
    }
}
