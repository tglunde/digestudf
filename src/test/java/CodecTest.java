import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class CodecTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( Arrays.equals(Codec.md5("dies ist ein teststring"),Codec.md5("dies ist ein teststring")));
        assertTrue( Arrays.equals(Codec.sha1("dies ist ein teststring"), Codec.sha1("dies ist ein teststring")));
    }
}
