import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	
	private JPanel panneau = new JPanel();
	private JPanel panneau2 = new JPanel();
//	
	private JButton bouton1 = new JButton("1");
	private JButton bouton2 = new JButton("2");
	private JButton bouton3 = new JButton("3");
	private JButton bouton4 = new JButton("4");
	private JButton bouton5 = new JButton("5");
//	
//	private JCheckBox choix1 = new JCheckBox("Riri");
//	private JCheckBox choix2 = new JCheckBox("Fifi");
//	private JCheckBox choix3 = new JCheckBox("Loulou");
//		
//	private ButtonGroup group = new ButtonGroup();
//	private JRadioButton radio1 = new JRadioButton("Oui");
//	private JRadioButton radio2 = new JRadioButton("Non");
//	private JRadioButton radio3 = new JRadioButton("Peut-être");
//	
//	private JLabel etiquette1 = new JLabel ("Entrez votre nom:");
//	
//	private JTextField formulaire1 = new JTextField("_nom_");
//	
//	private String [] liste_deroulante ={"Masculin","Féminin","Indeterminé"}; // sinon utiliser des list1.addItem("...") dans le constructeur
//	private JComboBox liste1 = new JComboBox(liste_deroulante);
//	private JLabel etiquette2 = new JLabel ("Quel est votre sexe:");
	
	public Fenetre()
	{
		// .setBounds
		// .setBackground
		this.setTitle("Ma première fenêtre");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setBackground(Color.BLACK);
		this.setBackground(Color.WHITE);

		panneau.setBackground(Color.BLUE); // Définition du container avec 2 panneaux
//	    panneau2.setBackground(Color.GRAY);
//	    Container contenu = new JPanel();
//	    contenu.add(panneau);
//	    contenu.add(panneau2);
//	    getContentPane().add(contenu);
	    
	    

//	    panneau.add(choix1);
//	    panneau.add(choix2);
//	    panneau.add(choix3);
//	    
//	    group.add(radio1);
//	    group.add(radio2);
//	    group.add(radio3);
//	    panneau.add(radio1);// il faut aussi ajouter chaque boutton au panneau, car on ne peut ajouter un groupe au panneau
//	    panneau.add(radio2);
//	    panneau.add(radio3);
	    
//	    panneau2.add(etiquette1);
//	    panneau2.add(formulaire1);
//	    
//	    panneau2.add(etiquette2);
//	    panneau2.add(liste1);
			    
//	    this.setVisible(true); // pour la fenetre, toujours mettre à la fin de la définition de notre code -> = rafraichissement
	    
	    //Border_disposition();
	    //Card_disposition();
		//Grid_disposition();
		//Box_disposition();
		//Mix_disposition();
		ExoPaintComponent();


	}
	
	
	public void Border_disposition()
	{		
		getContentPane().add(panneau);
		panneau.setLayout(new BorderLayout());
	    
		panneau.add(bouton1, BorderLayout.NORTH);		//panneau.add(composant) équivalent à: getContentPane().add(composant)
		panneau.add(bouton2, BorderLayout.SOUTH);
		panneau.add(bouton3, BorderLayout.CENTER);
		panneau.add(bouton4, BorderLayout.WEST);
		panneau.add(bouton5, BorderLayout.EAST);
		
		this.setVisible(true);
	}
	
//	public void Card_disposition() // a finir, ne marche pas
//	{		
//		getContentPane().add(panneau);
//		panneau.setLayout(new CardLayout());
//	    
//		panneau.add(bouton1, "NORD");		//panneau.add(composant) équivalent à: getContentPane().add(composant)
//		panneau.add(bouton2, "SUD");
//		panneau.add(bouton3, "CENTRE");
//		panneau.add(bouton4, "OUEST");
//		panneau.add(bouton5, "EST");
//		
//		this.setVisible(true);
//	}
	
	public void Grid_disposition()
	{
		getContentPane().add(panneau); //setContentPane(panneau);
		panneau.setLayout(new GridLayout(2,3)); // 2 lignes, 3 colonnes
		
		panneau.add(bouton1);		//panneau.add(composant) équivalent à: getContentPane().add(composant)
		panneau.add(bouton2);
		panneau.add(bouton3);
		panneau.add(bouton4);
		panneau.add(bouton5);
		
		this.setVisible(true);
	}
	
	public void Box_disposition()
	{
		getContentPane().add(panneau);
		panneau.setLayout(new BoxLayout(panneau, BoxLayout.PAGE_AXIS));
		
		panneau.add(bouton1);		//panneau.add(composant) équivalent à: getContentPane().add(composant)
		panneau.add(bouton2);
		panneau.add(bouton3);
		panneau.add(bouton4);
		panneau.add(bouton5);
		
		this.setVisible(true);
	}
	
	public void Mix_disposition()
	{		
		JButton bouton6 = new JButton("6");
		JButton bouton7 = new JButton("7");
		JButton bouton8 = new JButton("8");
		
		getContentPane().setLayout(new FlowLayout());
		JPanel menu = new JPanel();
		menu.setPreferredSize(new Dimension(200,200));
		//getContentPane().add(panneau);
		menu.setLayout(new BoxLayout(menu, BoxLayout.PAGE_AXIS));
		
		menu.add(bouton1);		//panneau.add(composant) équivalent à: getContentPane().add(composant)
		menu.add(bouton2);
		menu.add(bouton3);
		//panneau.add(panneau2);

		JPanel grid = new JPanel(new GridLayout(2,3)); // 2 lignes, 3 colonnes
		grid.add(bouton4);
		grid.add(bouton5);
		grid.add(bouton6);
		grid.add(bouton7);
		grid.add(bouton8);
		menu.add(grid);
		
		getContentPane().add(menu);
	
		this.setVisible(true);
		
	}
	
	public void ExoPaintComponent()
	{
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}


}
