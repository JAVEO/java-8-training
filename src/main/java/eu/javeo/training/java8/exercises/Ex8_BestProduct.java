package eu.javeo.training.java8.exercises;

import eu.javeo.training.java8.data.Data;
import eu.javeo.training.java8.data.model.Invoice;
import eu.javeo.training.java8.data.model.Product;
import org.junit.Test;
import java.util.List;
import java.util.Optional;
import static eu.javeo.training.java8.data.Data.prodPrinter;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Ex8_BestProduct {

    private Optional<Product> bestProduct(List<Invoice> invoices) {
        // TODO: Zwróć najczęściej kupowany produkt
        return null;
    }

    @Test
    public void test() {
        Optional<Product> bestProduct = bestProduct(Data.invoices);
        assertThat(bestProduct, is(Optional.of(prodPrinter)));
    }

}
