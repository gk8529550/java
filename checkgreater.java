import javax.swing.JOptionPane;
class checkgreater{
    public static void main(String[] args){
        int n1,n2;
        String strnote1,strnote2,strn1,strn2;
        strnote1="enter the first integer:n1";
        strnote2="enter second integer: n2";
        strn1=JOptionPane.showInputDialog(strnote1);
        strn2=JOptionPane.showInputDialog(strnote2);
        n1=Integer.parseInt(strn1);
        n2=Integer.parseInt(strn2);
        if(n1>n2)
        System.out.println("n1>n2");
        else if(n1==n2)
        System.out.println("n1==n2");
        else 
        System.out.println("n1<n2");
        System.exit(0);

    }
}