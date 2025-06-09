import com.example.Feline;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {
    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        assertEquals(feline.getKittens(), 1);
    }
}
