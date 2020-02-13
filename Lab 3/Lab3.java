import java.util.Scanner;

class Lab3 {

  public static int ans = -1;

  public static int Fib(int num){
    if (num < 2){
      return (num);
    }else{
      return (Fib(num-1) + Fib(num -2));
    }
  }
  public static void main(String[] args) {
    Scanner myInp = new Scanner(System.in);
    System.out.println("Enter a number");
    String strNum = myInp.nextLine();
    int number = Integer.parseInt(strNum);
    if (number < 0){
      while (ans < 0) {
        System.out.println("Try again cannot be negative");
        String newinput = myInp.nextLine();
        ans = Integer.parseInt(newinput);

      }
      int total = Lab3.Fib(ans);
      System.out.println("The fibbonaci sequence is " + total);
    } else {
    int total = Lab3.Fib(number);
    System.out.println("The fibbonaci sequence is " + total);
    }
  }
}
