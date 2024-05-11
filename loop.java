import java.util.Scanner;

public class loop{
    public static void main(String[] args) {
      int i = 4;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any value");
      int a=sc.nextInt();
      while (i < 60) {
        System.out.println(i);
        i++;
      }  
    }
  }
  