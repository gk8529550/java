// import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;
public class MyFrame extends Frame {
    public MyFrame() {
        this.setVisible(true);
        this.setSize(300, 200);
    }}

    // public void paint(Graphics g) {
    //     System.out.println("painting...");
    // }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    //     Graphics g = f.getGraphics();
    //     System.out.println("drawing...");
    //     g.drawRect(100, 100, 10, 10);
    //     System.out.println("drawn...");
    // }
}
