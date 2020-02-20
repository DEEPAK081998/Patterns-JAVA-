import java.util.*;

class hollowdiamond{
    public static void main(String[]args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of the pattern : ");
        int n=s.nextInt();
        int para=n/2;                      //parameter that helps to determine the position of stars

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    if(j==para||j==n-para-1){          //across the whole pattern, stars will be present at this position
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    } 
            }
            if(i<n/2){
                para--;
            }
            else{
                para++;
            }
            System.out.println();
        }
    }
}
