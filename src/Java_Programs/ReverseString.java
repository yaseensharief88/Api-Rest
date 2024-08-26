package Java_Programs;

public class ReverseString {
    public static void main(String[] args) {
String a="Sharief";
String b="";
char c;
System.out.println("Original Word - "+a);
 for (int i=0;i<a.length();i++){
     c=a.charAt(i);
     b=c+b;


}System.out.println("Reversed Word - "+b);
    }
}
