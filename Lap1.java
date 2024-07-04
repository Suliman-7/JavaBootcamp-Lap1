import java.util.Scanner;

public class Lap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Q1
//           System.out.println("Quastion 1");
//
//
//           System.out.println("Please enter number 1 ");
//               int num1 = input.nextInt() ;
//
//
//               System.out.println("Please enter number 2 ");
//               int num2 = input.nextInt() ;
//
//               int sum = num1 + num2 ;
//               int sub = num1 - num2 ;
//               int mul = num1 * num2 ;
//               int div = num1 / num2 ;
//               int mod = num1 % num2 ;
//
//
//
//               System.out.println( num1 + " + " + num2 + " = " + sum);
//               System.out.println( num1 + " - " + num2 + " = " + sub);
//               System.out.println( num1 + " * " + num2 + " = " + mul);
//               System.out.println( num1 + " / " + num2 + " = " + div);
//               System.out.println( num1 + " mod " + num2 + " = " + mod);

// Q2
//                System.out.println("Please enter number  ");
//                int num1 = input.nextInt() ;
//                int count = 1 ;
//
//
//                while (count<=10) {
//                 System.out.println( num1 + " x " + count + " = " + (num1*count));
//                 count++ ;
//                }
//
    // Q3
//                System.out.println("Please enter Radius  ");
//
//                double radius = input.nextDouble();
//
//                double pi = 3.14159265359 ;
//
//                double parimeter  = 2 * pi * radius ;
//
//                double area = pi * (radius * radius) ;
//
//                System.out.println("Parimeter is = " + parimeter);
//                System.out.println("Area is = " + area);


    // Q4
//                System.out.println("Please enter count of numbers : ");
//                int count = input.nextInt();
//                int count1 = count ;
//                double sum = 0 ;
//
//                while (count>=1) {
//                    System.out.println("Enter an integer : ");
//                    sum += input.nextInt();
//
//                    count--;
//                }
//                double avg = sum / count1 ;
//                System.out.println("The Average is : " + avg);


    // Q5

//              System.out.println("Please enter number 1 ");
//              int num1 = input.nextInt() ;
//
//              System.out.println("Please enter number 2 ");
//              int num2 = input.nextInt() ;
//
//              System.out.println("Please enter number 3 ");
//              int num3 = input.nextInt() ;
//
//
//              if ( num1+num2 == num3 ) {
//                  System.out.println(true);
//              }
//              else {
//                  System.out.println(false);
//              }

    // Q6
//                System.out.println("Please enter a word : ");
//
//	             String word = input.nextLine();
//
//	             StringBuilder rev = new StringBuilder(word);
//
//	             rev.reverse();
//
//	             System.out.println("Reverse word : " + rev);


    // Q7

//                System.out.println("Please enter a number :");
//                int num = input.nextInt() ;
//
//
//                if (num%2==0) {
//                    System.out.println("The Number is Even");
//                }else {
//                    System.out.println("The Number is Odd");
//
//                }

    // Q8

//              System.out.println("Please Enter a temperature in Centigrade :");
//              int tempC = input.nextInt() ;
//
//              double tempF = (tempC * 1.8) + 32 ;
//
//	            System.out.println("Temperature in Fahrenheit : " + tempF);


    // Q9

//                 System.out.println("Please enter a sentence : ");
//
//	             String sentence = input.nextLine();
//
//                 System.out.println("Please enter a number :");
//                 int num = input.nextInt() ;
//
//                 System.out.println(sentence.charAt(num));


    // Q10

//          System.out.println("Please enter Width  ");
//
//          double w = input.nextDouble();
//
//          System.out.println("Please enter Height  ");
//
//          double h = input.nextDouble();
//
//
//          double parimeter  = 2 * (h + w) ;
//
//          double area = w * h ;
//
//          System.out.println("Area is " + w + " * " + h + " = " + area);
//          System.out.println("Parimeter is 2 * (" + w + " + " + h + ") = " + parimeter);


    // Q11

