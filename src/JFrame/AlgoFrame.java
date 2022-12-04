package JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AlgoFrame extends JFrame {
    private int canvasWidth;
    private int canvasHeight;
    public AlgoFrame(String title, int canvasWidth, int canvasHeight) {
        super(title);

        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;

        AlgoCanvas canvas = new AlgoCanvas();

        // canvas.setPreferredSize(new Dimension(canvasWidth, canvasHeight));

        setContentPane(canvas);

        // according to content auto set frame size
        pack();

        // setSize(canvasWidth, canvasHeight);

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public AlgoFrame(String title) {
        this(title, 1024, 768);
    }

    public int getCanvasWidth() {
        return canvasWidth;
    }

    public int getCanvasHeight() {
        return canvasHeight;
    }

    private class AlgoCanvas extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            RenderingHints hints = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.addRenderingHints(hints);

            AlgoVisHelper.setStrokeWith(g2d, 5);

            AlgoVisHelper.setColor(g2d, Color.GREEN);
            AlgoVisHelper.fillCircle(g2d, canvasWidth / 2, canvasHeight / 2, 200);

            AlgoVisHelper.setColor(g2d, Color.GRAY);
            AlgoVisHelper.strokeCircle(g2d, canvasWidth / 2, canvasHeight / 2, 200);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(canvasWidth, canvasHeight);
        }
    }
}
