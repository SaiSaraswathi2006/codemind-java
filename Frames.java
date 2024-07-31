import java.util.Scanner;
public class Frames{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int x,y,z;
        x=read.nextInt();
        y=read.nextInt();
        z=read.nextInt();
        int cost=(2*(x+y))*z;
        System.out.println(cost);
    }
}