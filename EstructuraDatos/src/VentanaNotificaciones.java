
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class VentanaNotificaciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNotificaciones frame = new VentanaNotificaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Color rojoSuave = new Color(255, 153, 153);
	/**
	 * Create the frame.
	 */
	public VentanaNotificaciones() {
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
		btnNewButton.setBackground(rojoSuave);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Logo REFFRESH");
		btnNewButton_1.setBounds(800, 20, 50, 50);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaNotificaciones newFrame=new VentanaNotificaciones();
				newFrame.setVisible(true);
				setVisible(false);
			}});
	}
}
