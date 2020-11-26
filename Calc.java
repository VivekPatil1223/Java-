import java.util.Scanner;

public class Calc {
    
    public static void main(String[] args){
        
        double num1,num2;
        Scanner reader =new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = reader.nextDouble();
        System.out.print("Enter second number:");
        num2 = reader.nextDouble();
        
        System.out.print(" Enter an operator(=,-,*,/):");
        char operator = reader.next().charAt(0);
        
        double result;
        switch(operator ){
            case'+':
                result = num1+num2;
                break;
            
            case'-':
                result =num1-num2;
                break;
                
            case'*':
                result =num1*num2;
                break;
                
            case'/':
                result =num1/num2;
                break;
                
            default:
            System.out.printf("Error! operator is not correct");
            return;
                
        }
        System.out.printf(num1 + " " + operator + " " + num2 +" = " + result); 
    }

}