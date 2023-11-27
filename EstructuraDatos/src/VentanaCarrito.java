
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class VentanaCarrito extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCarrito frame = new VentanaCarrito();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCarrito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Su compra ha sido agregada al carrito!");
		btnNewButton_1.setBounds(98, 100, 300, 80);
		btnNewButton_1.setEnabled(false);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Agregar otro producto");
		btnNewButton_2.setBounds(620, 100, 200, 80);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu newFrame=new VentanaMenu();
				newFrame.setVisible(true);
				setVisible(false);
			}});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Agregar métodos de Pago");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(148, 382, 200, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Emitir Factura");
		btnNewButton_3.setBounds(620, 504, 200, 60);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Num. Tarjeta");
		btnNewButton_4.setBounds(30, 455, 117, 29);
		btnNewButton_4.setEnabled(false);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Vencimiento");
		btnNewButton_4_1.setBounds(30, 532, 117, 29);
		btnNewButton_4_1.setEnabled(false);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Num. Traseros");
		btnNewButton_4_2.setBounds(30, 602, 117, 29);
		btnNewButton_4_2.setEnabled(false);
		contentPane.add(btnNewButton_4_2);
		
		textField = new JTextField();
		textField.setBounds(30, 497, 200, 20);
		textField.setColumns(10);
		textField.setBackground(new Color(255, 255, 128));
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 255, 128));
		textField_1.setBounds(30, 571, 200, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(255, 255, 128));
		textField_2.setBounds(30, 638, 200, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton_5 = new JButton("Pago Fisico");
		btnNewButton_5.setBounds(356, 533, 117, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("PAGAR");
		btnNewButton_5_1.setBounds(356, 611, 117, 29);
		contentPane.add(btnNewButton_5_1);
	}

}

