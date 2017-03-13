package utility;

/**
 * Created by PASAKORN on 13/3/2560.
 */
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
public class CurrencyTest {
    @Test
    public void testExchange(){
        Currency currency = new Currency();
        assertThat(currency.exchange("USD",1.0,"USD"),closeTo(1.0,0.001));
        assertThat(currency.exchange("USD",100.0,"EUR"),closeTo(101.0,0.001));
        assertThat(currency.exchange("EUR",53.0,"USD"),closeTo(52.475,0.001));
        assertThat(currency.exchange("THB",99.0,"EUR"),closeTo(3.03,0.001));
        assertThat(currency.exchange("EUR",50.0,"USD"),closeTo(49.504950,0.001));
        assertThat(currency.exchange("USD",75.0,"THB"),closeTo(2475.0,0.001));
        assertThat(currency.exchange("USD",150.0,"EUR"),closeTo(151.5,0.001));
    }
}
