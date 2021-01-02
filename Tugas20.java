import java.util.Scanner;
class Tugas20{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int nilai = input.nextInt();
    
    switch (nilai){
      case 1:
        System.out.println("Satu");
        System.out.println("Dua");
        System.out.println("Tiga");
        break;
      case 2:
        System.out.println("Dua");
        System.out.println("Tiga");
        break;
      case 3:
        System.out.println("Tiga");
        break;
    }
  }
}