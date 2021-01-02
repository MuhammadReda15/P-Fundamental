import java.util.Scanner;
class Tugas17{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int nilai = input.nextInt();
    
    if (nilai % 2 == 0){
      System.out.println("Genap");
    }else{
      System.out.println("Ganjil");
      
    }
  }
}