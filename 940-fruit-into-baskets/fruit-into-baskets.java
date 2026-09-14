class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> basket=new HashMap<>();
        int start=0;
       
        int maxCount=0;
        for(int i=0;i<fruits.length;i++){
          basket.put(fruits[i], basket.getOrDefault(fruits[i], 0) + 1);
           
            while(basket.size()>2){
           basket.put(fruits[start], basket.get(fruits[start]) - 1);
          if (basket.get(fruits[start]) == 0)
                    basket.remove(fruits[start]);
                start++;
            }
             maxCount = Math.max(maxCount, i - start + 1);
            }
            return maxCount;

        } 
        
    }
