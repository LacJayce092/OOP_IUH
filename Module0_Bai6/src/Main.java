public class Main {
    public static void main(String[] args){
        Account acc1 = new Account( 72354 ,"Ted Murphy", 102.56);
        Account acc2 = new Account(69713,"Jane Smith", 40.00);
        Account acc3 = new Account(93757,"Edward Demsey", 759.32);
        acc1.deposit(25.85);
        acc2.deposit(500.00);
        acc2.withdraw(430.75 , 1.5);

        System.out.println(String.format("%-15s %-30s %-15s %-15s",
                "So TK" ,"Ten","So du","Lai"));
        acc1.toString();
        acc2.toString();
        acc3.toString();

        acc2.transfer(100.0,acc1);

        System.out.println(String.format("%-15s %-30s %-15s %-15s",
                "So TK" ,"Ten","So du","Lai"));
        acc1.toString();
        acc2.toString();

    }
}
