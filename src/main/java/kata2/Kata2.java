
package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1,2,3,3,2,3,5,4,6,6,7,6,8,-4,5};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int key : data) {
           histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }   
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>"+ histogram.get(key));
        }
    }
}
