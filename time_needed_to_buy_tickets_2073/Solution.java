package time_needed_to_buy_tickets_2073;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ticketsRequired = tickets[k];
        int result = 0;
        int currentIndex = 0;

        while (currentIndex <= k) {
            int currentTicketsRequired = tickets[currentIndex];
            result += Math.min(currentTicketsRequired, ticketsRequired);
            currentIndex++;
        }

        while (currentIndex < tickets.length) {
            int currentTicketsRequired = tickets[currentIndex];
            result += (currentTicketsRequired < ticketsRequired) ? currentTicketsRequired : ticketsRequired - 1;
            currentIndex++;
        }

        return result;
    }
}