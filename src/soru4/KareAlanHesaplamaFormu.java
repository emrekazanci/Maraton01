package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField txtDeger;
	JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareAlanHesaplamaFormu window = new KareAlanHesaplamaFormu();
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
	public KareAlanHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Karenin Bir Kenarı:");
		lblNewLabel.setBounds(30, 44, 139, 26);
		frame.getContentPane().add(lblNewLabel);
		
		txtDeger = new JTextField();
		txtDeger.setBounds(224, 44, 146, 26);
		frame.getContentPane().add(txtDeger);
		txtDeger.setColumns(10);
		
		JButton buttonHesapla = new JButton("Hesapla");
		buttonHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kare kare = new Kare();
				String alanText= kare.kareAlanHesapla(Double.valueOf(txtDeger.getText()));
				lblSonuc.setText(alanText);
				
				
			}
		});
		buttonHesapla.setBounds(143, 107, 117, 29);
		frame.getContentPane().add(buttonHesapla);
		
		lblSonuc = new JLabel("Alan:");
		lblSonuc.setBounds(30, 182, 355, 34);
		frame.getContentPane().add(lblSonuc);
	}
}
