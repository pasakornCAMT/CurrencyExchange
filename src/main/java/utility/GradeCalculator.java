package utility;

/**
 * Created by PASAKORN on 13/3/2560.
 */
public class GradeCalculator {
    public char calculate(double... scores) {
        //Step1
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        //Step2 check
        if (sum <= 100 && sum >= 0) {
            //Step3 do some code
            if (sum > 95) return 'A';
            if (sum > 80) return 'B';
            if (sum > 60) return 'C';
            return 'F';
        } else {
            return 'x';
        }

    }
}
