
public class EqDo2Grau {
    public static void main(String[] args) {
        /*
         * (b**2) - 4ac
         * (-b +- math.sqrt(delta))
         */
        int a = 1;
        int b = 2 ;
        int c = 3;
        double delta = b*b- 4*a*c;      
        double x1;
        double x2;
System.out.println("delta é " +delta);
if (delta <0 ){
    System.out.println(" raizes inexistentes ");
}
 else  {
     x1 = (-b +  Math.sqrt(delta))/2*a;
System.out.println(x1);
    x2 = (-b -  Math.sqrt(delta))/2*a;
System.out.println(x2);

 }
    }
}
