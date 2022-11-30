package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField txtYaricap;
	JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireAlanHesaplamaFormu window = new DaireAlanHesaplamaFormu();
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
	public DaireAlanHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Yarıçap Giriniz:");
		lblNewLabel.setBounds(36, 38, 130, 23);
		frame.getContentPane().add(lblNewLabel);
		
		txtYaricap = new JTextField();
		txtYaricap.setBounds(239, 36, 130, 26);
		frame.getContentPane().add(txtYaricap);
		txtYaricap.setColumns(10);
		
		JButton buttonHesapla = new JButton("Alan Hesapla");
		buttonHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Daire daire = new Daire();
				String alan= daire.alan(Double.valueOf(txtYaricap.getText()));
				lblSonuc.setText(alan);
			}
		});
		buttonHesapla.setBounds(252, 118, 117, 29);
		frame.getContentPane().add(buttonHesapla);
		
		lblSonuc = new JLabel("Alan");
		lblSonuc.setBounds(33, 187, 336, 29);
		frame.getContentPane().add(lblSonuc);
	}

}
