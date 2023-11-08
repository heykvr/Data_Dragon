// Given an array arr[] of size N and an element k. The task is to find all elements in array that appear more than n/k times.

// Example 1:

// Input:
// N = 8
// arr[] = {3,1,2,2,1,2,3,3}
// k = 4
// Output: 2
// Explanation: In the given array, 3 and
//  2 are the only elements that appears 
// more than n/k times.











class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int a = n/k;
        int count=0;
        Map<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            
        }
        
        for(int c:hm.values()){
            if(c>n/k)
            count++;
        }
            

            
            
            
        
        return count;
    }
}
