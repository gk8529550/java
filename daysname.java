import java.util.Scanner;

public class daysname {
    public static void main(String[] args)
    {
        System.out.println("print name of days using switch case");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any number to print of choice your day name");
        int num=sc.nextInt();
        switch(num) {
            case 1:
            System.out.println("sunady");
            break;
            case 2:
            System.out.println("monday");
            break;
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thursday");
            break;
            case 6:
            System.out.println("friday");
            break;
            case 7:
            System.out.println("saturday");
            break;
            default:
            System.out.println("value of intnum is out of rannge");
        }
    }
}
