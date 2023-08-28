
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
public class exceçoes{
    public static void main(String[] args) {
    try{
        Scanner scaner= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite sua altura");
        double altura = scaner.nextDouble();

        System.out.println("digite seu nome completo");
        String nome = scaner.next();

        System.out.println("digite seu email");
        String email = scaner.next();
        

        System.out.println("digite sua idade");
        int idade = scaner.nextInt();
        

    System.out.println("oii, sou o "+nome);
    System.out.println("tenho "+altura+"de altura");
    System.out.println("meu emai é "+email);
    System.out.println("tenho "+idade+" anos");
    }
    catch(InputMismatchException e) {
        System.err.println("nos campos idade e altura coloque somente números");
    }
}
}