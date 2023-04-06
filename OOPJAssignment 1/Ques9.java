import java.lang.Byte;
class Ques9{
    public static void main(String[] args) {
       Byte b1=10;
       Byte b = new Byte(b1);
       Byte b2 = Byte.valueOf(b1);
       System.out.println(b2);
       short b3 = b.shortValue();
       System.out.println(b3);
       int b4 = b.intValue();
       System.out.println(b4);
       long b5 = b.longValue();
       System.out.println(b5);
       float b6 = b.floatValue();
       System.out.println(b6);
       double b7 = b.doubleValue();
       System.out.println(b7);


    }
}