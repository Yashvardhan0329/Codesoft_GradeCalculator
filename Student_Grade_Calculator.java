package Codesoft;
import java.util.*;

public class Student_Grade_Calculator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is Grade calculator !");
        System.out.println("Please enter the number of subjects:-");
        int ns=sc.nextInt();
        int total=0;
        for ( int i=0;i<ns ;i++){
            System.out.println("Enter the marks scored in subjects:-"+i);
            int marks=sc.nextInt();
            total+=marks;

        }
        double avgPer=(double)total/ns;
        String  grade;
        if(avgPer>=90){
           grade="A+";
        }
        else if ( avgPer>=80){
            grade="A";
        }
        else if ( avgPer>=75){
            grade="B+";
        }
        else if (avgPer>=70){
            grade="B";
        }
        else if ( avgPer>=60){
            grade="C";
        }
        else if ( avgPer>=50){
            grade="D";
        }
        else if ( avgPer>=40){
            grade="E";
        }
        else{
        grade="you are Fail (F) :-(";
        }

        
        System.out.println("The Total number scored is :-"+ total);
        System.out.println("The Achived percent is "+avgPer);
        System.out.println("The Grade is "+grade);
    }

}

