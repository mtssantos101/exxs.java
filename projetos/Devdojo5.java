
public class Devdojo5{
    public static void main(String[] args) {
        int idade = 90;
        String categoria = ""; 
        if (idade < 15) {
            categoria = "categoria infantil";
        } else if(idade >= 15 && idade < 18) {
            categoria = "categoria juvenil";
        } else if (idade >= 18 ) {
            categoria = "categoria adulta";
        }
            System.out.println (categoria);
    }
}