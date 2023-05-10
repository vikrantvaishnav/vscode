package Project;

import javax.swing.*;
import java.awt.*;

public class Flash extends JFrame{

    Flash()
    {
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("Project/ebilling.png"));
        JLabel image =new JLabel(i);
        add(image);
        setVisible(true);

        setSize(750,500);
        setLocation(700,200);
        
    }
    public static void main(String[] args) {
        new Flash();
    }
    
}
