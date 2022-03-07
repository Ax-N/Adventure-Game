import java.util.Scanner;

public class Childhood extends Character{
  public Childhood(){
    
   Scanner scan = new Scanner(System.in);
    System.out.println("Hello!\n\nWhat is your name?");
    String command = scan.nextLine();
    if(!command.equals("jiggly")){
      System.out.println("So, you're called Jiggly");
    }
    scan.close();
    
  }
}