import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MonBouton extends Button implements MouseListener
{
//	private JPanel panneau = new JPanel();
//	private JButton bouton1 = new JButton("1");
	
	public MonBouton(String label)
	{
		super(label);

		//this.setTitle("Mon bouton");
//		this.setSize(500,500);
//		this.setLocationRelativeTo(null);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		panneau.add(bouton1);
//		setContentPane(panneau);
//		this.setVisible(true);
		addMouseListener(this);
		
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(Color.CYAN);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(Color.GREEN);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setLabel("Pressé");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setLabel("Relaché");
	}

}
