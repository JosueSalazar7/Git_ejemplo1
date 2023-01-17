import javax.swing.*;

public class PruebaDePanelDibujo {
    public static void main(String[] args) {
        PanelDibujo panel = new PanelDibujo();

        JFrame aplication = new JFrame();

        aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplication.add( panel );
        aplication.setSize(250,250);
        aplication.setVisible( true );

    }
}
