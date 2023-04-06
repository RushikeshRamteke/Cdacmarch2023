import java.lang.Float;
class Ques24{
    public static void main(String[] args) {
        float j = 35.02f;
        String str= "35.20f";
        String s = float.toString(j);
        System.out.println(s);
        float d = float.valueOf(j);
        System.out.println(d);
        float e = float.valueOf(str);
        System.out.println(e);
        String h = float.toHexString(j);
        System.out.println("Hexadecimal value is "+h );

    }
}