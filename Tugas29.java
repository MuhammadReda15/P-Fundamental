import java.util.Scanner;
public class Tugas29 {
  
  public static void main(String[] args) {
      int j=0;
      int[] arr=new int[40];
      int[] rev=new int[40];
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      for(int i=0;i<size;i++)
          arr[i]=sc.nextInt();
      for(int i=size-1;i>=0;i--) {
         rev[j]=arr[i];
            j++;
     }
      for(int i=0;i<size;i++)
      System.out.print(rev[i]+" ");
     }
}