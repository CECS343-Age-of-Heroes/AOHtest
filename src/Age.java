
public class Age {
   private String timePeriod;
   private int cardDraw;
   public Age(){
      timePeriod = "Archaic";
      cardDraw = 4;
   }
   public String getAge(){
      return timePeriod;
   }
   public void newAge(){
      if(timePeriod.equals("Archaic")){
         timePeriod = "Classical";
         cardDraw = 5;
      }
      else if(timePeriod.equals("Classical")){
         timePeriod = "Heroic";
         cardDraw = 6;
      }
      else if(timePeriod.equals("Heroic")){
         timePeriod = "Mythic";
         cardDraw = 7;
      }
      else
         System.out.println("You cannot progress any further.");
   }
}
