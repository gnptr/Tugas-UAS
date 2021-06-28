package algoritma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class runtiket {
        public static void main(String[] args) {
            JFrame jFrame = new JFrame("DATA MAHASISWA");
            jFrame.setContentPane(new tiket().getRootpanel());
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setSize(500, 300);
            jFrame.setVisible(true);

        }
}
