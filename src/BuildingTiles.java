
public class BuildingTiles {
   private String mBuildName;
   private Value buildValue;
   public BuildingTiles(String buildName){
      mBuildName = buildName;
   }
   @Override
   public String toString(){
      return mBuildName;
   }
}
