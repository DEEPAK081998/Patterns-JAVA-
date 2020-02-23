import java.util.*;

class palindromepattern{
    public static void main(String [] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("\n Enter the size of the pattern : ");
        int n=s.nextInt();

        int nnumbers=1;
        int nrows=n;
        int irow=1;

        while(irow<=nrows){
            //print numbers
            int inumber=0;
            int whatnum=1;
            while(inumber<nnumbers/2){
                    System.out.print(whatnum+"\t");
                    whatnum++;
                    inumber++;
                }
            while(inumber>=nnumbers/2&&inumber<nnumbers){
                    System.out.print(whatnum+"\t");
                    whatnum--;
                    inumber++;
                }
            System.out.println();
            irow++;
            nnumbers=nnumbers+2;
            }           
        }
    }