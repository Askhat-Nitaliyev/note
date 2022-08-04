import java.util.Scanner;

public class auth {

    private static final String LOGIN = "Indal";
    private static final String PASSWORD = "Askhat";

    public static int authentificate() {
        Scanner s = new Scanner(System.in);

        int attempt = 3;
        boolean isLoginSuccess = false;

        while (attempt > 0 && !isLoginSuccess) {
            System.out.print("Login: ");
            var login = s.nextLine();

            System.out.println("Password: ");
            var password = s.nextLine();

            if (login.equals(LOGIN) & password.equals(PASSWORD)) {
                isLoginSuccess = true;
            }

            attempt --;

        }
        return isLoginSuccess ? 0 : -1;
    }

}