import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionTest {
    @Test
    public void maximumEvenSplitTest1() {
        long finalSum = 12;
        List<Long> expected = new ArrayList<>(List.of(2L, 4L, 6L));
        List<Long> actual = new Solution().maximumEvenSplit(finalSum);
        Collections.sort(expected);
        Collections.sort(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximumEvenSplitTest2() {
        long finalSum = 7;
        List<Long> expected = new ArrayList<>();
        List<Long> actual = new Solution().maximumEvenSplit(finalSum);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximumEvenSplitTest3() {
        long finalSum = 28;
        List<Long> expected = new ArrayList<>(List.of(6L, 8L, 2L, 12L));
        List<Long> actual = new Solution().maximumEvenSplit(finalSum);
        Collections.sort(expected);
        Collections.sort(actual);

        Assert.assertEquals(expected, actual);
    }
}
