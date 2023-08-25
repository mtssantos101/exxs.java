
public class Devdojo10 {
    public static void main(String[] args) {
        // dado os valores de 1 a 7, imprima na tela se é dia útil ou final de semana 
        // considerando domingo como dia 1 
        byte dia= 5;
        switch(dia){
            case 1: 
                System.out.println("final de semana");
                break;
            case 2: 
                System.out.println("dia útil");
                break;
            case 3: 
                System.out.println("dia útil");
                break;
            case 4: 
                System.out.println("dia útil");
                break;
            case 5: 
                System.out.println("dia útil");
                break;
            case 6: 
                System.out.println("dia útil");
                break;
            case 7: 
                System.out.println("final de semana");   
                break;
            default:
                System.out.println("inválido");
            /* OU
             *  byte dia= 5;
                switch(dia){
                case 1: 
                case 7: 
                    System.out.println("final de semana");
                        break;
                case2:
                case3:
                case4:
                case5:
                case6:
                    System.out.println("dia útil");
                        break;

             */
        }
    }
}
