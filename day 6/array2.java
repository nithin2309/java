public class array2 {

    public static void main(String[] args) {
        int a[] = {4, 8, 3, 6, 1};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (first > a[i]) {
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] > second) {
                third = second;
                second = a[i];
            }else if(third>a[i] && a[i]>second){
                third=a[i];
            }
        }System.out.println(first);
        System.out.println(second);

    }
}
