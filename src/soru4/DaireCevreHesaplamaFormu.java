package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireCevreHesaplamaFormu {

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
					DaireCevreHesaplamaFormu window = new DaireCevreHesaplamaFormu();
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
	public DaireCevreHesaplamaFormu() {
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
		lblNewLabel.setBounds(19, 43, 130, 23);
		frame.getContentPane().add(lblNewLabel);
		
		txtYaricap = new JTextField();
		txtYaricap.setColumns(10);
		txtYaricap.setBounds(210, 41, 130, 26);
		frame.getContentPane().add(txtYaricap);
		
		JButton buttonCevre = new JButton("Çevre Hesapla");
		buttonCevre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daire daire = new Daire();
				String cevre = daire.cevre(Double.valueOf(txtYaricap.getText()));
				lblSonuc.setText(cevre);
			}
		});
		buttonCevre.setBounds(223, 142, 117, 29);
		frame.getContentPane().add(buttonCevre);
		
		lblSonuc = new JLabel("Çevre:");
		lblSonuc.setBounds(34, 210, 336, 29);
		frame.getContentPane().add(lblSonuc);
	}

}
