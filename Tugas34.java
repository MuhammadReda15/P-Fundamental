import java.util.Scanner;
class Tugas34 {
  
  public static void main(String[] args) {
    
    int i, j, m, n;
    Scanner scan = new Scanner(System.in);
    
    m= scan.nextInt();
    n= scan.nextInt();
    int matriks1[][] = new int[m][n];
    
        for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks1[i][j] = scan.nextInt();
      }
      }
      
      for (i = 0; i < m; i++) {
         int ganjil=0;
      for (j = 0; j < n; j++) {
        if(matriks1[i][j]%2==1){
          ganjil++;
        }
      }
       System.out.print(ganjil);
     }
      
       System.out.println();
  }
}
