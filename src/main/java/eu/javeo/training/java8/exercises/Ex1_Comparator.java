package eu.javeo.training.java8.exercises;

import eu.javeo.training.java8.data.model.User;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static eu.javeo.training.java8.data.Data.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Ex1_Comparator {

    private List<User> sortUsers(List<User> users) {
        // TODO: Posortuj użytkowników po dacie rejestracji
        return null;
    }

    @Test
    public void test() {
        List<User> users = Arrays.asList(userJaroslawPsikuta, userZygfrydWiadro, userLeopoldKozibak, userWaldemarKilof, userRomualdDzik, userAntoniSzpadel);
        sortUsers(users);
        assertThat(users, is(Arrays.asList(userWaldemarKilof, userAntoniSzpadel, userJaroslawPsikuta, userZygfrydWiadro, userRomualdDzik, userLeopoldKozibak)));
    }
}