//              System.out.println("Please enter first number ");
//              int num1 = input.nextInt() ;
//
//
//              System.out.println("Please enter second number ");
//              int num2 = input.nextInt() ;
//
//
//              if (num1<num2) {
//                  System.out.println(num1 + " != " + num2);
//                  System.out.println(num1 + " < " + num2);
//                  System.out.println(num1 + " <= " + num2);
//              }
//              else if (num2<num1) {
//                  System.out.println(num2 + " != " + num1);
//                  System.out.println(num2 + " < " + num1);
//                  System.out.println(num2 + " <= " + num1);
//              }
//              else {
//                  System.out.println(num1 + " = " + num2);
//              }

    // Q12

//              System.out.println("Please enter second ");
//              int sec = input.nextInt() ;
//
//
//              int s2 = sec % 60 ;
//
//
//              int min = sec / 60 ;
//
//              int m2 = min % 60 ;
//
//              int hours = min / 60 ;
//
//              System.out.println(hours + ":" + m2 + ":" + s2);


    // Q13

//              System.out.println("Please enter number 1 ");
//              int num1 = input.nextInt() ;
//
//              System.out.println("Please enter number 2 ");
//              int num2 = input.nextInt() ;
//
//              System.out.println("Please enter number 3 ");
//              int num3 = input.nextInt() ;
//
//              System.out.println("Please enter number 4 ");
//              int num4 = input.nextInt() ;
//
//              if (num1 == num2 && num1 == num3 && num1 == num4 ) {
//                  System.out.println("Numbers are equal");
//              }
//              else {
//                  System.out.println("Numbers are not equal!");
//              }


    // Q14

//              System.out.println("Please enter number ");
//
//              int num1 = input.nextInt() ;
//
//
//              if (num1>0) {
//                System.out.println("Number is Positive ");
//              }
//              else if (num1<0) {
//                System.out.println("Number is Negative ");
//              }
//              else {
//                System.out.println("Number is Zero ");
//              }

    // Q15

//                int number ;
//                int p = 0 ;
//                int n = 0 ;
//                int z = 0 ;
//
//                do {
//                    System.out.println("Please enter your number or -1 to quit");
//
//                    number = input.nextInt();
//
//
//                    if(0<number){
//                        p++;
//                    }
//                    else if(0>number && number != -1 ){
//                        n++;
//                    }
//                    else if (0==number){
//                        z++;
//                    }
//                    else {
//                    	break;
//                    }
//                }while(number!=-1);
//
//
//                System.out.println(p + " positives");
//                System.out.println(z + " zero");
//                System.out.println(n + " negatives");
            
    // Q16

//                System.out.println("Please enter your number");
//                int num = input.nextInt();
//
//
//                int rev = 0;
//                while(num != 0)
//                {
//                int rem = num % 10;
//                rev = rev * 10 + rem;
//                num = num/10;
//                }
//                System.out.println(rev);

    // Q17

//              int num ;
//
//              String decision = "" ;
//
//              int smallest = 0 ;
//              int largest = 0 ;
//
//              System.out.println("Please enter your number");
//              num = input.nextInt();
//              smallest = num ;
//
//
//              while(!decision.equals("n")) {
//
//
//                  System.out.println("You want to complete ? (y/n)");
//                  decision = input.next();
//
//                  if(decision.equals("n")) {
//                	  break ;
//                  }
//
//                  if(num>largest) {
//                	  largest = num ;
//                  }
//
//                  if(num<=smallest) {
//                	  smallest = num ;
//                  }
//
//
//                  System.out.println("Please enter your number");
//                  num = input.nextInt();
//
//              }
//
//              System.out.println("the large number " + largest);
//              System.out.println("the small number " + smallest);

    // Q18

//            System.out.println("Please enter a sentence");
//            String sen = input.nextLine();
//
//            int count = 0 ;
//            int numOfA = 0 ;
//
//
//            while (count<sen.length()) {
//
//                    if(sen.charAt(count)=='a') {
//                            numOfA++;
//                    }
//
//                    count++;
//            }
//
//            System.out.println("Number of a's: "+numOfA);
}
}