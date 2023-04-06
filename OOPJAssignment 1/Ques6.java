class Ques6{
public static void main (String[] args){
boolean b1=true;
String str= Boolean.toString(b1);
Boolean b2= Boolean.valueof(b1);
String str2= "hello";
Boolean b3= Boolean.valueof(str2); 
String str3= "yes";
Boolean b4= Boolean.parseBoolean(str3);
System.out.println(str);
System.out.println(b2);
System.out.println(b3);
System.out.println(b4);
}
}

 