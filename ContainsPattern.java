class ContainsPattern {
    public boolean containsPattern(int[] nums, int m, int pk) {
        for(int i=0; i<nums.length-m; i++){
            List<Integer> list1 = new ArrayList<>();
            for(int j=i; j<i+m; j++){
                list1.add(nums[j]);
            }
            int count = 1;
            for(int j=i+m; j<=nums.length-m; j=j+m){
                List<Integer> list2 = new ArrayList<>();
                
                for(int k=j; k<j+m; k++){
                    list2.add(nums[k]);
                }
                if(!list1.equals(list2)){
                    break;
                }
                count++;
                if(count >= pk){
                    return true;
                }
            }
        }
        return false;
    }
}
