import java.util.Scanner;
public class Hypotenuse{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int a,b;
        double hy;
        a=read.nextInt();
        b=read.nextInt();
        hy=Math.sqrt((a*a)+(b*b));
        System.out.println(String.format("%.2f",hy));
    }
}