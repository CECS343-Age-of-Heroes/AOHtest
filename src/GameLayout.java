
public class GameLayout {
   public static void main(String[] args) {
      Player player1 = new Player("Billy","Norse");
      System.out.println(player1.getName());
      System.out.println(player1.getCulture());
      System.out.println(player1.currentAge());
      player1.changeAge();
      System.out.println(player1.currentAge());
      player1.placeProduction("Desert");
      player1.placeProduction("Desert");
      System.out.println(player1.productionSize());
      player1.buildBuilding("Quarry");
      player1.buildBuilding("Wall");
      player1.buildBuilding("Quarry");
      System.out.println(player1.buildingSize());
   }
    

}
