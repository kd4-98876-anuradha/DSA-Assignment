class SolutionQ6 {
    public String removeDuplicates(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(res.length()> 0 && res.charAt(res.length()-1)==s.charAt(i)){
                res.deleteCharAt(res.length()-1);
            }
            else
                res.append(s.charAt(i));
        }
        return res.toString();
    }
}