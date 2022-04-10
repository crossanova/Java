import java.util.*;
import java.lang.*;
import java.io.*;

class newException extends Exception {
    public newException() {
        super("Exception caught!");
    }
}

class ExceptionHandling {
    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        try {
            if (a == 0) {
                throw new newException();
            }
        } catch (newException e) {
            System.out.println(e.getMessage());
        }
    }
}
