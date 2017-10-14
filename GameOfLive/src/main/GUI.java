package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class GUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuItem neu, save, load, exit;

	public static void main(String[] args) {
		new GUI(10, 10).setVisible(true);
	}

	GUI(int row, int col) {

		// ---------------------------Menu---------------------------
		JMenu fileMenu = new JMenu("Datei");

		neu = new JMenuItem("Neues Spiel");
		neu.addActionListener(this);
		save = new JMenuItem("Speichern");
		save.addActionListener(this);
		load = new JMenuItem("Laden");
		load.addActionListener(this);
		fileMenu.addSeparator();
		exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		fileMenu.add(neu);
		fileMenu.add(load);
		fileMenu.add(save);
		fileMenu.add(exit);
		
		JButton start = new JButton("Start");
		JButton stop = new JButton("Stop");
		JButton einzel = new JButton("Einzelschritt");

		JMenuBar bar = new JMenuBar();
		bar.add(fileMenu);
		bar.add(start);
		bar.add(stop);
		bar.add(einzel);
		setJMenuBar(bar);

		// Grid
		getContentPane().setLayout(new GridLayout(row, col));

		for (int i = 0; i != row; i++) {
			for (int j = 0; j != col; j++) {
				JToggleButton button = new JToggleButton();
				button.setBackground(Color.WHITE);
				UIManager.put("ToggleButton.select", Color.BLACK);
				SwingUtilities.updateComponentTreeUI(button);
				add(button);
			}
		}

		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		// ---------------------------Fenster---------------------------

		setTitle("Game of Life");

		Dimension screen2 = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(new Dimension(screen2.width / 2, screen2.height / 2));
		this.setLocation(screen2.width / 2 - this.getSize().width / 2, screen2.height / 2 - this.getSize().height / 2);

		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == neu) {
			try{
				JFrame tempWindow;
				tempWindow = new ChangeSizeMask();
				tempWindow.setVisible(true);
			}catch(Exception ex){
				
				JOptionPane.showMessageDialog(
						null,
						"Fehler beim Erstellen eines neuen Games of Live Instanz",
						"Fehler", JOptionPane.CANCEL_OPTION);
			}
		}
	}

}
