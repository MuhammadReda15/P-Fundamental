import java.util.Scanner;
class Tugas32{
  
  public static void main(String[] args){
    
    Scanner scan= new Scanner(System.in);
    int [][] matrix = new int[5][5];
    
    for(int i = 0; i<5; i++){
      for(int j=0; j<5; j++){
        matrix[i][j]= scan.nextInt();
      }
    }
    
    for(int i = 0; i<5; i++){
      int sum= 0;
      for(int j=0; j<5; j++){
        sum=sum+matrix[i][j];
      }
      System.out.println(sum);
    }
    System.out.println();
    }
  }
