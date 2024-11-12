import java.util.Scanner;

public class ScanRead {
    
    public static void main(String[] args) {
        
        //Scanner Definition
        Scanner scn = new Scanner(System.in);

        //Input is a string (one word)
        //read by next() function
        String str1 = scn.next();

        System.out.println("Entered String str1 : " + str1);

        //Input is a string (complete sentence)
        //read by nextline() function
        String str2 = scn.nextLine();

        System.out.println("Entered String str2 : " + str2);

        //Input is an Integer
        //read by nextInt() function
        int x = scn.nextInt();

        System.out.println("Entered Integer : " + x);

        float f = scn.nextFloat();

        System.out.println("Entered Float : " + f);


    }
}
