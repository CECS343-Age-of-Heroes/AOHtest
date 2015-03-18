
public class BuildingTiles {
   private String mBuildName;
   private Integer buildValue;
   public BuildingTiles(String buildName){
      mBuildName = buildName;
      buildValue = null;
   }
   @Override
   public String toString(){
      return mBuildName;
   }
}
