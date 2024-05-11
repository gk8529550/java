import java.util.Scanner;
public class kbcgame {
    public static void main(String[] args){
        // for(int i=1; i<5; i++){
        //     System.out.println(2*i+1);
        // }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your password to login in kbc");
        int a=sc.nextInt();
        if(a==7894)
        {
            System.out.println("you are successfully login in kbc game");
        }
        else{
            System.out.println("pasword  is wrong");
        }

        System.out.println("welcome to (kbc) kaun banega karod pati game");
        System.out.println("here are 1st questions for you for winning 5000rs");
        System.out.println("how many colors in indian national flag");
        System.out.println("(a)1 (b)2 (c)3 (d)4");
        int b=sc.nextInt();
        if(b==3){
            System.out.println("rght answer you have win the 5000rs");
        }
        else{
            System.out.println("better luck next time");
        }
        System.out.println("how many bananas in 1 darzan");
        System.out.println("(a)10 (b)11 (c)12 (d)14");
        int c=sc.nextInt();
        if(c==12){
            System.out.println("right answer you have win 10000rs");
        }
        else{
            System.out.println("wrong answer, better luck next time");
        }

    }
}
