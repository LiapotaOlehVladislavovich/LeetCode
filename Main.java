import open_the_lock_752.Solution;

public class Main {
    public static void main(String[] args) {
        String[] deadends = new String[]{"0201","0101","0102","1212","2002"};
        String target = "0202";
        new Solution().openLock(deadends, target);
    }
}