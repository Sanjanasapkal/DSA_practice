import java.math.BigInteger;

class Solution {
    public String multiplyStrings(String s1, String s2) {
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);

        return a.multiply(b).toString();
    }
}