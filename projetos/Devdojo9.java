
public class Devdojo9 {
    public static void main (String [] agrs){
        // imprima o dia, sendo domingo dia 1 
        byte dia = 19;
        // char, int, byte, short, enum, String 
        switch (dia) {
            case 1:
                 System.out.println("domingo");
                    break;
            case 2:
                 System.out.println("segunda");
                    break;
            case 3:
                 System.out.println("terça");
                    break;
            case 4:
                 System.out.println("quarta");
                    break;
            case 5:
                 System.out.println("quinta");
                    break;
            case 6:
                 System.out.println("sexta");
                    break;
            case 7:
                 System.out.println("sábado");
                    break;
            
            default: // caso nenhuma das opções se encaixar 
                System.out.println("opção inválida");
                    break;
         }
         char sexo ='M';
         switch(sexo){
            case'M': 
                System.out.println("homem!!!");
                    break;
            case'F': 
                System.out.println("mulher kkkkk");
                    break;
            default: 
                System.out.println("inválido");
        }
    }
}
    
