import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Board4x4Test {

    @Test
    void ShuffleBoard(){
        List<Integer> digits = IntStream.range(1,16).boxed().collect(Collectors.toList());

        assertEquals(15, digits.size());
    }
}
