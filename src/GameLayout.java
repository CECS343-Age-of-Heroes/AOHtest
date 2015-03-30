
import java.util.ArrayList;
import java.util.Scanner;


public class GameLayout {
   public static void main(String[] args) {
      Deck middleDeck = new Deck();
      Player player1;
      String name;
      String culture;
      System.out.println("The game will now begin.");
      Scanner input = new Scanner(System.in);
      String cont = "";
      ArrayList<ProductionTiles> productionTDeck = new ArrayList();
      productionTDeck = middleDeck.prodDeck();
      while(!cont.equals("EXIT")){
         System.out.print("Input your name:");
         name = input.nextLine();
         System.out.print("Input your culture:(Egypt, Greek, Norse) ");
         culture = input.nextLine();
         player1 = new Player(name,culture);
         System.out.println("Name: "+player1.getName()+" Culture: "+player1.getCulture());
         player1.drawCard();
         player1.drawCard();
         player1.drawCard();
         player1.drawCard();
         player1.drawCard();
         player1.showHand();
         for(int i = 0;i < 6;i++){
            System.out.println(productionTDeck.get(0).showInput()+" ");
            productionTDeck.remove(0);
         }
         player1.placeProduction(input.nextLine());
         System.out.println(player1.resourceQuantity("Wood"));
         cont = "EXIT";
         
      }
   }
    

}
