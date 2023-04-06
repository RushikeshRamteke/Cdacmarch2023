import java.lang.Long;
class Ques20{
    public static void main(String[] args) {
        long j = 3500L;
        String str= "35";
        String s = Long.toString(j);
        System.out.println(s);
        long d = Long.valueOf(j);
        System.out.println(d);
        long e = Long.valueOf(str);
        System.out.println(e);
        String f = Long.toBinaryString(j);
        System.out.println("Binary value is "+f);
        String g = Long.toOctalString(j);
        System.out.println("Octal value is "+g);
        String h = Long.toHexString(j);
        System.out.println("Hexadecimal value is "+h );

    }
}