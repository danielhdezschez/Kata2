/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata2;

import java.util.HashMap;
import java.util.Map;


public class Histogram {
    private final int[] data;

    public Histogram(int[] data) {
        this.data = data;
    }
    
    public int[] getData() {
        return this.data;
    }
    
    public Map<Integer, Integer> getHistogram() {
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int key : this.data) {
           histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }  
        return histogram;
    }
    
}
