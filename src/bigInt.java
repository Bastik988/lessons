import java.math.BigInteger;
import java.math.BigDecimal;
public class bigInt {
    public static void main(String[] args) {
        BigInteger pam = new BigInteger("23456789776543");
        BigInteger two = new BigInteger("324");
        System.out.println(pam.add(two));
        System.out.println(pam.subtract(two));
        System.out.println(pam.multiply(two));
        System.out.println(pam.divide(two));
        System.out.println(pam.compareTo(two));
        int miniInt = pam.intValue();
        double miniInt1 = pam.doubleValue();
        long miniInt2 = pam.longValue();
        System.out.println(miniInt);
        System.out.println(miniInt1);
        System.out.println(miniInt2);
        BigInteger map = BigInteger.valueOf(234);
        System.out.println(map);
        BigDecimal rar = new BigDecimal("3.5");
        BigDecimal rar1 = BigDecimal.valueOf(miniInt1);
        double pom = rar.doubleValue();
        System.out.println(pom);
        System.out.println(rar.add(rar1));
    }
}
