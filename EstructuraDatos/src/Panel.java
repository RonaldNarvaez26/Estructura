
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel() {
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(512, 27, 117, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setLayout(null);
		add(btnNewButton);

	}

}
