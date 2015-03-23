
import java.util.ArrayList;

public class Player {
   private final String NAME;
   private final Culture CULTURE;
   private final Age AGE;
   private final ArrayList<Card> CARDS;
   private final ArrayList<Resource> RESOURCES;
   private final ArrayList<BuildingTiles> BUILDINGT;
   private final ArrayList<ProductionTiles> PRODUCTIONT;
   private Integer victoryPoints;
   private final Action MOVE;
   private final Deck DECK;
   boolean turn;
   public Player(String name, String culture){
      NAME = name;
      CULTURE = new Culture(culture);
      AGE = new Age();
      CARDS = new ArrayList();
      RESOURCES = new ArrayList();
      BUILDINGT = new ArrayList();
      PRODUCTIONT = new ArrayList();
      victoryPoints = 0;
      MOVE = new Action();
      DECK = new Deck(culture);
      turn = false;
   }
   public String getName(){
       return NAME;
   }
   public String getCulture(){
      return CULTURE.showCulture();
   }
   public String currentAge(){
      return AGE.getAge();
   }
   public void changeAge(){
      AGE.newAge();
   }
   public Integer cardQuantity(){
      return CARDS.size();
   }
   public void drawCard(){
      MOVE.drawCard(DECK, AGE, CARDS);
   }
   public void showHand(){
      for (Card card : CARDS) {
         System.out.println(card.getCardName());
      }
      System.out.println(DECK.getSizeDeck());
   }
   public Integer resourceQuantity(String resourceType){
      int quantity = 0;
      for (Resource resource : RESOURCES) {
         if (resource.resourceType().equals(resourceType)) {
            quantity = quantity + resource.getValue();
         }
      }
      return quantity;
   }
   public void addResource(String newResource){
      Resource tempRes = new Resource(newResource);
      RESOURCES.add(tempRes);
   }
   public void buildBuilding(String newBuilding){
      MOVE.buildBuildT(newBuilding, BUILDINGT);
   }
   public void placeProduction(String newProduction){
      MOVE.drawProdT(newProduction, CULTURE.showCulture(), PRODUCTIONT);
   }
   public Integer productionSize(){
      return PRODUCTIONT.size();
   }
   public Integer buildingSize(){
      return BUILDINGT.size();
   }
   public Integer victoryPtsQuantity(){
      return victoryPoints;
   }
   public void addVictoryPts(Integer addThisMuch){
      victoryPoints = victoryPoints + addThisMuch;
   }
}
