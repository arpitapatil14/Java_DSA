class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int max= numBottles;
        // int khalibottles=numBottles/numExchange;
        // int rem=numBottles % numExchange;
        // khalibottles+=rem;
        // while(khalibottles<=numExchange){
        //     if(khalibottles%numExchange==0){
        //         max++;
        //         khalibottles-=3;
        //     }
        // }
        // return max;
        int consumed = 0;
        while (numBottles >= numExchange) {
        consumed += numExchange;
        numBottles -= numExchange;
        numBottles += 1;
    }
        return consumed + numBottles;
        
    }
}