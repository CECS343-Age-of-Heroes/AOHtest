
import java.util.ArrayList;

public class Player {
   String race;
   String age;
   ArrayList<Card> cards;
   ArrayList<Resource> resources;
   Object building;
   Object tiles;
   Integer victoryPoints;
   boolean turn;
   public Player(){
      race = "";
      age = "Archaic";
      cards = new ArrayList();
      resources = new ArrayList();
      building = null;
      tiles = null;
      victoryPoints = 0;
      turn = false;
   }
   public String getRace(){
      return race;
   }
   public void chooseRace(String newRace){
      race = newRace;
   }
   public String getAge(){
      return age;
   }
   public void newAge(){
      if(age.equals("Archaic"))
         age = "Classical";
      else if(age.equals("Classical"))
         age = "Heroic";
      else if(age.equals("Heroic"))
         age = "Mythic";
      else
         System.out.println("You cannot progress any further.");
   }
   public Card getCards(){
      for(int i = 0;i<cards.size();i++){
      
      }
      return null;
   }
   public Integer cardQuantity(){
      return cards.size();
   }
   public void addCard(Card newCard){
      cards.add(newCard);
   }
   public Integer resourceQuantity(String resourceType){
      int quantity = 0;
      for(int i = 0;i < resources.size();i++){
         if(resources.get(i).resourceType().equals(resourceType))
            quantity = quantity + resources.get(i).value;
      }
      return quantity;
   }
}
