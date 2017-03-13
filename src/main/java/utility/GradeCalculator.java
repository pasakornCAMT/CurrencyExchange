package utility;

/**
 * Created by PASAKORN on 13/3/2560.
 */
public class GradeCalculator {
    public char calculate(double... scores){
        double sum = 0;
        for (int i = 0 ; i < scores.length ; i++) {
            sum = sum + scores[i];
        }
        return '\0';
    }
}
