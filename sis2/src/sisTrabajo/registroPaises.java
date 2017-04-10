package sisTrabajo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class registroPaises {
JFrame ventana;
JPanel panel;
JButton bot1,bot2;
JTextField tx1, tx2, tx3;
JLabel titulo,npais,ncod,nidioma;
ArrayList<Pais> listaPaises;

public registroPaises(){
	
	panel = new JPanel();
	panel.setLayout(null);
	
	bot1 = new JButton("REGISTRAR");
	bot1.setBounds(40, 420,150,30);
	bot1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String x1 = tx1.getText();
			String x2 = tx2.getText();
			String x3 = tx3.getText();
			
			registrarPais(x1,x2,x3);
			
			tx1.setText("");
			tx2.setText("");
			tx3.setText("");
			
		}
		
	});
	panel.add(bot1);
	
	bot2 = new JButton("Borrar");
	bot2.setBounds(260, 420, 150, 30);
	bot2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			tx1.setText("");
			tx2.setText("");
			tx3.setText("");
			
		}
		
	});
	panel.add(bot2);
	
	tx1 = new JTextField();
	tx1.setBounds(180, 100, 200, 30);
	panel.add(tx1);
	
	tx2 = new JTextField();
	tx2.setBounds(180, 150, 200, 30);
	panel.add(tx2);
	
	tx3 = new JTextField();
	tx3.setBounds(180, 200, 200, 30);
	panel.add(tx3);
	
	npais = new JLabel();
	npais.setText("PAIS:");
	npais.setBounds(100, 100, 50, 30);
	panel.add(npais);
	
	ncod = new JLabel();
	ncod.setText("COD PAIS:");
	ncod.setBounds(100, 150, 100, 30);
	panel.add(ncod);
	
	nidioma = new JLabel();
	nidioma.setText("IDIOMA:");
	nidioma.setBounds(100, 200, 100, 30);
	panel.add(nidioma);
	
	titulo = new JLabel();
	titulo.setText("REGISTRO DE PAISES");
	titulo.setBounds(200, 30, 300, 30);
	panel.add(titulo);
	
	ventana = new JFrame();
	ventana.setContentPane(panel);
	ventana.setVisible(true);
	ventana.setBounds(50, 50, 500, 500);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	listaPaises = new ArrayList<>();
}

public void registrarPais(String nombre, String cod,String idioma){
	Pais p = new Pais(nombre, cod, idioma);
	listaPaises.add(p);
	JOptionPane.showMessageDialog(null, "REGISTRADO");
	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		registroPaises re = new registroPaises();
	}

}
