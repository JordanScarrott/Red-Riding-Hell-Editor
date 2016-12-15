import javax.swing.*;

public class Main {
    static JFrame frame = new JFrame();
    private static final int SCREEN_WIDTH = 800;
    private static final int SCREEN_HEIGHT = 400;
    private static final int PALLETTE_WIDTH = 300;
    private static final int PALLETTE_HEIGHT = 200;


    public static void main(String[] args) throws InterruptedException{
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLocationRelativeTo(null);
         frame.setSize(SCREEN_WIDTH + 16,SCREEN_HEIGHT + PALLETTE_HEIGHT + 32);
         runnit();
     }
    public static void runnit() throws InterruptedException {
        Editor editor = new Editor(SCREEN_WIDTH, SCREEN_HEIGHT,48);
        frame.add(editor);
        frame.revalidate();
        frame.repaint();
        while(true){
            editor.repaint();
            editor.move(frame);
            Thread.sleep(20);
        }
    }
}
