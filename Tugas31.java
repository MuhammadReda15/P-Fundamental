import java.util.Scanner;
public class Tugas31{
  
  public static void main(String[] args){
    
    int ww;
    int xx ;
    String yy;
    int zzzz;
    
    Scanner pir = new Scanner(System.in);
    
    xx = pir.nextInt();
    ww = pir.nextInt();
    zzzz = pir.nextInt();
    
    switch(ww){
      case 1: 
        yy= "Januari";
        break;
      case 2: 
        yy = "Februari";
        break;
      case 3: 
        yy = "Maret";  
        break;
      case 4: 
        yy = "Aptil";
        break;
      case 5: 
        yy = "Mei";
        break;
      case 6: 
        yy = "Juni";
        break;
      case 7: 
        yy = "Juli";
        break;
      case 8: 
        yy = "Agustus";
        break;
      case 9: 
        yy = "September";
        break;
      case 10: 
        yy = "Oktober";
        break;
      case 11: 
        yy = "November";
        break;
      case 12: 
        yy = "Desember";
        break;
      
      default:
      yy = "Nomor tidak valid";
    }
    
    System.out.print(xx +" "+ yy+" " +zzzz);
  }
}