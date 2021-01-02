import java.io.*;
import java.util.*;

class Tugas33{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int angka=0;
    int totalganjil=0;
    try{
      while(true){
        angka=scan.nextInt();
        if(angka%2!=0){
          totalganjil++;
        }
      }
    }
    
    catch(NumberFormatException e){
      System.out.println(totalganjil);
    }
    catch(Exception e){
      System.out.println(totalganjil);
    }
    
  }
}