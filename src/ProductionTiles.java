
public class ProductionTiles {
   private String mProductionName;
   private Integer productionValue;
   public ProductionTiles(String productionName){
      mProductionName = productionName;
      productionValue = 1;
   }
   @Override
   public String toString(){
      return mProductionName;
   }
}
