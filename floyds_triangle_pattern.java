package advancedpattern;

public class floyds_triangle_pattern {
    public static void floyds (int n){
        int counter = 1;
        for (int i=1; i<=n; i++){
            //inner how many times will counter be printer
            for (int j=1; j<=i; j++){
                System.out.print (counter + "");
                counter ++;

            }

            System.out.println();
        }

    }
    public static void main (String args []){
        floyds (5);
    }
}
