public class Loops2 {
    
    public static void main(String[] args) {
        
        int i = 1, j = 1;

        while(i <= 3){

            while(j <= 3){
                System.out.print(j);
                j++;
            }
            System.out.println("");
            i++;
            j = 1;
        }
    }
}
