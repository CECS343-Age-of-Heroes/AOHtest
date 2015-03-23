
public class Resource {
   private final String TYPE;
   private final int VALUE;
   public Resource(String type){
      TYPE = type;
      VALUE = 1;
   }
   public Integer getValue(){
      return VALUE;
   }
   public String resourceType(){
      return TYPE;
   }
}
