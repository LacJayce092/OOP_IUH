import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    double  b;
    long accountNumber;
    String name;
    double balance;
    final double RATE = 0.035;

    public Account() {
        accountNumber = 999999;
        name = "Chua xac dinh";
        balance = 50000;
    }

    public Account(long accountNumber, String name, double balance) {
        if(accountNumber < 0){
            accountNumber  = 99999;
        }
        else
            this.accountNumber = accountNumber;
        if(name == null){
            name = "Chua xac dinh";
        }else
            this.name = name;
        if(balance < 0){
            balance = 0;
        }else
            this.balance = balance;
    }

    public Account(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amount){
        boolean result = true;
        if(amount > 0){
            this.balance += amount;
        }
        else
            result = false;
        return result;
    }
    public boolean withdraw(double amount , double fee){
        boolean result = true;
        if(amount > 0 && amount + fee <= balance){
            balance -= amount + fee;
        }else
            result = false;
        return result;
    }
    public Object addInterest(){
        double b = balance;
        double lai = balance = balance * RATE;
        balance = b;
        return lai;
    }
    public boolean transfer(double amount , Account acc2){
        boolean result = true;
        if(amount < balance){
            balance -= amount;
            acc2.balance += amount;
        }else
            result = false;
        return result;
    }
    public String toString(){
        Locale local = new Locale("vi","vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        System.out.println(String.format("%-15s %-30s %-15s %-15s",
                accountNumber , name , String.format("%.2f" ,balance) , String.format("%.2f" ,addInterest())));

        return null;
    }

}
