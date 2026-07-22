class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> group = new HashMap<>();

        for(String str : strs){
            char[] sort = str.toCharArray();
            Arrays.sort(sort);
            String code = new String(sort);           

            if(group.containsKey(code)){
                List<String> list = group.get(code);
                list.add(str);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(str);
                group.put(code, newList);
            }
        }return new ArrayList<>(group.values());
    }
}
