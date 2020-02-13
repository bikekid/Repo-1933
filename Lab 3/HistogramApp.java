import java.util.Scanner;

class HistogramApp {
  public static String choice = "yes";
  public static String command = "";

  public static void main(String[] args) {
    while (choice.equals("yes")){
    System.out.println("Hello Welcome to my Histogram App" + "\n" + " add - used to add numbers to the histogram" + "\n" + " print - prints the histogram" + "\n" + " quit - quits the program" + "\n");
    //uppperBound
    Scanner myInp = new Scanner(System.in);
    System.out.println("Enter a uppperBound");
    String strNum = myInp.nextLine();
    int upperB = Integer.parseInt(strNum);

    //lowerBound
    System.out.println("Enter a lowerBound");
    String strNu = myInp.nextLine();
    int lowerB = Integer.parseInt(strNu);

    Histogram myHistogram = new Histogram(lowerB,upperB);


    System.out.println("What would you like to do?");
    int quit = 0;



    while (quit != 1){
      String command = myInp.nextLine();
      if (command.equals("add")){
        System.out.println("What would you like to add?");
        String inputNum = myInp.nextLine();
        int add = Integer.parseInt(inputNum);
        if (add < lowerB || add > upperB){
          System.out.println("Please try again");
        } else {
          myHistogram.add(add);
          System.out.println("Successfully added!");
        }
      }
      else if (command.equals("print")){
        System.out.println(myHistogram.toString());
      } else if(command.equals("quit")){
        quit = 1;

      }else{
        System.out.print("Didn't quite catch that - try again" + "\n");
      }
      }
    System.out.println(myHistogram.toString());
    System.out.println("All done! want to repeat? Hit enter twice to quit");
    String choice = myInp.nextLine();
  }
}
}
