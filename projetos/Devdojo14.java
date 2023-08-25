
public class Devdojo14 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        //byte, int, long, double 0
        // char 'u/0000 ' ' '
        // boolean false
        //String null

        idades[0]= 19;
        idades[1]= 41;
        idades[2]= 8;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        
        String [] nome = new String[3];
        nome[0]="zoro";
        nome[1]="sanji";
        nome[2]="luffy";
        for (int i = 0; i < 3; i++) {
            System.out.println(nome[i]);
        }
    }
}
 