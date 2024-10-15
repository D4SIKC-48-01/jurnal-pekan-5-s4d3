import java.util.Scanner;

public class Jurnal05_PR04 {

    public static void main(String args[]){
        
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        //System.out.println(x);
        //System.out.println(y);
        
        for(int i=1; i<3 ; i++ ){
            System.out.println("Indeks i ke " + i);
            for(int j=1; j<=10 ; j++ ){
                System.out.print(j);
            }
            
            System.out.println();
            //System.out.println();
        }
}
}
