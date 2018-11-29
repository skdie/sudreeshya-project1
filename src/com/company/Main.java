package com.company;
import javafx.scene.transform.Scale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        int qNo;
        int a,b,c;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the question number: ");
        qNo = sc.nextInt();
        switch (qNo) {
            case 1:
                System.out.println("This is a theory");
                break;
            case 2:
                System.out.println("Enter two numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Greater number is: "+ greatertwo(a,b) );
                break;
            case 3:
                System.out.println("Enter first number:");
                a = sc.nextInt();
                System.out.println("Enter second number:");
                b = sc.nextInt();
                System.out.println("Enter third number:");
                c = sc.nextInt();
                greaterthree(a,b,c);
                break;
            case 4:
                System.out.println("Enter the number");
                a = sc.nextInt();
                checknumber(a);
                break;
            case 5:
                System.out.println("Enter a number");
                a = sc.nextInt();
                checkDivisible(a);
                break;
            case 6:
                evenOdd();
                break;
            case 7:
                System.out.println("Enter year: ");
                int year = sc.nextInt();

                leapYear(year);

                break;
            case 8:
                System.out.println("Enter an alphabet");
                ch = sc.next().charAt(0);
                checkAlphabet(ch);
                break;
            case 9:
                System.out.println("Enter a character: ");
                ch = sc.next().charAt(0);
                if ((ch >= 65 && ch <= 90)|| (ch >= 97 && ch <= 122))
                    System.out.println ( "Alphabet ");
                else if (ch >= 48 && ch <= 57)
                    System.out.println("Digit ");
                else
                    System.out.println ( "Special Character ");
                break;
            case 10:
                System.out.println("Enter week number:");
                a = sc.nextInt();
                checkDay(a);
                break;
            case 11:
                System.out.println("Enter month number");
                a = sc.nextInt();
                switch (a){
                    case 1:
                        System.out.println("31 days");
                        break;
                    case 2:
                        System.out.println("28 days");
                        break;
                    case 3:
                        System.out.println("31 days");
                        break;
                    case 4:
                        System.out.println("30 days");
                        break;
                    case 5:
                        System.out.println("31 days");
                        break;
                    case 6:
                        System.out.println("30 days");
                        break;
                    case 7:
                        System.out.println("31 days");
                        break;
                    case 8:
                        System.out.println("31 days");
                        break;
                    case 9:
                        System.out.println("30 days");
                        break;
                    case 10:
                        System.out.println("31 days");
                        break;
                    case 11:
                        System.out.println("30 days");
                        break;
                    case 12:
                        System.out.println("31 days");
                        break;
                }
            case 12:
                System.out.println("Enter the total amount");
                a = sc.nextInt();
                int n1000 = a/1000;
                a = a - n1000*1000;
                int n500 =  a/500;
                a = a - n500*500;
                int n100 = a/100;
                a = a - n100*100;
                int n50 = a/50;
                a = a - n50*50;
                int n20 = a/20;
                a = a - n20*20;
                int n10 = a/10;
                a = a - n10*10;
                int n5 = a/5;
                a = a - n5*5;
                int n2 = a/2;
                a = a - n2*2;

                System.out.println("1000: "+n1000);
                System.out.println("500 : "+n500);
                System.out.println("100 : "+n100);
                System.out.println("50  : "+n50);
                System.out.println("20  : "+n20);
                System.out.println("10  : "+n10);
                System.out.println("5   : "+n5);
                System.out.println("2   : "+n2);
                System.out.println("1   : "+a);
                break;
            case 13:
                System.out.println("Enter angles of a triangle");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();

                if(a+b+c == 180){
                    if(a<180 && b<180 && c<180)
                        System.out.println("Given angles are angles of a trianglee");
                    else
                        System.out.println("Given angles are not angles of a triangle");
                }
                else
                    System.out.println("Given angles are no angles of a triangle");
                break;
            case 14:
                System.out.println("Enter three sides of triangle");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();

                if( (a+b)>c && (a+c)>b && (b+c)>a )
                    System.out.println("Given sides are sides of a triangle");
                else
                    System.out.println("Given sides are not sides of a triangle");
                break;
            case 15:
                System.out.println("Enter 3 sides of a triangle");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                checkTriangle(a,b,c);
                break;
            case 16:
                System.out.println("Given quadratic equation:ax^2 + bx + c");
                System.out.print("Enter a:");
                a = sc.nextInt();
                System.out.print("Enter b:");
                b = sc.nextInt();
                System.out.print("Enter c:");
                c = sc.nextInt();
                System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
                double d = b * b - 4 * a * c;
                double root1, root2;
                if(d > 0) {
                    System.out.println("Roots are real and unequal");
                    root1 = ( - b + Math.sqrt(d))/(2*a);
                    root2 = (-b - Math.sqrt(d))/(2*a);
                    System.out.println("First root is:"+root1);
                    System.out.println("Second root is:"+root2);
                }
                else if(d == 0) {
                    System.out.println("Roots are real and equal");
                    root1 = (-b+Math.sqrt(d))/(2*a);
                    System.out.println("Root:"+root1);
                }
                else {
                    System.out.println("Roots are imaginary");
                }
                break;
            case 17:
                System.out.println("Enter CP");
                a = sc.nextInt();
                System.out.println("Enter SP: ");
                b = sc.nextInt();
                System.out.println((a<b) ? "Profit":"Loss");
                break;
            case 18:
                int Physics, Chemistry, Biology, Math, Computer;
                System.out.println("Enter marks of physics, chemistry, biology, math and computer");
                Physics = sc.nextInt();
                Chemistry = sc.nextInt();
                Biology = sc.nextInt();
                Math = sc.nextInt();
                Computer = sc.nextInt();
                float percent = Float.valueOf(Physics+Chemistry+Biology+Math+Computer)/5;
                String grade = (percent>=90) ? "A": (percent >=80 ) ? "B": (percent >= 70) ? "C": (percent >= 60) ? "D":
                        (percent >= 40) ? "E":"F";
                System.out.println("Percentage is: "+percent+"\nGrade is "+grade);
                break;
            case 19:
                System.out.println("Question is not clear");
                break;
            case 20:
                System.out.println("Enter total units of electricity consuption");
                int unit = sc.nextInt();
                int q=0,w=0,e=0;
                if(unit>250){
                    q=unit-250;
                    unit = unit - q;
                }
                if(unit>150){
                    w=unit-150;
                    unit = unit - w;
                }
                if(unit>50){
                    e=unit-50;
                    unit = unit - e;
                }
                float total = (float) (q*1.50 + w*1.20 + e*0.75 + unit*0.5);
                total = total + 20/100*total;
                System.out.println("Total bill amount is: "+total);
                break;
            default:
                System.out.println("Please enter a valid question.");
        }
    }

    private static void checkTriangle(int a, int b, int c) {
        if( (a+b)>c && (a+c)>b && (b+c)>a ) {
            String result = (a == b && a == c && b == c) ? "Equilateral" : ((a == b) || (b == c) || (a == c)) ? "Isosceles" : "Scalen";
            System.out.println(result + " triangle");
        }
        else
            System.out.println("Given sides are not sides of a triangle");
    }

    private static void checkDay(int a) {
        switch (a){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Smile coz it is saturday");
                break;
        }
    }

    private static void checkAlphabet(char ch) {
        if( ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'  )
            System.out.println(ch+" is a vowel");
        else
            System.out.println(ch+" is a consonant");
    }

    private static void leapYear(int year) {

        if( (year %400  == 0) || ((year%4 ==0) && (year%100 != 0)) )
            System.out.println("It is a  leap year");
        else
            System.out.println("It is not a leap year");
    }

    private static void evenOdd() {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int eo = sc.nextInt();
        if(eo%2 == 0)
            System.out.println("It is a even number");
        else
            System.out.println("It is an odd number");
    }

    private static void checkDivisible(int a) {
        if( a%5 == 0 && a%11 == 0 )
            System.out.println("It is divisible by 5 and 11");
        else
            System.out.println("It is not divisible by 5 and 11");
    }

    private static void checknumber(int a) {

        if(a>=0){
            System.out.println("It is a positive number");
            if(a==0)
                System.out.println("It is zero");
        }
        else
            System.out.println("It is negative number");
    }

    private static void greaterthree(int a, int b, int c) {
        System.out.println("Greater number is :"+((a>b) ? ( (a>c)?a:c ):( (b>c)?b:c )));
    }

    private static int greatertwo(int a, int b) {
            return ( (a>b)?a:b);
    }
}
