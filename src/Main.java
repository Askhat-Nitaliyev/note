import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //    note note1 = new note("name1", "text2");
    //    note1.setText("text9");
        int code = auth.authentificate();
        if (code == 0) {
            System.out.println ("Login success");
        } else {
            System.out.println("Login failed");
        }
    }
}
