package cons;

public class CountObject {

	private static int objcounter=0;
    private static int i;
    public CountObject(){
        objcounter++;
        
    }
    public CountObject(int obj){
        i=obj;
        objcounter++;
    }
    public static int totalObjects(){
        return objcounter;
        
    
}
}
