package minimum_index_sum_of_two_lists_599;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }

        HashMap<String, Integer> map = new HashMap<>();
        int len = list1.length;
        for (int i = 0; i<len; i++) {
            map.put(list1[i], i);
        }

        ArrayList<String> result = new ArrayList<>();

        int min = 2000;
        len = list2.length;

        for (int i = 0; i<len; i++) {
            if (i>min) break;
            Integer tmp = map.get(list2[i]);
            if (tmp!=null) {
                tmp+=i;
                if (tmp<=min) {
                    if (tmp<min) {
                        min = tmp;
                        result = new ArrayList<>();
                    }
                    result.add(list2[i]);
                }
            }
        }

        int j = result.size();
        String[] res = new String[j];
        for (int i = 0; i < j; i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
