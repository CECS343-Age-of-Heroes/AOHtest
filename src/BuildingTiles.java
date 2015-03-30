
import java.util.ArrayList;


public class BuildingTiles {
   private String mBuildName;
   private ArrayList<Value> mBuildValue;
   public BuildingTiles(String buildName,ArrayList<Value> buildValue){
      mBuildName = buildName;
      mBuildValue = buildValue;
   }
   public ArrayList<Value> getValue(){
      return mBuildValue;
   }
   @Override
   public String toString(){
      return mBuildName;
   }
}
