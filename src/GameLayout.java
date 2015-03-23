
import java.util.Scanner;


public class GameLayout {
   public static void main(String[] args) {
      Player player1;
      String name;
      String culture;
      System.out.println("The game will now begin.");
      Scanner input = new Scanner(System.in);
      String cont = "";
      while(!cont.equals("EXIT")){
         System.out.print("Input your name:");
         name = input.next();
         System.out.print("Input your culture:(Egypt, Greece, Norse) ");
         culture = input.next();
         player1 = new Player(name,culture);
         System.out.println("Name: "+player1.getName()+" Culture: "+player1.getCulture());
         
      }
   }
    

}
