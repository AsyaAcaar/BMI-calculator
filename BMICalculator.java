import java.util.Scanner;
import java.util.Locale; // we use this for if the user gives us the weight or height information with dot instead of comma
public class BMICalculator {    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in).useLocale(Locale.US); //"useLocale(Locale.US)"also for the same reason
        
        System.out.println("What is your weight?(as kg) ");
        double weight1=input.nextDouble();//we have to use double because user info could be as double form
        System.out.println("What is your height?(as meter) ");
        double height1=input.nextDouble();
        double bmı1= (weight1/(height1*height1));
        if (bmı1<18.5){
            System.out.println("You are underweight!Your BMI:" + bmı1);
                      }
            else if (18.5<=bmı1 && bmı1<24.9){
                System.out.println("You are healthy!Your BMI:" + bmı1);
                                             }
            else if (24.9<=bmı1){
                System.out.println("You are overweight!Your BMI:" + bmı1);

                                } 
            
    
    }
}