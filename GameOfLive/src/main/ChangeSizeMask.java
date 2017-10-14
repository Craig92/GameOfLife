package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeSizeMask extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private int row = 10;
	private int col = 10;

	private JButton erstellen = null;
	private JButton abbrechen = null;

	ChangeSizeMask() {

		setTitle("Erstellung Game of Live");
		setLayout(new BorderLayout());

		JPanel itemsPanel = new JPanel();
		itemsPanel.setLayout(new GridLayout(4, 2));

		itemsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		JLabel breiteLabel = new JLabel("Breite ");
		JTextField breiteTextfield = new JTextField("10");
		JLabel hoeheLabel = new JLabel("Höhe ");
		JTextField hoeheTextfield = new JTextField("10");
		itemsPanel.add(breiteLabel);
		itemsPanel.add(breiteTextfield);
		itemsPanel.add(hoeheLabel);
		itemsPanel.add(hoeheTextfield);

		erstellen = new JButton("Erstellen");
		erstellen.addActionListener(this);
		abbrechen = new JButton("Abbrechen");
		abbrechen.addActionListener(this);
		itemsPanel.add(erstellen);
		itemsPanel.add(abbrechen);
		
		Dimension screen2 = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(new Dimension(screen2.width / 2, screen2.height / 2));
		this.setLocation(screen2.width / 2 - this.getSize().width / 2, screen2.height / 2 - this.getSize().height / 2);

		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		add(itemsPanel);
	}

	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == erstellen) {
			Spielbrett spielbrett = new Spielbrett(row, col);

		} else if (e.getSource() == abbrechen) {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}

}
