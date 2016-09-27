package eu.javeo.training.java8.exercises;

import eu.javeo.training.java8.data.Data;
import eu.javeo.training.java8.data.model.Invoice;
import eu.javeo.training.java8.data.model.User;
import org.junit.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static eu.javeo.training.java8.data.Data.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Ex7_CountInvoicesByUser {

    private Map<User, Long> countInvoicesByUser(List<Invoice> invoices) {
        // TODO: Zwróć użytkowników wraz z liczbą faktur jakie zostały im wystawione
        return null;
    }

    @Test
    public void test() {
        Map<User, Long> result = countInvoicesByUser(Data.invoices);

        assertThat(result, is(new HashMap<User, Long>() {{
            put(userJaroslawPsikuta, 4L);
            put(userAntoniSzpadel,   2L);
            put(userRomualdDzik,     2L);
            put(userWaldemarKilof,   1L);
            put(userLeopoldKozibak,  1L);
            put(userZygfrydWiadro,   1L);
        }}));
    }
}
