package Java_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckTheCharacter {
    public static void main(String[]args) {
        String regex ="^(?=.*[0-9])"+"(?=.*[A-Z])"+"(?=.*[!@#$%^&*()_+])"+"(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m =p.matcher("Indigo#622");
        System.out.println(m.matches());
    }
}
