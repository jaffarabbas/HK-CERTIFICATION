package com.company;

import java.util.Scanner;

public class static_block {
    static int B ;
    static int H;
    static int area;

    static boolean flag;
    static{
               Scanner obj = new Scanner(System.in);
               B=obj.nextInt();
               H=obj.nextInt();
               obj.close();
        try{

            if(B<=0 || H<=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch(Exception e){
            System.out.println(e);
            System.exit(0);
        }

    }



    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print("\n"+area);
        }

    }
}
