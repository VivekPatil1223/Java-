import java.util.Scanner;
public class String1{
    public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter String 1");
    String s1=obj.nextLine();
    System.out.println("Enter String 2");
    String s2=obj.nextLine();
    System.out.println("Enter String 3");
    String s3=obj.nextLine();
    System.out.println("Enter String 4");
    String s4=obj.nextLine();
    System.out.println("The four stored strings are:");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    
    System.out.println("Finding out string length");
    System.out.println("string length is :"+s1.length());
    System.out.println("string length is :"+s2.length());
    System.out.println("string length is :"+s3.length());
    System.out.println("string length is :"+s4.length());
    
    System.out.println("Cheking if two strings are equal");
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.equalsIgnoreCase(s3));
    System.out.println(s1.equalsIgnoreCase(s4));
    
    System.out.println("Doing string comparision");
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.compareTo(s4));
    
    System.out.println("Concating the string");
    s4=s4.concat(" How are you");
    System.out.println(s4);
    
    System.out.println("Converting string to upper case ");
    String s4upper=s4.toUpperCase();
    System.out.println(s4upper);
    }
    
}