import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenu;
import java.awt.TextArea;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public class VentanaGestion extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGestion frame = new VentanaGestion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JTextField textField_5;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	/**
	 * Create the frame.
	 */
	public VentanaGestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setBounds(750, 620, 117, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame newFrame=new frame();
				newFrame.setVisible(true);
				setVisible(false);
			}});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 128));
		textField.setBounds(400, 70, 400, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		TextArea textArea = new TextArea();
		textArea.setBackground(new Color(255, 255, 128));
		textArea.setBounds(289, 442, 400, 200);
		contentPane.add(textArea);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 128));
		textField_1.setColumns(10);
		textField_1.setBounds(400, 130, 400, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 128));
		textField_2.setColumns(10);
		textField_2.setBounds(400, 190, 400, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(255, 255, 128));
		textField_3.setBounds(400, 250, 400, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(255, 255, 128));
		textField_4.setBounds(400, 307, 400, 30);
		contentPane.add(textField_4);
		
		btnNewButton_1 = new JButton("Nombre y Apellido");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(197, 72, 150, 40);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Carnet C.I");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(197, 132, 150, 40);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Dirección");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBounds(197, 192, 150, 40);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Correo");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.setBounds(197, 252, 150, 40);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Telefono");
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.setBounds(197, 309, 150, 40);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("NIT");
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.setBounds(197, 368, 150, 40);
		contentPane.add(btnNewButton_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(255, 255, 128));
		textField_5.setBounds(401, 371, 400, 30);
		contentPane.add(textField_5);
		
		btnNewButton_7 = new JButton("FORMULARIO DE DATOS");
		btnNewButton_7.setEnabled(false);
		btnNewButton_7.setBounds(367, 8, 250, 40);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("Guardar");
		btnNewButton_8.setBounds(725, 541, 150, 40);
		contentPane.add(btnNewButton_8);
	}
}