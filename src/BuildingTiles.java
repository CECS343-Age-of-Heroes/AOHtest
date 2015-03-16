/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaz
 */
public class BuildingTiles {
   String mBuildName;
   Integer buildValue;
   public BuildingTiles(String buildName){
      mBuildName = buildName;
      buildValue = null;
   }
   public String buildType(){
      return mBuildName;
   }
}
