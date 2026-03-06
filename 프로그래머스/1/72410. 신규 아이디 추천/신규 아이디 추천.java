class Solution {
    public String solution(String new_id) {
        String answer = "";
        String regex = "[^a-z0-9]";
        
        new_id = new_id.toLowerCase();
        if(new_id.length() == 0) {
            return "aaa";
        }
        new_id = new_id.replaceAll("[^-_.a-z0-9]","");
        new_id = new_id.replaceAll("[.]+",".");
        
        if (!new_id.isEmpty()&& new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        if(!new_id.isEmpty()&& new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        if(new_id.length() == 0) {
            new_id = "a";
        }
        if (new_id.length() > 15) {
            new_id = new_id.substring(0,15);
            if (new_id.charAt(14) == '.') {
                new_id = new_id.substring(0,14);
            }
        }
        
        if (new_id.length() < 3) {
            String str = new_id.substring(new_id.length() - 1);
            while (new_id.length() < 3) {
                new_id += str;
            }
        }
        
        return new_id;
    }
}