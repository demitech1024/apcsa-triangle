import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("\nEnter a height for the triangle : ");
        double height = s.nextDouble();
        System.out.print("\nEnter a base for the triangle   : ");
        double base   = s.nextDouble();

        double area = (height * base) / 2;
        System.out.printf("\nThe area of a triangle with a height and base of %,.1f and %,.1f is %,.1f.\n\n", height, base, area);

        s.close();
    }
}