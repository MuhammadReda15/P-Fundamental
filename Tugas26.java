import java.util.Scanner;
public class Tugas26 {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int h= input.nextInt();
    
    for (int i = 1; i <=h; i++) {
      for (int j = 1; j <= h; j++) {
        System.out.print("*");
        
      }
      
      System.out.println();

    }
  }
}