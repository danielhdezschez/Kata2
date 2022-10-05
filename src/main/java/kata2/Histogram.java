/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata2;

import java.util.HashMap;
import java.util.Map;


public class Histogram<T>{
    private final T[] data;

    public Histogram(T[] data) {
        this.data = data;
    }
    
    public T[] getData() {
        return this.data;
    }
    
    public Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<T, Integer>();
        for (T key : this.data) {
           histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }  
        return histogram;
    }
    
}
