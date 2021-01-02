import java.util.Scanner;
public class Tugas30{
  
  public static void main(String[] args){
    
    int angka ;
    String nama;
    
    Scanner pir = new Scanner(System.in);
    
    angka = pir.nextInt();
    
    switch(angka){
      case 1: 
        nama = "Januari";
        break;
      case 2: 
        nama = "Februari";
        break;
      case 3: 
        nama = "Maret";  
        break;
      case 4: 
        nama = "Aptil";
        break;
      case 5: 
        nama = "Mei";
        break;
      case 6: 
        nama = "Juni";
        break;
      case 7: 
        nama = "Juli";
        break;
      case 8: 
        nama = "Agustus";
        break;
      case 9: 
        nama = "September";
        break;
      case 10: 
        nama = "Oktober";
        break;
      case 11: 
        nama = "November0";
        break;
      case 12: 
        nama = "Desember";
        break;
      
      default:
      nama = "Nomor tidak valid";
    }
    
    System.out.print(nama);
  }
}