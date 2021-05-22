package com.withWahib;
import java.util.*;

public class Main {
    public static void  main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(" أدخل عدد الارقام التي تريد ادخالها : ");
        int n=in.nextInt();

        System.out.println(" أدخل طول الارقام العشوائية في الصف الواحد  : ");
        int y=in.nextInt();

        System.out.println(" تبداء الارقام العشوائية من  : ");
        int g=in.nextInt();

        Random random1=new Random(5);
        System.out.println(" الارقام العشوائية من :  ");
        for(int i=0; i<n; i++){
            for(int j=0; j<y; j++){
                System.out.print(random1.nextInt(g)+"     ");

            }
            System.out.println();

        }
    }
}
