class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(String[] ids_pws: db) {
            if(ids_pws[0].equals(id_pw[0])) {
                if(ids_pws[1].equals(id_pw[1])) {
                    return "login";
                }
                return "wrong pw";
            }
        }
        return "fail";
    }
}