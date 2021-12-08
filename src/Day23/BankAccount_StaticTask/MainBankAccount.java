package Day23.BankAccount_StaticTask;

public class MainBankAccount {

//    Part 1
//            - create a class called BankAccount
//        - with fields: customerName, customerBalance = 0; -> instance fields
//        - deposit and withdraw -> instance methods
//
//
//    Part 2
//            - keep track of how much money bank has

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.customerName = "Mark";

        System.out.println(bankAccount1.customerBalance);
        bankAccount1.deposit(5000);
        System.out.println(bankAccount1.customerBalance);
        bankAccount1.withdraw(500);
        System.out.println(bankAccount1.customerBalance);


        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.customerName = "Emily";

        bankAccount2.deposit(1200);

        System.out.println(BankAccount.totalBalance);

    }

}
