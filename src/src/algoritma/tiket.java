package algoritma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tiket {
    private JPanel rootpanel;
    private JTextField textnama;
    private JTextField textnomor;
    private JTextField labelnomorgenre;
    private JTextField labelgenre;
    private JTextField labelnomorpaket;
    private JTextField labelnomorkursi;
    private JButton buttonoke;
    private JTextField labelnama;
    private JTextField textpaket;
    private JTextField labelpaket;
    private JTextField textjumlah;
    private JTextField labeljumlah;
    private JComboBox comboboxnambar;
    private JTextField labelbayar;
    private JTextField textharga;
    private JTextField labeldiskon;
    private JComboBox comboboxpaket;
    private JTextField labeltotalbayar;
    private JTextField textbayar;

    public tiket() {
        buttonoke.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textnama.getText();
                String nomorgenre = textnomor.getText();
                String nomorpaket = textpaket.getText();
                String jumlahorang = textjumlah.getText();
                String Harga = textharga.getText();

                DataPenonton DP = new DataPenonton();
                DP.setNama(nama);
                DP.setNomorgenre(nomorgenre);
                DP.setNomorpaket(nomorpaket);
                DP.setJumlahorang(jumlahorang);
                DP.setHarga(Harga);

                labelnama.setText("Nama : " + DP.getNama());
                labelnomorgenre.setText("Nomor Genre : " + DP.getNomorgenre());
                labelgenre.setText("Genre : " + DP.getGenre());
                labelnomorpaket.setText("Nomor Paket : " + DP.getNomorpaket());
                labeljumlah.setText("Jumlah Orang : " + DP.getJumlahorang());
                labelpaket.setText("Paket : " + DP.getPaket());

                labeldiskon.setText("Diskon : " + DP.getDiskon());
                labelnomorkursi.setText(DP.getNoKursi());

            }
        });
        comboboxnambar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboboxnambar.getSelectedItem().equals("Komedi")){
                    textharga.setText("25000");
                } else if (comboboxnambar.getSelectedItem().equals("Horor")){
                    textharga.setText("30000");
                } else if (comboboxnambar.getSelectedItem().equals("Action")){
                    textharga.setText("35000");
                } else if (comboboxnambar.getSelectedItem().equals("Romance")){
                    textharga.setText("25000");
                } else if (comboboxnambar.getSelectedItem().equals("Sci-Fi")){
                    textharga.setText("35000");
                } else if (comboboxnambar.getSelectedItem().equals("Fantasy")){
                    textharga.setText("25000");
                }
            }
        });
        textbayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double hartik = Double.parseDouble(textharga.getText());
                double jumor = Double.parseDouble(textjumlah.getText());
                double bayar = hartik*jumor;
                labelbayar.setText("Rp." + bayar);
            }
        });
    }
    public JPanel getRootpanel(){
        return rootpanel;
    }
}
