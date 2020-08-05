package tasks.task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class quadraticEquation {
    public List<Double> decide(double a, double b, double c) {
        List<Double> answer = new ArrayList<>();
        double d = (b*b) - 4*a*c;
        double x1,x2;

        if(d > 0){
            x1 = ( (-b) + Math.sqrt(d) )/ (2*a);
            x2 = ( (-b) - Math.sqrt(d) )/ (2*a);
            answer.add(x1);
            answer.add(x2);
            Collections.sort(answer);
            return answer;
        }
        if(d == 0 && (a!=0 || b!=0 || c!=0) ) {
            x1 = ( (-b) + Math.sqrt(d) )/ (2*a);
            answer.add(x1);
            return answer;
        }
        else
            return answer;
    }

}
