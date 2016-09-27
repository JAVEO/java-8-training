package eu.javeo.training.java8.exercises;

import eu.javeo.training.java8.data.Data;
import eu.javeo.training.java8.data.model.Invoice;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Ex6_HighestValueInvoice {

    private double findHighestInvoiceSum(List<Invoice> invoices) {
        // TODO: Zwróć najwyższą wartość faktury
        return 0;
    }

    @Test
    public void test() {
        double highestInvoiceSum = findHighestInvoiceSum(Data.invoices);
        assertThat(highestInvoiceSum, is(10870.0));
    }

}
