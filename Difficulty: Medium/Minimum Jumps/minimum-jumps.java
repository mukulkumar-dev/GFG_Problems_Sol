//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            System.out.println(new Solution().minJumps(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr) {
        // code here
       int maxReach=0;
       int lastIndex=0;
       int jump=0;
       if(arr.length==1){
           return 0;
       }
       for(int i=0;i<arr.length;i++){
           maxReach=Math.max(maxReach,i+arr[i]);
           
           if(lastIndex==i){
               if(maxReach==i){
                   jump=-1;
                   break;
               }
               lastIndex=maxReach;
               jump++;
               if(maxReach>=arr.length-1){
                   break;
               }
           }
       }
       return jump;
    }
}