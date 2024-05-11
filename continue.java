class h {
    public static void main(String[] args){
//         System.out.println("this is the continue statemnet ");
//         int intcounter=0;
//         while(intcounter<5)
//         {
//             // System.out.println("\nIteration no. " +intcounter);
//             // if(intcounter == 3) continue;
//             // System.out.println("Iteration no." );
//         }
//     }
// }

int intsum=0, intcounter = 0;
while (intcounter<7) {
    intcounter=intcounter+1;
    if(intcounter==6) continue;
    intsum=intsum+intcounter;
}
System.out.println("the sum is:" +intsum);
    }
    
}