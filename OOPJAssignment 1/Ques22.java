import java.lang.Long;
class Ques22{
    public static void main (String[] args){
    long a = 500000L;
    long b = 600000L;
    long c = Long.max(a,b);
    System.out.println("Maximum number is "+c);
    long d =Long.min(a,b);
    System.out.println("Minimum number is "+d);
    long s =Long.sum(a,b);
    System.out.println("Sum of the number is "+s);
}
}
