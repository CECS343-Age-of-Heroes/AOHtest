
public class ProductionTiles {
   private String mProdName;
   private Integer mProdValue;
   public ProductionTiles(String productionName){
      mProdName = productionName;
      mProdValue = 1;
   }
   @Override
   public String toString(){
      return mProdName;
   }
}
