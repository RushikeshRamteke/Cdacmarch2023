import java.lang.Double;
import java.lang.Long;
class Ques20{
    public static void main(String[] args) {
        double j = 3500.000000d;
        String str= "35";
        String s = Double.toString(j);
        System.out.println(s);
        double d = Double.valueOf(j);
        System.out.println(d);
        double e = Double.valueOf(str);
        System.out.println(e);
        String f = Double.toBinaryString(j);
        System.out.println("Binary value is "+f);
        String g = Double.toOctalString(j);
        System.out.println("Octal value is "+g);
        String h = Double.toHexString(j);
        System.out.println("Hexadecimal value is "+h );
        long i = Long.DoubletoLongBits(j);
        System.out.println(i);

    }
}