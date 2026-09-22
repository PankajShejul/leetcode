class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap();
        for(int i=0; i<arr.length; i++){
            if(freq.get(arr[i]) != null) {
                int count = freq.get(arr[i]);
                freq.put(arr[i], ++count);
            } else {
                freq.put(arr[i], 1); 
            }
        }
        Set<Integer> set = freq.values().stream()
                             .collect(Collectors.toSet());
        return set.size()==freq.size();
    }
}