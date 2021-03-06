package test.internship;

import java.util.HashMap;
import java.util.Map;

public class TestCountArray {

    public static Map<Integer, Integer> countElementOcurrences(int[] array) {

        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for (int element : array) {
            Integer count = countMap.get(element);
            count = (count == null) ? 1 : count + 1;
            countMap.put(element, count);
        }

        return countMap;
    }

    public static Integer mostOcurrencesElement(int[] array) {
        Map<Integer, Integer> countMap = countElementOcurrences(array);

        int maxCount = 0;
        Integer element = null;
        for (Integer e : countMap.keySet()) {
            if (countMap.get(e) > maxCount) {
                element = e;
                maxCount = countMap.get(e);
            }
        }

        return element;

    }

    public static void main(String[] args) {

        int[] a = new int[] {1,2,3,4,5,6,7,7,7,7}; 

        System.out.println (mostOcurrencesElement(a));

    }

}
