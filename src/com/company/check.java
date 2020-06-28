package com.company;

import javax.naming.Name;
import java.util.Scanner;

class Newclass{
    String Names[] = new String[3];

    int id;

    Newclass(String name, int id){
        for(int i = 0; i<Names.length;i++){
            this.Names[i] = name;
        }
        this.id = id;

        for(int i = 0; i<Names.length;i++){
            System.out.println("Names : "+this.Names[i]+"\n"+"Id : "+id);
            break;
        }
    }


}
public class check {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("Name : "+(i+1)+" : ");
            String cn[] = new String[3];
            cn[i] = obj.next();
            System.out.println("Id : "+(i+1)+" :");
            int id = obj.nextInt();
            Newclass objb = new Newclass(cn[i],id);
        }
    }
}
