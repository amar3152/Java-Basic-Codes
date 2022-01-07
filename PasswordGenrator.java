import java.util.*;
public class PasswordGenrator {

     public static void main(String[] args) {
        int length = 6;
        System.out.println(geek_Password(length));    
    }
    static char[] geek_Password(int len){
        System.out.println("Genrate Password using Random()");
        System.out.println("Your Password is:- ");
        String Capital_Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_Letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String Symbols = "@";
        String values = Capital_Letters + Small_Letters + numbers + Symbols;
        Random rdm = new Random();
        char[] password = new char[len];
        for(int i=0; i<len; i++){
            password[i] = values.charAt(rdm.nextInt(values.length()));
        }
        return password;
    }
    
}
