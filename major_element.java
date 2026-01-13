import java.util.*;

public class major_element{
    public static void main(String[] args){
        int[] arr={1,2,4,4,4,4,6};
        int check= majorelement(arr);
        if (check>-1) {
            System.out.println("major element is "+check);
        }
        else{
            System.out.println("no major element available ");
        }


}
static int majorelement(int[] nums){
    int major=nums[0];
    int count=1;
    int n = nums.length;
    for (int i = 1; i < nums.length; i++) {
        if(nums[i]==major)
            count++;
        else
            count--;
    if(count==0){
        major=nums[i];
    count=1;}
        
    }
    
    //candidate verification

    int final_count=0;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i]==major)
            final_count++;      
    }
    if(final_count>n/2)
        return major;
    else 
        return -1;
}
}
