import org.junit.Test;

import static org.junit.Assert.*;

public class functionTestFalse {

    @Test
    public void breakingRecords() {
        function func = new function();
        int[] actual = function.breakingRecords(new int[]{10,5,20,20,4,5,2,25,1});
        int[] expected = new int[] {2,5};
        assertArrayEquals(expected,actual);
    }
}