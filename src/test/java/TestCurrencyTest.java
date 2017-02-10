import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

import static org.testng.Assert.assertEquals;

public class TestCurrencyTest {

    @DataProvider(name = "numbers")
    public Object[][] numbers() {
        return new Object[][]{
                {3980.0}
        };
    }

    @Test(dataProvider = "numbers")
    public void currency(double expectedNumber) {
        // given
        TestCurrency app = new TestCurrency();
        //System.setIn(new ByteArrayInputStream(expectedNumber.getBytes()));

        // when
        double number = app.changeCurrency();

        // then
        assertEquals(number, expectedNumber);
    }
}
