import java.awt.Graphics;
import javax.swing.JPanel;
public class PanelDibujo extends JPanel{
    //Dibuja una x en la esquina del panel
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int anchura = getWidth();//altura total
        int altura = getHeight();//anchura total

        //dibuja una linea de la esquina superior izquierda de la esquina  superior derecha
        g.drawLine(50,100,150,100);//linea de arriba

        g.drawLine(100,200,100,100);//linea recta
        g.drawLine(50,200,100,200);//linea de abajo
        g.drawLine(50,170,50,200);//2da linea recta
    }
}
