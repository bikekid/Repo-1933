import java.util.Scanner;

public class BankAccount{
  private String name;
  private String password;
  private double balance;

  public BankAccount(String initName, String initPass, double initBalance){
    this.name = initName;
    this.password = initPass;
    this.balance = initBalance;
  }

  public void withdraw(String enteredPassword, double amount){
    if (password.equals(enteredPassword) && balance >= amount) {
      balance = balance - amount;
    }
  }
  public void deposit(String enteredPassword, double amount){
    if (password.equals(enteredPassword)) {
      balance = balance + amount;
    }
  }
  public double getBalance(String enteredPassword){
    if (password.equals(enteredPassword)) {
      return balance;

    } else{
      return -1;
    }
  }
  public boolean setPassword(String oldPassword, String newPassword){
    if (password.equals(oldPassword)) {
      password = newPassword;
      return true;
    } else{
      return false;
    }
  }
  public static void main(String[] args) {

    BankAccount myAccount = new BankAccount("Java","CSCI1933 rules!", 100.50);
    System.out.println("What is your password");
    Scanner myScanner = new Scanner(System.in);
    String pass = myScanner.nextLine();
    System.out.println("What would you like to do?");
    String command = myScanner.nextLine();
    if (command.equals("balance")){


      System.out.println("Balance is" + myAccount.getBalance(pass));

    }

    myAccount.deposit("CSCI1933 rules",100.50);
    System.out.println("My account balance is: " + myAccount.getBalance(pass));

  }
}
