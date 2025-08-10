class Solution {
    public boolean containsDuplicate(int[] nums) {

        // APPROACH 1
        HashSet <Integer> map= new HashSet<>();

        for(int n:nums){
            if(map.contains(n)){
                return true;
            }
            map.add(n);
        }
        return false;
        
    }
}
// APPROACH 2 BY SORTING WITH 2 LOOPS and then comparison 
// when the i will equal to j then return true 
