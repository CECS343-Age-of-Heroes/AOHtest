
public class BuildingTiles {
   private final String BUILDNAME;
   private Value buildValue;
   public BuildingTiles(String buildName){
      BUILDNAME = buildName;
   }
   @Override
   public String toString(){
      return BUILDNAME;
   }
}
