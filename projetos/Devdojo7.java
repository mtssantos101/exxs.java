
public class Devdojo7{
    public static void main(String[] args) {
        // Operadores Ternários
        // doar 500 pra ONG se salario > 5000
        double salário = 6000;
        String doação = "irei doar 500 para os dogs";
        String ndoação = "não irei doar 500 aos dogs"; 
         // (condição) ? verdadeiro : falso 

        String resultado = salário > 500 ? doação : ndoação;
        System.out.println(resultado);
            /*
             * OU 
             * double salário = 6000
             * String resultado = salário > 5000 ? "irei doar 500 para os dogs" : "não irei doar 500 aos dogs";
             * System.out.println(resultado);
             */
}
}