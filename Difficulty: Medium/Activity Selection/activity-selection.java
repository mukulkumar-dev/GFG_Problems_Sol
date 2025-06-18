
class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int[][] arr=new int[start.length][2];
        int count=1;
        
        for(int i=0;i<start.length;i++){
            arr[i][0]=start[i];
            arr[i][1]=finish[i];
        }
        
       Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        
        int j=0;
        for(int i=1;i<start.length;i++){
            if(arr[i][0]>arr[j][1]){
                count++;
                 j=i;
            }
        }
        return count;
    }
}
