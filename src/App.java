import javax.swing.JFrame;

import Screens.VentanaLogin;

public class App {
    public static void main(String[] args) throws Exception {
     VentanaLogin vl = new VentanaLogin("Mi primera ventana");
     vl.setDefaultCloseOperation(vl.EXIT_ON_CLOSE);
     vl.setVisible(true);
    }
}
