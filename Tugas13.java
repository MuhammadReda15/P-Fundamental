import java.util.Scanner;

class Tugas13 {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      String nama = input.next();
      
      int tahun = input.nextInt();
      
      int umur = 2020 - tahun;
      
      System.out.printf("%s (%d tahun)", nama, umur);
  
       
    }
}