import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-23 10:15
 * Copyright: MIT
 *
 * Ett program som visar olika
 * typer av dialogrutor i Java
 */
public class Dialogrutor {

    /**
     * Metoden main är huvudingången till programmet <br>
     * Här finns några exempel på kommentarer
     * och <b>dialogrutor</b>
     * @param args data som skickas till main
     */
    public static void main(String[] args) {

        /*
            Deklaration av två stängar
            name och message
        */
        String name;
        String message;
        // TODO: 2019-10-23 hämta vikt  

        // Visa en input-ruta
        name = JOptionPane.showInputDialog("Vad heter du?");
        // TODO: 2019-10-23 Lagra vikt i en variabel som heter weight 
        message = "Välkommen " + name + "!";

        // Visa en dialogruta
        JOptionPane.showMessageDialog(null, message);

        // TODO: 2019-10-23 Visa flera dialogrutor 

    }
}
