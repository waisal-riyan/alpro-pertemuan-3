import java.util.Scanner;
import java.util.Locale;
   
class LuasLingkaran {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
       
    System.out.println("Program Java Menghitung Luas Lingkaran");
    System.out.println("======================================\n");
      
    double r, luas;
  
    System.out.print("Input jari-jari lingkaran: ");
    r = input.nextFloat();
   
    luas = 3.14 * r * r;
       
    System.out.println("Luas lingkaran: "+luas);
  
  }
}