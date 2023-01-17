import javax.swing.JOptionPane;
public class Dialogo1 {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Cual es su noombre");
        String mensaje = String.format("Bienvenido a la programacion en java: " + nombre);
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
