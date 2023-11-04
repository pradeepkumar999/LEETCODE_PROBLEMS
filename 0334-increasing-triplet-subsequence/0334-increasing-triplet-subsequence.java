class Solution {
    public boolean increasingTriplet(int[] nums) {
    int n=nums.length;
    int left[]=new int[n];
    int right[]=new int[n];
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        if(nums[i]<min) {
            min=nums[i];
        }
        left[i]=min;
      }
      for(int i=n-1;i>0;i--){
        if(nums[i]>max) {
            max=nums[i];
        }
        right[i]=max;
      }
      for(int i=0;i<n;i++){
          if(left[i]<nums[i]&&nums[i]<right[i]){
              return true;
          }
      }
      return false;
    }
}