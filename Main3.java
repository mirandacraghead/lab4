import java.util.Scanner;
import java.lang.*;
//used below resourse for char-long conversion
//https://stackoverflow.com/questions/29997665/converting-from-a-char-to-a-long
//used stack overflow and tutorialspoint for longparse
//www.tutorialspoint.com/java/lang/long_parselong_radix.htm
//https://stackoverflow.com/questions/7693324/how-to-convert-string-to-long-in-java

public class Main3 {
    public static void main(String[] args){
        Scanner scnr =  new Scanner(System.in);
        long sum=0;
        long cNum;
        System.out.println("Enter a hexadecimal number:");
        String hexi = scnr.next();
        String hexiEva;

        //checking for 0x
        //referred to stackoverflow to get a substring
        if(hexi.substring(0,1)== "0x"){
            hexiEva = hexi.substring(2,hexi.length()-1);


        }
        else {
            hexiEva = hexi;

        }

        for (int i=0; i<hexiEva.length(); i++) {
            char a  = hexiEva.charAt(i);
            if(Character.isDigit(a)){

                //long num = Long.parseLong(,1);
                long num = Character.getNumericValue(a);
                //System.out.print("number");
                //System.out.println(num);
                sum += num*Math.pow(16,(hexiEva.length()-1)-i);
                //System.out.print("sum");
                //System.out.println(sum);
                //System.out.print("hexilenght");
                //System.out.println((hexi.length()-1)-i);
            }
            else if(Character.isLetter(a)){
                //System.out.print("is character");
                //A
                if(a == 'A' || a =='a') {
                    cNum =10;
                    sum += cNum*Math.pow(16,(hexiEva.length()-1)-i);
                }
                //B
                else if(a == 'B' || a =='b'){
                    cNum=11;
                    sum += cNum*Math.pow(16,(hexiEva.length()-1)-i);
                }
                //C
                else if(a =='C' || a =='c'){
                    cNum = 12;
                    sum += cNum*Math.pow(16,(hexiEva.length()-1)-i);
                }
                //D
                else if(a == 'D' || a =='d'){
                    cNum =13;
                    sum += cNum*Math.pow(16,(hexiEva.length()-1)-i);
                }
                //E
                else if(a =='E' || a=='e'){
                    cNum = 14;
                    sum += cNum*Math.pow(16,(hexiEva.length()-1)-i);
                }
                //F
                else if(a == 'F' || a =='f'){
                    cNum=15;
                    sum += cNum*Math.pow(16,(hexiEva.length()-1)-i);
                }
            }



        }
        System.out.println("Your number is " + sum + " in decimal");




    }
}
