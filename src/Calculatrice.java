import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculatrice extends JFrame implements MouseListener
{
	private JPanel pan0 = new JPanel(); // conteneur
	private JLabel afficheur = new JLabel ("0");

	private JPanel pan1 = new JPanel(); // afficheur
	private JPanel pan2 = new JPanel(); // operateurs + C
	private JPanel pan3 = new JPanel(); // 9 chiffres,.,+ 
		
	private JButton bouton1 = new JButton("1");
	private JButton bouton2 = new JButton("2");
	private JButton bouton3 = new JButton("3");
	private JButton bouton4 = new JButton("4");
	private JButton bouton5 = new JButton("5");
	private JButton bouton6 = new JButton("6");
	private JButton bouton7 = new JButton("7");
	private JButton bouton8 = new JButton("8");
	private JButton bouton9 = new JButton("9");
	private JButton bouton0 = new JButton("0");
	private JButton bouton_dot = new JButton(".");
	private JButton bouton_egal = new JButton("=");
	
	private JButton bouton_C = new JButton("C");
	private JButton bouton_plus = new JButton("+");
	private JButton bouton_minus = new JButton("-");
	private JButton bouton_multip = new JButton("*");
	private JButton bouton_divide = new JButton("/");

	public Calculatrice()
	{
		super ("Une fenêtre qui traite les clics souris");
		this.setTitle("Calculatrice");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addMouseListener(this);
		
		
		pan0.setLayout(new BorderLayout(40,30));
		pan2.setLayout(new GridLayout(5,1,9,9));
		pan3.setLayout(new GridLayout(4,3,9,9));
		
		pan0.add(pan1, BorderLayout.NORTH);
		afficheur.setHorizontalAlignment(JLabel.RIGHT);
		afficheur.setPreferredSize(new Dimension(this.getWidth()-30,80));
		afficheur.setOpaque(true);
		pan1.setBackground(Color.DARK_GRAY);
		afficheur.setBackground(Color.GRAY);
		pan1.add(afficheur);
		
		setBackground(Color.red);
		pan2.add(bouton_C);
		pan2.add(bouton_plus);
		pan2.add(bouton_minus);
		pan2.add(bouton_multip);
		pan2.add(bouton_divide);
		pan0.add(pan2, BorderLayout.EAST);
		
		setBackground(Color.red);
		pan3.add(bouton1);
		pan3.add(bouton2);
		pan3.add(bouton3);
		pan3.add(bouton4);
		pan3.add(bouton5);
		pan3.add(bouton6);
		pan3.add(bouton7);
		pan3.add(bouton8);
		pan3.add(bouton9);
		pan3.add(bouton0);
		pan3.add(bouton_dot);
		pan3.add(bouton_egal);
		pan0.add(pan3, BorderLayout.CENTER);
		
		setContentPane(pan0);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		
		System.out.println("Clic dans la fenêtre au point de coordonnées "+x+" , "+y);
	}

	@Override
	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}