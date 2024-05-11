public class continue1 {

    public static void main(String[] args) {
        System.out.println("this is the continue statement:");
        if((i==3) &&(j==3)) continue;
        outer: for (int i=1; i<=5; i++) {
            System.out.println("\nrow no." +i " : ");
            inner:for(int j=1; j<=5; j++) {
                System.out.println("\t");
                if((i==3) &&(j==3)) continue;
                System.out.println(j);
            }
        }
    }
}