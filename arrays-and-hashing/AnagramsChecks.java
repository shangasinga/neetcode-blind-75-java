class AnagramsChecks {
    public boolean isAnagram(String s, String t) {
        // First approach using frequency
        int[] frequency = new int[26];
        if(s.length() != t.length()) return false;
        // Looping through s characters and save their occurrences
        // in the frequence array
        for (char c : s.toCharArray()){
            frequency[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            frequency[c - 'a']--;
        }
        for(int i : frequency){
            if(i != 0) return false;
        }
        return true;
    }
}