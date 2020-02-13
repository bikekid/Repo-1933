import java.util.Scanner;

class Max{

  public static int maxNum = 0;
  public static int backNum = 0;

  public static int recursiveMaxDigit(int num){
    if (num < 10){
      return (maxNum);
    }
    int backNum = num % 10;
    if (backNum >= maxNum){
      maxNum = backNum;
      return recursiveMaxDigit((num - backNum)/10);
    } else {
      return recursiveMaxDigit((num - backNum)/10);
    }
  }
  public static int iterativeMaxDigit(int num){
    while (num > 0){
      int backNum = num % 10;
      if(backNum >= maxNum){
        maxNum = backNum;
      }
      num = (num - backNum)/10;
    }
    return (maxNum);

  }

    public static void main(String[] args) {
      Scanner myInp = new Scanner(System.in);
      System.out.println("Enter a number");
      String strNum = myInp.nextLine();
      int number = Integer.parseInt(strNum);
      int x = Max.iterativeMaxDigit(number);
      //int x = Max.recursiveMaxDigit(number);
      System.out.println("" + x);

    }
}
