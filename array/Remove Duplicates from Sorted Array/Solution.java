class Solution {
    public int removeDuplicates(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      int counter=0;
      for(int i =0;i<=nums.length-1;i++){
          if(!set.contains(nums[i])){
              nums[counter]=nums[i];
              counter++;
          }
          set.add(nums[i]);
      }
      return set.size();
    }
}
