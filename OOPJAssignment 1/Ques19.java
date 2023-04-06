import java.lang.Long;
class Ques19{
    public static void main(String[] args) {
        int ch = Long.BYTES;
        System.out.println("Number of bytes is "+ch);
        int c = Long.SIZE;
        System.out.println("Number of bits is "+c);
        long max = Long.MAX_VALUE;
        System.out.println("Maximum value is "+max);
        long min = Long.MIN_VALUE;
        System.out.println("Minimum value is "+min);
    }
}