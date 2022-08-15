import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //loops
        // while loops
        // for loops

       // for(initialisation;condition;updation)

        for ( int counter = 0; counter <10 ; counter=counter +1){
            System.out.println("Hello World");
        }

        System.out.println("*************************************");

        //counter++ => counter = counter +1

        for( int counter =0;counter <11 ;counter++ ){
            System.out.println(counter);

        }

        System.out.println("*************************************");

        for( int i = 0;i<11;i++){
            System.out.println(i);
        }
        System.out.println("*************************************");

        //while

        int i =0;
        while (i< 11){
            System.out.println(i);
            i=i+1;//i++
        }

        System.out.println("*************************************");

        int I = 0;

        do{
            System.out.println(I);
            I=I+1;
        }while (I <11);

        System.out.println("*************************************");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for (int l=0 ; l<=n; l ++){
            sum=sum + l;
        }
        System.out.println(sum);

        System.out.println("*************************************");

        int k = sc.nextInt();

        for (int x = 1;x<11;x++){
            System.out.println(k*x);
        }






    }
}