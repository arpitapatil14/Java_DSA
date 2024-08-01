class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String ans= details[i].substring(11,13);
            int age= Integer.parseInt(ans);
            if(age>60){
                count++;
            }
        }
        return count;
    }
}