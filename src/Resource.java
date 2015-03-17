
public class Resource {
   private String mType;
   private int value;
   public Resource(String type){
      mType = type;
      value = 1;
   }
   public Integer getValue(){
      return value;
   }
   public String resourceType(){
      return mType;
   }
}
