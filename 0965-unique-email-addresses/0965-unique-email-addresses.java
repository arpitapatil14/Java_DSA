class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> email= new HashSet<>();
        for(String name: emails){
            int i= name.indexOf("@");
            String local= name.substring(0,i);
            String domain=name.substring(i);
            if(local.contains("+")){
                local= local.substring(0,local.indexOf("+"));
            }
            local= local.replace(".","");
            email.add(local+domain);
        }
        return email.size();
        
    }
}