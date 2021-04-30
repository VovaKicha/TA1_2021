
package knu.fit.ist.ta.lab3;

import java.text.DecimalFormat;

public class TaskView {

    private int[] startArray;
    
    DecimalFormat df = new DecimalFormat("###.##");

    public String showResult(String kString) {
        if (kString.equals("")) {
            return "Please enter k!";
        }
        Integer k = Integer.parseInt(kString);

        if (k < 0) {
            return "Wrong k! It must be positive! Please try again.";
        } else {
            startArray = Task.massRand(k);
            return df.format(Task.output(startArray));
        }
    }
    public String EndArray() {
    
        /*return Task.output(Task.Arraycheck(startArray));*/
        int[] result = {1,2};
        return Task.output(result);
    }
}
