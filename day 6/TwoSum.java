public class TwoSum {
    public static void main(String[] args) {
        int num[] = {7,1,5};
        int target = 8;
        int result[] = new int[2];
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]+num[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
    }
    
}
