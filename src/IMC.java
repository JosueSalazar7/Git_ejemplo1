import javax.swing.*;
import java.text.DecimalFormat;

public class IMC {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        try {
            double estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura "));//Muestra mensaje
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso"));
            double forumla= peso/Math.pow(estatura,2);
            String mensaje = String.format("Su IMC es: " + df.format(forumla));//Se escribe el mensaje
            JOptionPane.showMessageDialog(null,mensaje);//Muestra el mensaje
        }catch (Exception e){
            String error = String.format("Los datos que ingreso son incorrectos");
            JOptionPane.showMessageDialog(null,error);
        }finally {
            String mensajefinal = String.format("El programa finalizo");
            JOptionPane.showMessageDialog(null,mensajefinal);
        }
    }
}
