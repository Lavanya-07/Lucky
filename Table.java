import java.util.Scanner;
public class Table
{
    static int a,b;
    public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.print("Enter number:");
    int m=a.nextInt();
    Scanner b=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=b.nextInt();
    for(int i=1;i<=n;i++){
        System.out.println(m+"x"+i+"="+(m*i));
         }
    }
}
