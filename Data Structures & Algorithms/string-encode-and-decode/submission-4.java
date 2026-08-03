

class Solution {
    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }
        
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length());
            encoded.append('#');
            encoded.append(s);
        }
        return encoded.toString();
    }
    
    public List<String> decode(String s) {
        if (s == null || s.isEmpty()) {
            return new ArrayList<>();
        }
        
        List<String> decoded = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
            int j = s.indexOf('#', i);
            int length = Integer.parseInt(s.substring(i, j));
            String str = s.substring(j + 1, j + 1 + length);
            decoded.add(str);
            i = j + 1 + length;
        }
        
        return decoded;
    }
    

}