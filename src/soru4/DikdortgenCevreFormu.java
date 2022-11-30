package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdortgenCevreFormu {

	private JFrame frame;
	private JTextField txtKisaKenar;
	private JTextField txtUzunKenar;
	JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DikdortgenCevreFormu window = new DikdortgenCevreFormu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DikdortgenCevreFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kısa kenar girin:");
		lblNewLabel.setBounds(27, 27, 158, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Uzun kenar girin:");
		lblNewLabel_1.setBounds(27, 87, 158, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtKisaKenar = new JTextField();
		txtKisaKenar.setColumns(10);
		txtKisaKenar.setBounds(245, 26, 130, 26);
		frame.getContentPane().add(txtKisaKenar);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setColumns(10);
		txtUzunKenar.setBounds(245, 86, 130, 26);
		frame.getContentPane().add(txtUzunKenar);
		
		JButton buttonHesapla = new JButton("Çevre hesapla");
		buttonHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dikdortgen dikdortgen = new Dikdortgen();
				String cevre = dikdortgen.dikdortgenCevre(Double.valueOf(txtKisaKenar.getText()), Double.valueOf(txtUzunKenar.getText()));
				lblSonuc.setText(cevre);
			}
		});
		buttonHesapla.setBounds(258, 154, 117, 29);
		frame.getContentPane().add(buttonHesapla);
		
		lblSonuc = new JLabel("New label");
		lblSonuc.setBounds(27, 209, 354, 26);
		frame.getContentPane().add(lblSonuc);
	}

}
