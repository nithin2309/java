public class StringBuilderDemo {

    public static void main(String[] args) {
        String s = "hello world";
        StringBuilder sb = new StringBuilder(s);
        sb.append("s");
        sb.toString();
        System.out.println(s);
        StringBuilder sb1 = new StringBuilder("cat");
        sb1.reverse();
        System.out.println(sb1);
    }

}
