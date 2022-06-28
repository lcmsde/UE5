import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FolgeTest {


    @Test
    void remove() {

        FolgeMitRing<Integer> folge = new FolgeMitRing<>(3);
        folge.insert(3);
        folge.insert(6);
        folge.insert(8);
        assertEquals(folge.remove(0), 3);
    }
}
