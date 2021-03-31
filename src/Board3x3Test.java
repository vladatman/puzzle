import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Board3x3Test {

    @Test
    void ShuffleBoard(){
        List<Integer> digits = IntStream.range(1,9).boxed().collect(Collectors.toList());

        assertEquals(8, digits.size());
    }
}
