import java.util.Scanner;

public class Tugas28 {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

       
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        
        int[] angka = {a, b, c, d, e};
        int[] hasil = angka;
        
         for (int i = 4; i >= 0; i--) {
            System.out.println( hasil[i] + " " );
        }

        System.out.println();
    
      
    }
}