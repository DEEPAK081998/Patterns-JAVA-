import java.util.*;

class watchGlass{
    public static void main(String[]args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the pattern : ");
        int n=s.nextInt();

        int nrows=n;
        int irow=1;
        int nspaces=0;
        int nstars=n;

        while(irow<=nrows){
            //print spaces
            int ispaces=1;
            while(ispaces<=nspaces){
                System.out.print("\t");
                ispaces++;
            }

            //print stars
            int istar=1;
            while(istar<=nstars){
                if(irow>1&&irow<=nrows/2&&istar>1&&istar<nstars){
                    System.out.print("\t");
                }
                else{
                System.out.print("*\t");
                }
                istar++;
            }

            System.out.println(); //Go to next line

            //preparation for the next line
            if(irow<=nrows/2){
                nspaces++;
                nstars-=2;
            }
            else{
                nspaces--;
                nstars+=2;
            }
            irow++;
        }
    }
}