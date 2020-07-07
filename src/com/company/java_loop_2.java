package com.company;
import java.util.*;
import java.io.*;
public class java_loop_2 {

    public static void main(String[] args) {
	 
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();//t ko value de rhay hai
        for(int i=0;i<t;i++){//ye loop har bar cly ga or t ki length tak e,g t = 4  to ye 4 bar cly ga
            int a = in.nextInt();//a ki value
            int b = in.nextInt();//b ki value
            int n = in.nextInt();// c ki value

            for(int j = 0 ; j<n ; j++){//child loop hai jo n ki length tak cahly ga or jab ye complete ho ga to t ki remaing bari chali gi
               a += b;//ye a me a +b ki value add krdy ga to e.g agar a = 0 or b ki 10 to
//0 = 0+10;     a = 10
               if(j > 0){
                   System.out.print(" ");// ye indent kai lie hai donumber kai bech me
               }

               System.out.print(a);// ye a ki value de ga jo upper ham ne dal de hai a+=b me

               b =b*2;//ye b ki value me b*2 kivaue add kry ga
            }
            System.out.print("\n");// ye space bnay ga

        }
        in.close();
    }
}
