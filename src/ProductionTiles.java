
public class ProductionTiles {
   String mProductionName;
   Integer productionValue;
   public ProductionTiles(String productionName){
      mProductionName = productionName;
      productionValue = 1;
   }
   public String productionType(){
      return mProductionName;
   }
}
