public class JavaApplication1 {
    
    public static void HighestValue(int num, int num1, int num2){
        
        if(num > num1 && num > num2){
        
        System.out.println(num);
        
        }
        
        else if(num1 > num && num1 > num2){
            
            System.out.println(num1);
       
        }
        
        else if(num2 > num && num2 > num1){
            
            System.out.println(num2);
       
        }
    
    }
    
    public static void main(String[] args) {
        
        HighestValue(1,43,3);
    
    }
    
}