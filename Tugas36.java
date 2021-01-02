import java.util.Scanner;

class Tugas36 {
  public static void main(String[] args) {
    
        Scanner ax = new Scanner(System.in);
        
        double inputPanjang = ax.nextDouble();
        double inputLebar = ax.nextDouble();
        showpl(inputPanjang, inputLebar);
    }
    public static void showpl(double panjang, double lebar){
        System.out.println(luas(panjang, lebar));
        System.out.println(keliling(panjang, lebar));
    }

    public static double keliling(double panjang, double lebar){
        double hasil = (panjang + lebar) * 2;
        return hasil;
    }

    public static double luas(double panjang,double lebar){
        double hasil = panjang * lebar;
        return hasil;
    
  }
}