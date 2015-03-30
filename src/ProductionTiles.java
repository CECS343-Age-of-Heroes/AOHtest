
import static java.lang.Integer.parseInt;


public class ProductionTiles {
   private String[] input;
   private String mProdName;
   private String mProdType;
   private Integer mProdValue;
   public ProductionTiles(String productionName){
      input = productionName.split(" ");
      mProdName = input[0];
      mProdType = input[1];
      mProdValue = parseInt(input[2]);
   }
   public String showInput(){
      return (input[0] + " " + input[1] + " " + input[2]);
   }
   @Override
   public String toString(){
      return mProdName;
   }
}
