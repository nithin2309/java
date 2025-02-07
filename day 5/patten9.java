public class patten9 {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<n*2;i++){
            int totalcollnrow=i>n?2*n-i:i;
            int space=n-totalcollnrow;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=totalcollnrow;k>0;k--){
                System.out.print(k);
            }
            
            for(int l=2;l<=totalcollnrow;l++){
                System.out.print(l);
            }
        
            System.out.println("");
            
        }
    }
    
}