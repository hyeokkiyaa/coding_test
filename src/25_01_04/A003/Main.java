import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger number = BigInteger.ZERO;
        for (int digit : digits) {
            number = number.multiply(BigInteger.TEN); 
            number = number.add(BigInteger.valueOf(digit)); 
        }
        number = number.add(BigInteger.ONE);

        String numberStr = number.toString();
        int[] result = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            result[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        return result;
    }

}