package JFrame;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            AlgoFrame frame = new AlgoFrame("JFrame", 650, 500);
            // AlgoFrame frame = new AlgoFrame("JFrame");
        });
    }
}
