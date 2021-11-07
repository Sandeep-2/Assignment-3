import java.io.*;
import java.lang.String;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentences: ");
        String m = sc.nextLine();
        Scanner hc = new Scanner(System.in);
        System.out.println("Enter a Letter: ");
        char[] c = hc.nextLine();
        char[] a = new char[m.length()];
        var i=0;
        for (i = 0; i < m.length(); i++) {
            a[i] = m.charAt(i);
        }
        boolean l = a.contains(c);
        if (l == false) {
            System.out.println("The entered letter not found");
        }
        for (i = 0; i < m.length(); i++) {
            if (c == a.charAt(i)) {
                CharArrayReader[] slice = Array.copyOfRange(a, i, m.length() + 1);
                System.out.println(Arrays.toString(slice));
                break;
            }
        }
        
    }
}