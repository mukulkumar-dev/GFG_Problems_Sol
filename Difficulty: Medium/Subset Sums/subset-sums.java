// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        subset(arr,0,0,result);
        return result;
    }
    public static void subset(int[] arr, int index, int sum, ArrayList<Integer> result){
        if(index==arr.length){
            result.add(sum);
            return;
        }
        subset(arr, index+1, sum+arr[index], result);
        subset(arr, index+1, sum, result);
    }
}