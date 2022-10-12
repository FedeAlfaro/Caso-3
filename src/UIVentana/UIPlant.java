package UIVentana;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import UIController.GardenMainFrameController;

public class UIPlant extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel lblImagen;
	JLabel lblType;
	JLabel lblVitalidad;
	JLabel lblAbono;
	JLabel lblAgua;
	JButton btnRegar;
	JButton btnAbonar;
	GardenMainFrameController controller;
	
	
	public UIPlant(GardenMainFrameController pController, String pImagen, int pSeparacion, String pType, int pVitalidad, int i, int pAbono, int pAgua){
		controller= pController;
		ImageIcon imagen= new ImageIcon(pImagen);
		lblImagen = new JLabel();
		lblImagen.setBounds(10+pSeparacion, 50, 200, 200);
		lblImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH)));
		
		lblType = new JLabel(pType);
		lblType.setBounds(10+pSeparacion, 350, 100, 20);
		
		lblAbono = new JLabel("Nivel de abono: "+pAbono);
		lblAbono.setBounds(10+pSeparacion, 260, 200, 20);
		lblAbono.setVisible(true);
		
		lblAgua = new JLabel("Nivel de agua: "+pAgua);
		lblAgua.setBounds(10+pSeparacion, 280, 200, 20);
		lblAgua.setVisible(true);
		
		lblVitalidad = new JLabel("Vitalida: "+ pVitalidad);
		lblVitalidad.setBounds(10+pSeparacion, 10, 100, 20);
		
		btnAbonar = new JButton("Abonar");  
		btnAbonar.setBounds(10+pSeparacion, 300, 100,20);
		btnAbonar.setEnabled(true);
		btnAbonar.setVisible(true);
		btnAbonar.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){  
    			pController.Abonar(i);
    		}  
    	});
		
		btnRegar = new JButton("Regar");  
		btnRegar.setBounds(110+pSeparacion, 300, 100,20);
		btnRegar.setEnabled(true);
		btnRegar.setVisible(true);
		btnRegar.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){  
    			pController.Regar(i);
    		}  
    	});
		
	}


	public JLabel getLblImagen() {
		return lblImagen;
	}


	public JLabel getLblType() {
		return lblType;
	}


	public JButton getBtnRegar() {
		return btnRegar;
	}


	public JButton getBtnAbonar() {
		return btnAbonar;
	}
	
	public JLabel getLblVitalidad() {
		return lblVitalidad;
	}


	public void setLblVitalidad(int pVitalidad) {
		this.lblVitalidad.setText("Vitalidad: "+ pVitalidad);
	}

	public void setLblAbono(int pAbono) {
		this.lblAbono.setText("Nivel de abono: "+ pAbono);
	}
	
	public void setLblAgua(int pAgua) {
		this.lblAgua.setText("Nivel de Agua: "+ pAgua);
	}


	public JLabel getLblAbono() {
		return lblAbono;
	}


	public JLabel getLblAgua() {
		return lblAgua;
	}


	public GardenMainFrameController getController() {
		return controller;
	}


	public void setLblImagen(String pImagen) {
		ImageIcon imagen= new ImageIcon(pImagen);
		lblImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH)));
	}

}
