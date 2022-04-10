import package2.*;
import java.util.*;
import java.io.*;
import java.lang.*;

class Result extends Marks {
    public int total;
    public void dc() throws IOException {
        total = mm + sm + hm + ssm + em;
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Percentage : " + (float) (total / 5));
        if (total / 5 >= 33) {
            System.out.println("Result : Pass");
        }
        else {
            System.out.println("Result : Fail");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of records : ");
        int n = Integer.parseInt(br.readLine());
        Result[] r = new Result[n];
        for(int i = 0; i < n; i++) {
            r[i] = new Result();
            System.out.println("");
            r[i].funci();
        }
        System.out.println("");
        for(int i = 0; i < n; i++) {
            System.out.println("");
            r[i].funco();
            r[i].dc();
        }        
    }
}
