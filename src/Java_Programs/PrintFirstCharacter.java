package Java_Programs;


// Print First Character of the given String;

public class PrintFirstCharacter {
    public static void main(String[] args) {
        String a="i love my country and i love being here";
        System.out.println("Given String ="+a);
        String []b=a.split(" ") ;
        for (String c :b){
            if (!c.isEmpty()){
                System.out.println("First Character of the given String is "+c.charAt(0));
            }
        }
    }
}
