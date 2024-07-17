import java.util.Scanner;

public class SwapStringwithInput 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the First Name: ");
        String x = sc.nextLine();
        System.out.print("Please enter the Last Name : ");
        String y = sc.nextLine();
        String swap = "";
        swap = x;
        x = y;
        y = swap;
        System.out.println("After swapping First Name and Last Name: "+ x +" "+ y);

    }
}
