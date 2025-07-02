class Solution {
    // Function to arrange all letters of a string in lexicographical
    // order using Counting Sort.
    public static String countSort(String arr) {
        // code here
        int[] count=new int[26];
        for(int c:arr.toCharArray()){
            count[c-'a']++;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<26;i++){
            while(count[i]-->0){
                str.append((char) (i+'a'));
            }
        }
        return str.toString();
    }
}