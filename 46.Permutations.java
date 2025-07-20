//using Recursion and Backtracking
//Time Complexity: O(n! * n) where n is the length of the input array

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }
    private void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums){
        if(tempList.size() == nums.length){   //base case
            //when the size of tempList is equal to the size of nums, we have a complete permutation
            //so we add a copy of tempList to resultList
            resultList.add (new ArrayList<>(tempList));
            return;
        }

        for(int number : nums){
            if(tempList.contains(number))
            continue;

            tempList.add(number);

            backtrack(resultList, tempList , nums);//recursive call to continue building the permutation

            tempList.remove(tempList.size() - 1); //backtrack by removing the last added number
        }
    }
}