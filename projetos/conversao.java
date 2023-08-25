import java.util.Scanner;
public class conversao {
  public static void main (String [] args){
    double euro= 5.43;
    double dolar= 4.99;
    double libra=6.35;
    double real;
    Scanner conversaoScanner = new Scanner(System.in);
    System.out.println("quanto gostaria de converter?");
    real= conversaoScanner.nextInt();
     double reuro= real/euro;
     double rdolar= real/dolar;
    double rlibra= real/libra;
    System.out.printf("você pode ter "+reuro+" euros, "+rdolar+" dolares "+"e "+rlibra+" libras" );
  }
}