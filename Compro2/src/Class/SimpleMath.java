
package Class;

public class SimpleMath {
    public double findMaxInArray(double[] Array){
        double max = -Double.MAX_VALUE;  // Value 
        for(int i=0; i<Array.length; i++){
            if (Array[i] > max){
                max = Array[i];
            }
        }
        return max;
    }
    
}
