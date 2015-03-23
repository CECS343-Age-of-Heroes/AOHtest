
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
   private ArrayList<Card> newRandomDeck = new ArrayList<Card>();
   private ArrayList<Card> newPermanentDeck;
   public Deck(String playerDeck){
      newRandomDeck = cultureDeck(playerDeck);
   }
   private ArrayList<Card> cultureDeck(String current){
      if(current.equals("Egypt")){
         newRandomDeck.add(new Card("Build 4"));
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build 2"));
         newRandomDeck.add(new Card("Build 2"));
         newRandomDeck.add(new Card("Build Nephthys"));
         newRandomDeck.add(new Card("Build Horus"));
         newRandomDeck.add(new Card("Explore 2"));
         newRandomDeck.add(new Card("Explore 2"));
         newRandomDeck.add(new Card("Explore 0"));
         newRandomDeck.add(new Card("Explore 0"));
         newRandomDeck.add(new Card("Explore Ptah"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather Bast"));
         newRandomDeck.add(new Card("Gather Ra"));
         newRandomDeck.add(new Card("Next Age Set"));
         newRandomDeck.add(new Card("Next Age Hathor"));
         newRandomDeck.add(new Card("Next Age Normal"));
         newRandomDeck.add(new Card("Next Age Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Thoth"));
      }
      else if(current.equals("Greek")){
         newRandomDeck.add(new Card("Build 4"));
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build 2"));
         newRandomDeck.add(new Card("Build 2"));
         newRandomDeck.add(new Card("Build Hera"));
         newRandomDeck.add(new Card("Explore 2"));
         newRandomDeck.add(new Card("Explore 2"));
         newRandomDeck.add(new Card("Explore 0"));
         newRandomDeck.add(new Card("Explore 0"));
         newRandomDeck.add(new Card("Explore Artemis"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather Poseidon"));
         newRandomDeck.add(new Card("Gather Hades"));
         newRandomDeck.add(new Card("Gather Dionysus"));
         newRandomDeck.add(new Card("Next Age Hephaestos"));
         newRandomDeck.add(new Card("Next Age Zeus"));
         newRandomDeck.add(new Card("Next Age Normal"));
         newRandomDeck.add(new Card("Next Age Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Hermes"));
      }
      else if(current.equals("Norse")){
         newRandomDeck.add(new Card("Build 4"));
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build 2"));
         newRandomDeck.add(new Card("Build 2"));
         newRandomDeck.add(new Card("Build Njord"));
         newRandomDeck.add(new Card("Explore 2"));
         newRandomDeck.add(new Card("Explore 2"));
         newRandomDeck.add(new Card("Explore 0"));
         newRandomDeck.add(new Card("Explore 0"));
         newRandomDeck.add(new Card("Explore Artemis"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather Skadi"));
         newRandomDeck.add(new Card("Gather Freyia"));
         newRandomDeck.add(new Card("Gather Thor"));
         newRandomDeck.add(new Card("Next Age Odin"));
         newRandomDeck.add(new Card("Next Age Normal"));
         newRandomDeck.add(new Card("Next Age Normal"));
         newRandomDeck.add(new Card("Next Age Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Forseti"));
         newRandomDeck.add(new Card("Trade Loki"));
      }
      Collections.shuffle(newRandomDeck);
      return newRandomDeck;
   }
   public Card drawCard(){
      Card tempCard = newRandomDeck.get(0);
      newRandomDeck.remove(0);
      return tempCard;
   }
   public int getSizeDeck(){
      return newRandomDeck.size();
   }
}
