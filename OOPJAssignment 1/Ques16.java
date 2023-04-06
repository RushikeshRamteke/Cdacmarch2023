import java.lang.Integer;
class Ques16{
    public static void main(String[] args) {
        int j = 25;
        String str= "35";
        String s = Integer.toString(j);
        System.out.println(s);
        int d = Integer.valueOf(j);
        System.out.println(d);
        int e = Integer.valueOf(str);
        System.out.println(e);
        String f = Integer.toBinaryString(j);
        System.out.println("Binary value is "+f);
        String g = Integer.toOctalString(j);
        System.out.println("Octal value is"+g);
        String h = Integer.toHexString(j);
        System.out.println("Hexadecimal value is "+h );

    }
}