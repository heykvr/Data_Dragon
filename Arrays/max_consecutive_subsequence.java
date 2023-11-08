
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.










class Solution {
    public int longestConsecutive(int[] a) {
        HashSet<Integer> h = new HashSet<>();
        int max=0,longest=0,ans=0;
        for(int i:a) h.add(i);
        for(int i:h){
            if(!h.contains(i-1)){
                max=1;
                longest=i;
                while(h.contains(longest+1)){
                    max+=1; longest+=1;
                }
            }
            ans=Math.max(ans,max);
        }
        return ans;
    }
}
