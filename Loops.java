public class Loops {
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(i);
            }
            if(i < 2)
                System.out.println();
        }
    }
}