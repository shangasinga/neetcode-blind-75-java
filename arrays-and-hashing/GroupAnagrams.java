class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            int []wordFrequency = new int[26];
            for(char c : word.toCharArray()){
                wordFrequency[c - 'a']++;
            }

            // Serialize the word frequency array
            StringBuilder sb = new StringBuilder();
            for(int num : wordFrequency){
                sb.append(num).append('#');
            }
            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}