import java.util.*;

class Hpattern{
    public static void main(String [] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the pattern (ODD NO.) : ");
        int n=s.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==n-1){
                    System.out.print("* ");
                }
                else if(i==n/2){
                    System.out.print("* ");       //NESTED 'FOR LOOPS' METHOD
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("__________________________________________________\n"); //DIVIDER

        int nrows=n;
        int nstars=1;
        int nspaces=n-2;
        int irow=1;

        while(irow<=nrows){
            if(irow==(nrows/2)+1){
                int k=1;
                while(k<=nrows){
                    System.out.print("* ");
                    k++;
                }
            }
            
            else{
            //print stars
            int istar=1;
            while(istar<=nstars){
                System.out.print("* ");
                istar++;
            }
                                                       //GENERIC METHOD
            //print spaces
            int ispace=1;
            while(ispace<=nspaces){
                System.out.print("  ");
                ispace++;
            }

            //print stars
            istar=1;
            while(istar<=nstars){
                System.out.print("* ");
                istar++;
            }
        }
            System.out.println();
            irow++;
        }
    }
}