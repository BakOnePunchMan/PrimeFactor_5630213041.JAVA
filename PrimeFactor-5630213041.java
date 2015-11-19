package primefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class PrimeFactors{
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num;
do{
    System.out.println("Enter a Number : ");
    num=Integer.parseInt(br.readLine());
    System.out.print("The Prime Factors of "+num+" are : ");

 int i=2;
    while(num>1){
    if(num%i == 0)
    {
     System.out.print(i+" ");
     num=num/i;
     }
    else
    i++;
  }
    System.out.println("");
}while(num!=0);
System.out.println("num = 0 (Exit loop)");
}
}