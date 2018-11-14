public class BankAccount {
    private int account_number;
    private int account_balance;

    public BankAccount(int a_number, int a_balance) {
        this.account_number = a_number;
        this.account_balance = a_balance;
        System.out.println("Account Created: " + this.account_number);
    }

    public void deposit(int addMoney) {
        if(addMoney < 0) {
            System.out.println("You can't deposit a negative ammount.");
        } else {
            this.account_balance += addMoney;
            System.out.println("$" + addMoney + " has been deposited." + 
                "\nAccount Number: " + this.account_number + 
                "\nAccount Balance: " + this.account_balance + "\n");
        }
    }

    public void withdraw(int removeMoney) {
        if(removeMoney > this.account_balance) {
            System.out.println("You can't remove more than your balance." +
                "\nAccount Number: " + this.account_number +
                "\nAccount Balance: " + this.account_balance + "\n");
        } else {
            this.account_balance -= removeMoney;
            System.out.println("$" + removeMoney + " has been withdrawn." + 
                "\nAccount Number: " + this.account_number + 
                "\nAccount Balance: " + this.account_balance + "\n");
        }
    }
}