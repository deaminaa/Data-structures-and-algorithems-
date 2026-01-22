class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        int m=n;
        long N = n;
        if(N<0){
            N=N*-1;
        }
        while(N>0){
            if(N%2==1){
                ans=ans*x;
                N--;
            }
            else{
                x=x*x;
                N=N/2;
            }
        }
        if(m>0)
        return ans;
        else 
        return (1.0/ans);
        
    }
}