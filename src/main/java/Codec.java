import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world!
 *
 */
public class Codec
{
    public static void main( String[] args )
    {
        System.out.println(Codec.md5(args[0]));
        System.out.println(Codec.sha1(args[0]));
    }

    public static byte[] md5(String input) {
        return DigestUtils.md5(input);
    }

    public static byte[] sha1(String input) {
        return DigestUtils.sha1(input);
    }

}
