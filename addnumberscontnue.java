import java.util.Scanner;

public class addnumberscontnue {
    public static void main(String[] args){
        int intsum=0,intcounter=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to want ot add you:");
             int a=sc.nextInt();
        while (intcounter<a) {
            intcounter=intcounter+1;
            intsum=intsum+intcounter;
            // Scanner sc=new Scanner(System.in);
            // int a=sc.nextInt();   
        }
        
        System.out.println("the sum of your input number :" +intsum);
    }
}
