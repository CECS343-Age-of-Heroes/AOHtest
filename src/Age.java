
public class Age {
   private String timePeriod;
   public Age(){
      timePeriod = "Archaic";
   }
   public String getAge(){
      return timePeriod;
   }
   public void newAge(){
      if(timePeriod.equals("Archaic"))
         timePeriod = "Classical";
      else if(timePeriod.equals("Classical"))
         timePeriod = "Heroic";
      else if(timePeriod.equals("Heroic"))
         timePeriod = "Mythic";
      else
         System.out.println("You cannot progress any further.");
   }
}
