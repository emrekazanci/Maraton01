package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdortgenAlanFormu {

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
					DikdortgenAlanFormu window = new DikdortgenAlanFormu();
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
	public DikdortgenAlanFormu() {
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
		lblNewLabel.setBounds(19, 28, 158, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Uzun kenar girin:");
		lblNewLabel_1.setBounds(19, 94, 149, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtKisaKenar = new JTextField();
		txtKisaKenar.setBounds(241, 27, 130, 26);
		frame.getContentPane().add(txtKisaKenar);
		txtKisaKenar.setColumns(10);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setBounds(241, 89, 130, 26);
		frame.getContentPane().add(txtUzunKenar);
		txtUzunKenar.setColumns(10);
		
		JButton buttonHesapla = new JButton("Alan Hesapla");
		buttonHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dikdortgen dikdortgen = new Dikdortgen();
				String alan = dikdortgen.dikdortgenAlan(Double.valueOf(txtKisaKenar.getText()), Double.valueOf(txtUzunKenar.getText()));
				lblSonuc.setText(alan);
			}
		});
		buttonHesapla.setBounds(254, 150, 117, 29);
		frame.getContentPane().add(buttonHesapla);
		
		lblSonuc = new JLabel("Sonuç:");
		lblSonuc.setBounds(19, 216, 352, 25);
		frame.getContentPane().add(lblSonuc);
	}

}
