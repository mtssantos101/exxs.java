
public class Devdojo3 {

    public static void main(String[] args) {
        int n1 = 3574;
        int n2 = 3248;
        int resultado = n1+n2;
        System.out.println(resultado);
        boolean isdezmnenor = n1 > n2;
        boolean isdezmaior = n1< n2; 
        boolean isdezigual = n1 == n2;
        boolean isddezdiferente = n1 != n2;
        System.out.println(isdezmnenor);
        System.out.println(isdezmaior);
        System.out.println(isdezigual);
        System.out.println(isddezdiferente);
        // && (and) || (or) !(not)
        int idade = 31 ;
        float salario = 3500F;
        boolean isdentromtsmaior = idade > 30 && salario >= 4612;
        boolean isforamtsmenor = idade < 30 && salario <= 4612;

        System.out.println("isdentromts " + isdentromtsmaior);
        System.out.println("isforamts " + isforamtsmenor);
        double contacorrente = 200;
        double contapoupança = 10000;
        float ps5 = 5000;
        boolean isps5compravel = contacorrente > ps5 || contapoupança >= ps5;
        System.out.println("isps5compravel "+isps5compravel);
        double bonus = 9000;
        bonus += 1000;
        System.out.println(bonus);

    }
}
