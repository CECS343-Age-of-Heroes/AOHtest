/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaz
 */
public class ProductionTiles {
   String mProductionName;
   Integer productionValue;
   public ProductionTiles(String productionName){
      mProductionName = productionName;
      productionValue = null;
   }
   public String productionType(){
      return mProductionName;
   }
}
