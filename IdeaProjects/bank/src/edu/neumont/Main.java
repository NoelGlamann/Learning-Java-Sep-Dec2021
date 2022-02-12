package edu.neumont;

public class Main {

    public static void main(String[] args) {
	    Account account1 = new Account("Noel", 3);
	    Account account2 = new Account("Brendan");
	    Account account3 = account2;
        Account account4 = new Account();
        account3.setBalance(10000);//ten thou

        System.out.println(account1.getName());
        System.out.println(account1.getBalance());

        //point to the same place in memory
        System.out.println(account2.getBalance());
        System.out.println(account3.getBalance());

        setBalance(account1, 4);
        System.out.println(account1.getBalance());

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]);
    }

    static void setBalance(Account account, double balance){
        account.balance = balance;
    }

}
