
public class Resource {
   private String mType;
   private int mValue;
   public Resource(String type){
      mType = type;
      mValue = 1;
   }
   public Integer getValue(){
      return mValue;
   }
   public String resourceType(){
      return mType;
   }
}
