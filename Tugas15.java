import java.util.Scanner;
import java.util.Locale;
public class Tugas15{
  
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
    Locale bahasa = new Locale ("id");
    int uang = x.nextInt();
    
    System.out.printf(bahasa,"Rp%,d,-\n",uang);
  }
}