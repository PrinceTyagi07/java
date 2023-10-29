class Dp {
    public int findDuplicate(int[] nums) {
          HashMap<Integer,Integer> map=new HashMap<>();
          int ans = 0;
          for(int item:nums){
              if(map.containsKey(item)){
                  ans=item;
                  break;
              }
              else
              map.put(item,item);
          }
          return ans;
    }
}