
public class Devdojo8{
    public static void main(String[] args) {
        /*
         * $0  $34.712  9.70%
         * $34.713  $68.507  37.35%
         * $68.507 49.50%
         */
        double salárioAnual= 70000;
        double primeiraTaxa = 9.70/100;
        double segundaTaxa = 37.35/100 ;
        double terceiraTaxa = 49.50/100;
        double imposto = 0;
            if (salárioAnual<= 34712 ) {
              imposto =  salárioAnual *primeiraTaxa;
             } 
             else if ( salárioAnual >=34713 && salárioAnual <= 68507 ) {
             imposto = salárioAnual *segundaTaxa;
             }
             else if ( salárioAnual > 68507 ) {
             imposto = salárioAnual * terceiraTaxa;
             }
             System.out.println(imposto);
    }
}