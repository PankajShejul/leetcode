class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> answers0 = new ArrayList();
        List<Integer> answers1 = new ArrayList();

        List<Integer>  list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());;
        List<Integer>  list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());;
        

        for(int i=0;i<nums1.length; i++) {
            if(list2.contains(nums1[i]) || answers0.contains(nums1[i])) {
                System.out.print(nums1[i]+" "+list2.contains(nums1[i]));
                continue;
            }
            answers0.add(nums1[i]);
        }
        for(int i=0;i<nums2.length; i++) {
            if(list1.contains(nums2[i]) || answers1.contains(nums2[i])) continue;
            answers1.add(nums2[i]);
        }
        List<List<Integer>> answer = new ArrayList();
        answer.add(answers0);
        answer.add(answers1);
        return answer;
    }
}