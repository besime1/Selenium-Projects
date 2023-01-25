import java.util.Scanner;

public class javaPractice {
    public static void main(String[] args) {
        class Area {
            double l, b;
            void setDim(double ll, double bb) {
                l = ll;
                b = bb;
            }double getArea() {
                return l * b;
            }
            public static void main(String args[]) {
                Scanner Sc = new Scanner(System.in);
                double l, b;

                System.out.print("Enter Length : ");

                l = Sc.nextDouble();

                System.out.print("Enter Breadth : ");

                b = Sc.nextDouble();

                Area rect = new Area();

                rect.setDim(l, b);

                System.out.print("Area of Rectangle : " + rect.getArea());

            }
        }

    }
}

