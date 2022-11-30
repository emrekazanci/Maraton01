package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField txtDeger;
	JLabel lblCevre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareCevreHesaplamaFormu window = new KareCevreHesaplamaFormu();
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
	public KareCevreHesaplamaFormu() {
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
		lblNewLabel.setBounds(28, 40, 139, 26);
		frame.getContentPane().add(lblNewLabel);
		
		txtDeger = new JTextField();
		txtDeger.setColumns(10);
		txtDeger.setBounds(221, 40, 146, 26);
		frame.getContentPane().add(txtDeger);
		
		JButton buttonHesapla = new JButton("Hesapla");
		buttonHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Kare kare = new Kare();
				String cevreKare= kare.kareCevreHesaplama(Double.valueOf(txtDeger.getText()));
				lblCevre.setText(cevreKare+" cm");
			}
		});
		buttonHesapla.setBounds(144, 107, 117, 29);
		frame.getContentPane().add(buttonHesapla);
		
		lblCevre = new JLabel("Çevre:");
		lblCevre.setBounds(28, 200, 339, 29);
		frame.getContentPane().add(lblCevre);
	}

}
