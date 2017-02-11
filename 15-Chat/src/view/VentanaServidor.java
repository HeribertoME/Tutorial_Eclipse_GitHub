package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author heriberto
 *
 */

public class VentanaServidor extends JFrame {
	
	public JTextField campoTexto = new JTextField();
	public JTextArea areaTexto = new JTextArea();
	
	private Color blanco = new Color(250, 250, 250);
	private Color negro = new Color(000, 000, 000);
	//private Color gris = new Color(223, 223, 223);
	private Color azul = new Color(73, 144, 222);
	
	/**
	 * Constructo de la clase donde se inicializan todos los componentes
	 * de la ventana principal del servidor
	 */
	public VentanaServidor(){
		super.setTitle("Servidor");	// Titulo de la ventana
		
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);	// Agrega la opcion de cerrar la ventana		
		cargarControles();	// Metodo que sirve para cargar los componentes
		super.setSize(300, 320);	// Tama�o de la ventana
		super.setLocationRelativeTo(null);
		super.setVisible(true);
	}
	
	/**
	 * Metodo que tiene la funcion de cargar los controles
	 */
	private void cargarControles(){
		campoTexto.setEditable(false);	// No permite que sea editable el campo de texto
		add(campoTexto, BorderLayout.NORTH);	// Coloca el campo de texto en la parte superior
		
		areaTexto.setEditable(false);
		add(new JScrollPane(areaTexto), BorderLayout.CENTER);
		areaTexto.setBackground(blanco);	// Pone de color blanco al areaTexto
		areaTexto.setForeground(azul);	// Pinta azul la letra en el areaTexto
		campoTexto.setForeground(negro);	// Pinta toda la letra del mensaje a enviar
	}
	
	/**
	 * Metodo para mostrar texto en displayArea
	 */
	public void mostrarMensaje(String mensaje){
		areaTexto.append(mensaje + "\n");
	}
	
	/**
	 * Metodo para habilitar el texto en campoTexto
	 */
	public void habilitarTexto(boolean editable){
		campoTexto.setEditable(editable);
	}

}
