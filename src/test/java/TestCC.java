
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TestCC {
    @ParameterizedTest
    @CsvSource({"1000.0,10.0,10,104.64", "1000.0,0.0,10,100,0", "0.0,10.0,10,0.0"})
    void test_PaymentAmount(String amount, String percent, String months, String expected) {
        Assertions.assertEquals(Math.round((CreditCalculator.paymentAmount(Float.parseFloat(amount),
                Float.parseFloat(percent), Integer.parseInt(months)) - Float.parseFloat(expected)) * 100), 0.0);
    }

    @ParameterizedTest
    @CsvSource({"1000.0,10.0,10,1046.40", "1000.0,0.0,10,100,1000.0", "0.0,10.0,10,0.0"})
    void test_TotalPayment(String amount, String percent, String months, String expected) {
        Assertions.assertEquals(Math.round((CreditCalculator.totalPayment(Float.parseFloat(amount),
                Float.parseFloat(percent), Integer.parseInt(months)) - Float.parseFloat(expected)) * 100), 0.0);
    }

    @ParameterizedTest
    @CsvSource({"1000.0,10.0,10,46.40", "1000.0,0.0,10,100,0.0", "0.0,10.0,10,0.0"})
    void test_Overpayment(String amount, String percent, String months, String expected) {
        Assertions.assertEquals(Math.round((CreditCalculator.overpayment(Float.parseFloat(amount),
                Float.parseFloat(percent), Integer.parseInt(months)) - Float.parseFloat(expected)) * 100), 0.0);
    }


}


