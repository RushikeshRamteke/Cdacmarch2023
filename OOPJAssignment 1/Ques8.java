import java.lang.Byte;
class Ques8{
    public static void main(String[] args) {
       Byte b1=5;
       String str = Byte.toString(b1);
       System.out.println(str);
       Byte b2 = Byte.valueOf(b1);
       System.out.println(b2);
       String str1 = "3";
       Byte b3 = Byte.valueOf(str1);
       System.out.println(b3);


    }
}