public class CountChar {
    public static void main(String[] args) {
        String s="kjgihcihcjhvkjhv";
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }String s1=new String(c);
        System.out.println(s1);
        System.out.println("Length of string is "+s.length());



    }
    
}
