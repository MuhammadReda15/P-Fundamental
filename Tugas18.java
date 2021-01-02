import java.util.Scanner;
class Tugas18{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
     int nilai = input.nextInt();
     
     if (nilai>=55){
       String outt = "Selamat! Anda lulus dengan nilai "+ nilai;
       System.out.println(outt);
     }
       System.out.println("Program selesai");
  }
}