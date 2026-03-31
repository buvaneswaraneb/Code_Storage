package Payment_Gate_way_Design_OOP_class;

import java.util.Scanner;

class atm extends paymentgate{
    int balance ;
    String pass;
    atm(int balance , String pass){
        this.balance = balance;
        this.pass = pass;
        this.menu();
    }
    void menu(){
        Scanner s = new Scanner(System.in);
        int amount = 0;
        String getid = s.nextLine();
        if(getid.equals(readFile())) {
            System.out.println("Pass Verified");}
        else {System.err.println("Invalid pass");return;}
        while(true){
            System.out.println("Hello Vannkam 🙏");
            System.out.println("1 . Deposit");
            System.out.println("2 . Withdraw");
            System.out.println("3 . Balance");
            System.out.println("4 . exit");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    amount = s.nextInt();
                    Deposit(amount);
                    break;
                case 2:
                    amount = s.nextInt();
                    withdraw(amount);
                    break;
                case 3: 
                    balance();
                    break;
                case 4:
                    System.out.println("Exited .....");
                    return;
                default:
                    throw new AssertionError();
            }
        }
    }

    void Deposit(int ammout){
        balance +=ammout;
        System.out.println(balance);
        
    }
    void withdraw(int amount){
        if (amount>balance){
            System.out.println("In sufficent Balance");
            return;}
        balance-=amount;
        System.out.println(balance);
        
    }
    void balance(){
        System.out.println(balance);

    }
}


class bank{
    public static void main(String[] args) {
        atm adhi = new atm(10000, "1234");
        atm  bhuv = new atm(10000,"6789");

        int n = 1000000334;
        while(n<10){
            System.out.println(n);
            n++;
        }

    }

}