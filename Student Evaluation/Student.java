package package1;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Student {
    public String n;
    public String eno;
    
    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Name : ");
        n = br.readLine();
        System.out.print("Enter Enrollment No. : ");
        eno = br.readLine();
    }
    public void output() {
        System.out.println("Name : " + n);
        System.out.println("Enrollment No. : " + eno);
    }
}
