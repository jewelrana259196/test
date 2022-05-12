import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double m1, m2, m3, Hight, Lowst;

        System.out.print("Enter Your First Number: ");
        m1 = input.nextDouble();
        System.out.print("Enter Your second Number: ");
        m2 = input.nextDouble();
        System.out.print("Enter Your Third Number: ");
        m3 = input.nextDouble();
        if(m1>=m2 && m1>=m3){
            Hight = m1;
        }
        else if(m2>=m1 && m2>=m3){
            Hight = m2;
        }
        else {
            Hight = m3;
        }

        if(m1<=m2 && m1<=m3){
            Lowst = m1;
        }
        else if(m2<=m1 && m2<=m3){
            Lowst = m2;
        }
        else {
            Lowst = m3;
        }
        System.out.println("Hight number is "+ Hight);
        System.out.println("Lowst number is "+ Lowst);
    }
}
