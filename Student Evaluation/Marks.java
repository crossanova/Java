package package2;

import package1.Student;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Marks extends Student{
    public int mm, hm, em, sm, ssm;    
    
    public void funci() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input();
        System.out.println("Enter your marks in the following subjects (out of 100) :");
        System.out.print("Maths : ");
        mm = Integer.parseInt(br.readLine());
        System.out.print("English : ");
        em = Integer.parseInt(br.readLine());
        System.out.print("Hindi : ");
        hm = Integer.parseInt(br.readLine());
        System.out.print("Science : ");
        sm = Integer.parseInt(br.readLine());
        System.out.print("Social Science : ");
        ssm = Integer.parseInt(br.readLine());
    }

    public void funco() {
        output();
    }
}