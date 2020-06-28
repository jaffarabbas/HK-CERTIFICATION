package com.company;

public class static_block {
    static int B = 1;
    static int H =3;
    static int area;

    static boolean flag;
    static{

        try{

            if(B<0 || H<0){
                flag = false;
            }
            else{
                flag = true;
            }

            if(flag){
                area = B * H;
                System.out.print(area);
            }
        }
        catch(Exception e){

        }

    }



    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print("\n"+area);
        }

    }
}
