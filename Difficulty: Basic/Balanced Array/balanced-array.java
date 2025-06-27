// User function Template for Java

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int sum=0;
        int sum1=0;
        for(int i=0;i<arr.size()/2;i++){
            sum+=arr.get(i);
        }
        for(int i=arr.size()/2; i<arr.size();i++){
            sum1+=arr.get(i);
        }
        return Math.abs(sum-sum1);
    }
}