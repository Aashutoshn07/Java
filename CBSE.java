import java.util.Scanner;
public class CBSE {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner fiwe = new Scanner(System.in);

       System.out.println("Enter your marks of physics ");
       float a = fiwe.nextFloat();

       System.out.println("Enter your marks of Chemistry ");
       float b = fiwe.nextFloat();

       System.out.println("Enter your marks of Maths ");
       float c = fiwe.nextFloat();

       System.out.println("Enter your marks of English ");
       float d = fiwe.nextFloat();

       System.out.println("Enter your marks of Physical Education ");
       float e = fiwe.nextFloat();

       float sum = (a+b+c+d+e);
       short total=500;
       float Percentage=(sum/total)*100;
       System.out.print("Your Percentage is : ");
       System.out.println(Percentage);

    }
}
