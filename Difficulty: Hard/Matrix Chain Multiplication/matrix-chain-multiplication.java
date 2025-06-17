class Solution {
    static int matrixMultiplication(int arr[]) {
        // code here
        int[][] dp=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(arr,1,arr.length-1,dp);
        
    }
    static int solve(int arr[], int i, int j,int[][] dp){
        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        
        int result=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=solve(arr,i,k,dp);
            int cost2=solve(arr,k+1,j,dp);
            int cost3=arr[i-1]* arr[k]*arr[j];
            
            int finalCost=cost1+cost2+cost3;
            result=Math.min(result, finalCost);
        }
        return dp[i][j]=result;
    }
}