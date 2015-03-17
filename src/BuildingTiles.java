
public class BuildingTiles {
   private String mBuildName;
   private Integer buildValue;
   public BuildingTiles(String buildName){
      mBuildName = buildName;
      buildValue = null;
   }
   public String buildType(){
      return mBuildName;
   }
}
