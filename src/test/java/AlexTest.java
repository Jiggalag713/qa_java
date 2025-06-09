import com.example.Alex;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlexTest {

    Alex alex = new Alex();

    public AlexTest() throws Exception {
    }

    @Test
    public void getFriends() {
        assertEquals(alex.getFriends(), List.of("Марти", "Глория", "Мелман"));
    }

    @Test
    public void getPlaceOfLiving() {
        assertEquals(alex.getPlaceOfLiving(), "Нью-Йоркский зоопарк");
    }

    @Test
    public void getKittens() {
        assertEquals(alex.getKittens(), 0);
    }
}
