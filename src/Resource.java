
public class Resource {
   private String mType;
   private int mValue;
   public Resource(String type,int value){
      mType = type;
      mValue = value;
   }
   public Integer getValue(){
      return mValue;
   }
   public String resourceType(){
      return mType;
   }
}
