package aplikasiperhitungandiskon;

import javax.swing.JFrame;

public class appmain {
    public static void main(String[] args) {
        // Buat frame utama
        JFrame frame = new JFrame("Aplikasi Perhitungan Diskon");

        // Tambahkan panel kamu ke frame
        frame.setContentPane(new PerhitunganDiskon());

        // Atur ukuran, posisi, dan aksi close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600); // Sesuaikan ukuran sesuai GUI kamu
        frame.setLocationRelativeTo(null); // Biar muncul di tengah layar

        // Tampilkan
        frame.setVisible(true);
    }
}
