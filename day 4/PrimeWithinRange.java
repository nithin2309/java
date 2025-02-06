public class PrimeWithinRange{
    public static void main(String[] args){
        for(int i=2;i<=25;i++){
            int div=2;
            boolean isprime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }

            }
        }System.out.println("s prime number");
    }

    }
