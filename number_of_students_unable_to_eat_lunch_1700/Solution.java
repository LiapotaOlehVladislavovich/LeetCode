package number_of_students_unable_to_eat_lunch_1700;

public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int numberOfOne = 0;
        int numberOfZero = 0;

        for (int s : students) {
            if (s == 1) {
                numberOfOne++;
            } else {
                numberOfZero++;
            }
        }

        for (int s : sandwiches) {
            if (s == 1) {
                if (numberOfOne == 0) {
                    return numberOfZero;
                }

                numberOfOne--;
            } else {
                if (numberOfZero == 0) {
                    return numberOfOne;
                }

                numberOfZero--;
            }
        }

        return numberOfOne + numberOfZero;
    }
}
