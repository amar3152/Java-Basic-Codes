import java.util.*;

public class OTPGenrator{

    static char[] OTP(int len){
        System.out.println("Genrating OTP Using Random() Function");
        System.out.println("Your OTP is:- ");
        String numbers = "0123456789";
        Random rdm = new Random();
        char[] otp = new char[len];
        for(int i=0; i<len; i++){
            otp[i] = numbers.charAt(rdm.nextInt(numbers.length()));

        }
        return otp;       
    }


     public static void main(String[] args) {
        int length = 4;
        System.out.println(OTP(length));
    }
}