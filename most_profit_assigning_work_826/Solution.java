package most_profit_assigning_work_826;

public class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        //create variable to store maximum possibility of worker
        int maximumWorkerPossibility = 0;

        //for each worker
        for (int w : worker) {
            //store maximum possibility
            maximumWorkerPossibility = Math.max(maximumWorkerPossibility, w);
        }

        //create array that will cover each possibility
        int[] profitForPossibility = new int[maximumWorkerPossibility + 1];

        //for each difficulty
        for (int i = 0; i < difficulty.length; i++) {
            //if difficulty is lover than maximal possibility of workers
            if (difficulty[i] <= profitForPossibility.length) {
                //store the maximum between current profit and previously stored profit
                profitForPossibility[difficulty[i]] = Math.max(profitForPossibility[difficulty[i]],
                        profit[i]);
            }
        }

        //create variable to store profit of previous possibility
        int previousMaxProfit = 0;

        //for each possible possibility
        for (int i = 0; i < profitForPossibility.length; i++) {
            //if profit of possibility bigger than previous max
            if (profitForPossibility[i] > previousMaxProfit) {
                //make it new previous max
                previousMaxProfit = profitForPossibility[i];
            } else {
                //store previous max in possibility
                profitForPossibility[i] = previousMaxProfit;
            }
        }

        //create variable to store maximal possible profit
        int maximumProfit = 0;

        //for each worker
        for (int w : worker) {
            //sum it`s maximal profit
            maximumProfit += profitForPossibility[w];
        }

        return maximumProfit;
    }
}