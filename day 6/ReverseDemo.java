public class ReverseDemo {
    public static void main(String[] args) {
        String s="hello";
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        System.out.println("Reverse of "+s+" is "+res);

    }
    
}
