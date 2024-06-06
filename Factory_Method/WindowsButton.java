package Factory_Method;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowsButton implements Button {
    @Override
    public void render() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        JButton button = new JButton("Windows Button");
        frame.getContentPane().add(panel);
        panel.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button Clicked!");
    }
}
