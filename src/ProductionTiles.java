
public class ProductionTiles {
   private final String PRODNAME;
   private final Integer PRODVALUE;
   public ProductionTiles(String productionName){
      PRODNAME = productionName;
      PRODVALUE = 1;
   }
   @Override
   public String toString(){
      return PRODNAME;
   }
}
