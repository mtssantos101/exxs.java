
import javax.swing.JOptionPane;

public class Devdojo6 {
    public static void main (String [] args){
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;
                
        a = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de a: "));

        b = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de b: "));

        c = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de c: "));

        delta = b*b - 4*a*c ;

        if (delta <= 0) {
            System.out.println("Delta é igual a " + delta);
            System.out.println("Raízes inexistentes!");}

        else {
            x1 = (-b + Math.sqrt(delta)) / 2*a;
            x2 = (-b - Math.sqrt(delta)) / 2*a;
            
            System.out.println("Delta é igual a " + delta);
            System.out.println("x1 é igual a " + x1);
            System.out.println("x2 é igual a " + x2);}
    }
}