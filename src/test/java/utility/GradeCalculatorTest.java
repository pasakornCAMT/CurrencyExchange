package utility;

/**
 * Created by PASAKORN on 13/3/2560.
 */
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class GradeCalculatorTest {
    @Test
    public void testCalculate(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        assertThat(gradeCalculator.calculate(25,28,32),is('B'));
        assertThat(gradeCalculator.calculate(0,7,32,5),is('F'));
        assertThat(gradeCalculator.calculate(20,21,32,20),is('A'));
        assertThat(gradeCalculator.calculate(100,28),is('x'));
        assertThat(gradeCalculator.calculate(25,28,32),is('B'));
        assertThat(gradeCalculator.calculate(90),is('B'));
        assertThat(gradeCalculator.calculate(65,1),is('C'));
        assertThat(gradeCalculator.calculate(1,1,1,1,1,1,1,1,11,1,1,1,1,1),is('C'));
        assertThat(gradeCalculator.calculate(25,28,32),is('B'));
        assertThat(gradeCalculator.calculate(40, 26),is('F'));
        assertThat(gradeCalculator.calculate(20,12,6),is('F'));
        assertThat(gradeCalculator.calculate(80,35,5),is('x'));
        assertThat(gradeCalculator.calculate(80),is('B'));
        assertThat(gradeCalculator.calculate(-5),is('U'));
    }
}
