import java.util.*;

class diamondpatt{
    public static void main(String[]args) {
    Scanner s=new Scanner(System.in);
    System.out.print(" Enter the size of the pattern (ODD) : ");
    int n=s.nextInt();

    int nstars=1;
    int nrows=n;
    int nspaces=n/2;
    int irow=0;

    while(irow<nrows){
        //print spaces
        int ispace=1;
        while(ispace<=nspaces){
            System.out.print("\t");
            ispace++;
        }

       //print stars
       int istar=1;
       while(istar<=nstars){
           System.out.print("*\t");
           istar++;
       }

       System.out.println();  //go to next line

       //preparation for the next line
       if(irow<n/2){
          nspaces--;
          nstars+=2;
       }
       else{
           nspaces++;
           nstars-=2;
       }
       irow++;
    }
}
} 
    
