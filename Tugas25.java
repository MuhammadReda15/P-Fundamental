import java.util.Scanner;
public class Tugas25 {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int h= input.nextInt();
    
    for (int i = 0; i <h; i++) {
      for (int j = 0; j < h; j++) {
        System.out.print(j);
        
      }
      
      System.out.println();

    }
  }
}