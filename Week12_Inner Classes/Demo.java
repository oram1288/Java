public class Demo {

    public static void main(String[] args) {
        OuterClass OCObj = new OuterClass();
        OCObj.displayOC();

        OuterClass.innerClass ICObj = OCObj.new innerClass();
        ICObj.displayIC();
        
        
         
    }
    
    
}
