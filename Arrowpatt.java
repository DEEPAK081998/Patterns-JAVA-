import java.util.*;

class Arrowpatt{
    public static void main(String [] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the arrow : ");
        int n=s.nextInt();
        

        for(int i=0;i<n;i++){
            int star=0;
            int wstar=0;
            for(int j=0;j<n;j++){
                
                if(j<n/2){
                    if(i!=n/2){
                    System.out.print("\t");
                    }
                    else{
                    System.out.print("*\t");
                    }
                }
                else if(j>=n/2){
                if(i<=n/2) {
                    
                    while(star<=i){
                    System.out.print("*\t");
                    star++;
                }}
                else if(i>n/2){
                    
                    while(wstar<n-i){
                        System.out.print("*\t");
                        wstar++;
                    }
                }
            }
        }
            System.out.println();
        }
    }
}