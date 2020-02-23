import java.util.*;

class Apattern{
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\n Enter the height of the pattern : ");
        int n = s.nextInt();

        int irow=0;
        int nrows=n;
        int nspaces=n-1;
        int nstars=1; 

        while(irow<nrows){
            //print spaces
            int ispace=1;
            while(ispace<=nspaces){
                System.out.print("  ");
                ispace++;
            }

            //print stars
            int istar=1;
            while(istar<=nstars){
                if(irow<n/2&&(istar==1||istar==nstars)){
                System.out.print("* ");}
                else if(irow==n/2){
                    System.out.print("* ");
                }
                else if(irow>n/2&&(istar==1||istar==nstars)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                istar++;
            }

            System.out.println();
            //preparation for the next line
            if(irow<=nrows){
                nspaces--;
                nstars+=2;
            }
            irow++;
        }      
    }
}