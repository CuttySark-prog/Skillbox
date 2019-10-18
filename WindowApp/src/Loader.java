import javax.swing.*;
import java.awt.*;

public class Loader

{
    public static void main(String[] args)

    {JFrame frame = new JFrame();

  //  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
 //   frame.setSize(dimension.width, dimension.height);
    frame.setSize(800,600);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setTitle("Our first window application");
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    }
}
