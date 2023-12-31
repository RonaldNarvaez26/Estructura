import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class Plato {
	private String descripcion;
	private double precio;

	public Plato(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}
}

public class VentanaMenu extends JFrame {

	private Map<String, Plato> menu;

	private JPanel contentPane;

	private JTextField txtBuscar;

	private ArrayList<String> platosSeleccionados;
	private JTextArea txtAreaPlatosSeleccionados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu frame = new VentanaMenu();
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

	public VentanaMenu() {

		// Inicializamos la tabla hash del menú
		menu = new HashMap<>();

		// Agregamos algunos platillos al menú
		agregarPlatillo("Brochetas de pollo con pimenton", "Pollo a la parrilla condimentado con verduras", 5.99);
		agregarPlatillo("Jugo Natural Limonada", "Jugo muy natural con limon y hierba buena", 7.99);
		agregarPlatillo("Pollo como ala-pecho", "Pollo a la leña gratinado con papas", 4.99);
		agregarPlatillo("Hamburguesa doble carne con queso", "200 gramos de hamburguesa a la parrilla", 4.99);
		agregarPlatillo("Pique Macho", "Estilo cochabambino con papas y morron", 4.99);
		agregarPlatillo("Bife Chorizo", "Bife cocido a eleccion con papas y arroz con queso", 4.99);
		agregarPlatillo("Pollo como ala-pecho", "Pollo a la leña gratinado con papas", 4.99);
		agregarPlatillo("Chancho a la cruz", "Chancho ahumado a la cruz con verduras", 4.99);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setBounds(750, 620, 117, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame newFrame = new frame();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.setLayout(null);

		txtAreaPlatosSeleccionados = new JTextArea();
		txtAreaPlatosSeleccionados.setBounds(650, 100, 200, 400);
		contentPane.add(txtAreaPlatosSeleccionados);

		// Botón de buscar
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(73, 375, 100, 25);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombrePlatillo = txtBuscar.getText();
				buscarPlatillo(nombrePlatillo);
			}
		});
		contentPane.add(btnBuscar);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(rojoSuave);

		JButton btnNewButton_1 = new JButton("Brochetas de pollo con pimenton");
		String pedido = "Brochetas de pollo con pimenton";
		btnNewButton_1.setBounds(280, 580, 350, 60);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarrito newFrame = new VentanaCarrito();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Jugo Natural Limonada");
		btnNewButton_2.setBounds(280, 500, 350, 60);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarrito newFrame = new VentanaCarrito();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Pollo como ala-pecho a la leña");
		btnNewButton_3.setBounds(280, 420, 350, 60);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarrito newFrame = new VentanaCarrito();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Hamburguesa doble carne con queso");
		btnNewButton_4.setBounds(280, 340, 350, 60);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarrito newFrame = new VentanaCarrito();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Pique Macho");
		btnNewButton_5.setBounds(280, 260, 350, 60);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarrito newFrame = new VentanaCarrito();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Bife Chorizo");
		btnNewButton_6.setBounds(280, 180, 350, 60);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarrito newFrame = new VentanaCarrito();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_6_1 = new JButton("Chancho a la cruz");
		btnNewButton_6_1.setBounds(280, 100, 350, 60);
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarrito newFrame = new VentanaCarrito();
				newFrame.setVisible(true);
				setVisible(false);
				agregarPlatoSeleccionado("Chancho a la cruz");
				// Actualizar el área de texto con la lista de platos seleccionados
				actualizarAreaPlatosSeleccionados();
			}
		});
		contentPane.add(btnNewButton_6_1);

		JButton btnNewButton_6_1_1 = new JButton("MENÚ DE PLATOS PRINCIPALES");
		btnNewButton_6_1_1.setEnabled(false);
		btnNewButton_6_1_1.setBounds(170, 30, 600, 40);
		contentPane.add(btnNewButton_6_1_1);

		JButton btnNewButton_7 = new JButton("Reservar");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaReserva newFrame = new VentanaReserva();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_7.setBounds(26, 620, 117, 29);
		contentPane.add(btnNewButton_7);

		JButton btnMostrarPlatosSeleccionados = new JButton("Mostrar Platos Seleccionados");
		btnMostrarPlatosSeleccionados.setBounds(650, 520, 200, 40);
		btnMostrarPlatosSeleccionados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPlatosSeleccionados();
			}
		});
		contentPane.add(btnMostrarPlatosSeleccionados);

		Set<String> nombresPlatillos = menu.keySet();
		for (String nombre : nombresPlatillos) {
			crearBotonPlatillo(nombre);
		}

		txtBuscar = new JTextField();
		txtBuscar.setBounds(26, 339, 190, 25);
		contentPane.add(txtBuscar);
	}

	private void crearBotonPlatillo(String nombrePlatillo) {
		JButton botonPlatillo = new JButton(nombrePlatillo);
		botonPlatillo.setBounds(280, 580, 350, 60);
		botonPlatillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarrito newFrame = new VentanaCarrito();
				newFrame.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(botonPlatillo);
	}

	public void agregarPlatillo(String nombre, String descripcion, double precio) {
		// Agregamos un platillo al menú
		Plato plato = new Plato(descripcion, precio);
		menu.put(nombre, plato);
	}

	public void mostrarInformacionPlatillo(String nombre) {
		// Buscamos un platillo en el menú por su nombre
		Plato plato = menu.get(nombre);

		// Mostramos la información del platillo si lo encontramos
		if (plato != null) {
			String mensaje = "Nombre: " + nombre + "\nDescripción: " + plato.getDescripcion() + "\nPrecio: $"
					+ plato.getPrecio();
			JOptionPane.showMessageDialog(this, mensaje, "Información del Platillo", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "Platillo no encontrado en el menú.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void agregarPlatoSeleccionado(String nombrePlatillo) {
		platosSeleccionados.add(nombrePlatillo);
	}

	// Método para actualizar el área de texto con la lista de platos seleccionados
	private void actualizarAreaPlatosSeleccionados() {
		txtAreaPlatosSeleccionados.setText("Platos Seleccionados:\n");
		for (String platillo : platosSeleccionados) {
			txtAreaPlatosSeleccionados.append("- " + platillo + "\n");
		}
	}

	// Método para mostrar la lista completa de platos seleccionados
	private void mostrarPlatosSeleccionados() {
		JOptionPane.showMessageDialog(this, txtAreaPlatosSeleccionados.getText(), "Platos Seleccionados",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public Set<String> obtenerNombresPlatillos() {
		// Devolvemos el conjunto de nombres de platillos
		return menu.keySet();
	}

	public void buscarPlatillo(String nombrePlatillo) {
		// Llamamos a la función mostrarInformacionPlatillo con el nombre ingresado
		mostrarInformacionPlatillo(nombrePlatillo);
	}
}
