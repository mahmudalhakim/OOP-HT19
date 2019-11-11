import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-11 14:21
 * Copyright: MIT
 */

public class LoginDemo {

    public static void main(String[] args) {

        String user = JOptionPane.showInputDialog("Användarnamn?");
        String pass = JOptionPane.showInputDialog("Lösenord?");

        if (user.equals(Login.USERNAME) && Login.PASSWORD.equals(pass)) {
            JOptionPane.showMessageDialog(
                    null, "Welcome");
            Login.about();

        } else
            JOptionPane.showMessageDialog(
                    null, "Invalid username or password!");


    }
}
