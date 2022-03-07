import java.util.Scanner;

public class TeenageYears{
  public TeenageYears(){
    
   Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to your Teenage Years! Here, your journey to adulthood began!\n\nTo prove that you are jiggly, please solve the following riddle \n What has four fingers and a thumb, but isn’t alive?");
    String command = scan.nextLine();
    if(command.equals("Glove")||(command.equals(" A Glove"))){
      System.out.println("So, you're called Jiggly");
    }
    scan.close();
    
  }
}