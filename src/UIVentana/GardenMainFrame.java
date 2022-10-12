package UIVentana;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import UIController.GardenMainFrameController;

public class GardenMainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	private GardenMainFrameController controller;
	private JLabel lblTemperature;
	private JLabel lblSun;
	private JLabel lblRain;
	private JLabel lblDay;
	private JLabel lblSeason;
	private int opcion;
	private ArrayList<JButton> btnAOptionPlant = new ArrayList<JButton>();
	private boolean flag;
	private ArrayList<UIPlant> UIGarden = new ArrayList<UIPlant>();
	private int i=0;
	

	public GardenMainFrame(String pTitle, GardenMainFrameController pController) {
		super(pTitle);
		controller = pController; // frame ve al controller
		controller.setWindow(this); // controller ve al frame

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(0, 0, 1080, 780);
		this.setLocationRelativeTo(null);
		this.setLayout(null); // this allows this frame to locate the components with freedom in the screen
		this.setBackground(Color.white);
		
		JScrollPane scrollPane = new JScrollPane();
    	this.getContentPane().add(scrollPane);
		
		this.initComponents();
		
		this.setVisible(true);		
	}
	
	
	
	public void setActualValues(int pRain,int pTemperature, int pSun,int pDays, String pSeason) {
		lblTemperature.setText("Temperatura actual: "+ pTemperature);
		lblSun.setText("Sol actual: "+ pSun);
		lblRain.setText("Lluvia actual: "+ pRain);
		lblDay.setText("Días trasncurridos: "+ pDays);
		lblSeason.setText("Estación actual: "+ pSeason);
		
	}
	
	
    
    private void initComponents() {
    	lblSeason = new JLabel("");
    	lblSeason.setBounds(10, 640, 160, 20);
    	this.add(lblSeason);
    	
    	lblTemperature = new JLabel("");
    	lblTemperature.setBounds(10, 655, 160, 20);
    	this.add(lblTemperature);

    	lblSun = new JLabel("");
    	lblSun.setBounds(10, 670, 220, 20);
    	this.add(lblSun);
    	
    	lblRain = new JLabel("");
    	lblRain.setBounds(10, 685, 220, 20);
    	this.add(lblRain);
    	
    	lblDay = new JLabel("");
    	lblDay.setBounds(10, 700, 220, 20);
    	this.add(lblDay);
    	
    	JLabel lblNewPlant = new JLabel("Por favor elija una nueva planta para su huerto");
    	lblNewPlant.setBounds(10, 540, 400, 20);
    	this.add(lblNewPlant);
    	
    	JScrollPane scroller= new JScrollPane();
    	
    	
    }
    
    public int AddPlant() {
    	enableBottons();
    	boolean flag2=true;
    	while(flag2) {
    		if(!flag) {
    			flag2=false;
    		}
    		System.out.print("");
    	}
    	return opcion;
    }
    
    public void AddPlantBottons(String pNombre, int pOpcion, int separacion) {
    	JButton btn = new JButton(pNombre);  
    	btn.setBounds(10+separacion, 560, 100,20);
    	btn.setEnabled(false);
    	btn.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){  
    			opcion=pOpcion;
    			disableBottons();
    		}  
    	});
    	btnAOptionPlant.add(btn);
    	this.add(btn);
    }
    
    public void enableBottons() {
    	for(JButton btn:btnAOptionPlant) {
    		btn.setEnabled(true);
    	}
    	flag= true;
    }
    
    public void disableBottons() {
    	for(JButton btn:btnAOptionPlant) {
    		btn.setEnabled(false);
    	}
    	flag= false;
    }



	public void insertPlant(String pImagen, int pSeparacion, String pType, int pVitalidad, int pAbono, int pAgua) {
		UIPlant UIplant= new UIPlant(controller, pImagen, pSeparacion*i, pType, pVitalidad, i, pAbono, pAgua);
		this.add(UIplant.getLblImagen());
    	this.add(UIplant.getLblType());
    	this.add(UIplant.getBtnRegar());
    	this.add(UIplant.getBtnAbonar());
    	this.add(UIplant.getLblVitalidad());
    	this.add(UIplant.getLblAgua());
    	this.add(UIplant.getLblAbono());
		UIGarden.add(UIplant);
		i++;
    	 
	}
	
	public void cambiarVitalidad(int pVitalidad, int i) {
		UIGarden.get(i).setLblVitalidad(pVitalidad);
	}
	
	public void cambiarAgua(int pAgua, int i) {
		UIGarden.get(i).setLblAgua(pAgua);
	}
	
	public void cambiarAbono(int pAbono, int i) {
		UIGarden.get(i).setLblAbono(pAbono);
	}
	
	public void cambiarImagen(String pImagen, int i) {
		UIGarden.get(i).setLblImagen(pImagen);
	}
    
}
