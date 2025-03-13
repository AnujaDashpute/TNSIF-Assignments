package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TicTacToe extends Frame implements ActionListener
{
	Label l1, l2;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	Panel p;
	String s;
	Button btn;
	Font f3;
	TicTacToe()
	{
		s = "X";
		setLayout(null);

		Font f1 = new Font("ALGERIAN", Font.BOLD, 40);
		Font f2 = new Font("Arial", Font.BOLD, 40);
		f3 = new Font("Arial", Font.PLAIN, 25);
		l1 = new Label("Tic Tac Toe ");
		l1.setBounds(220, 50, 250, 50);
		l1.setFont(f1);
		l1.setForeground(Color.BLUE);
		add(l1);

		p = new Panel();
		p.setLayout(new GridLayout(3, 3, 20, 20));
		p.setBounds(100, 120, 400, 400);
		p.setFont(f2);
		p.setForeground(Color.BLACK);

		b1 = new Button();
		b2 =new Button();
		b3 = new Button();
		b4 = new Button();
		b5 = new Button();
		b6 = new Button();
		b7 = new Button();
		b8 = new Button();
		b9 = new Button();
		b10 = new Button("End Game");
		l2 = new Label("No more chances ! Quit the game!!");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		add(p);

		btn = new Button();
		btn.setBounds(220, 550, 200, 40);
		btn.setFont(f3);
		btn.setBackground(Color.CYAN);
		add(btn);
	}
	
	public void CheckPair()
	{
		if(b1.getLabel()=="X" && b2.getLabel()=="X" && b3.getLabel()=="X")
		{
			btn.setLabel("Player X Wins ");
			JOptionPane.showMessageDialog(this, "Player X Won");
			dispose();
		}
		else if(b4.getLabel()=="X" && b5.getLabel()=="X" && b6.getLabel()=="X")
		{
			btn.setLabel("Player X Wins ");
			JOptionPane.showMessageDialog(this, "Player X Won");
			dispose();
		}
		else if(b7.getLabel()=="X" && b8.getLabel()=="X" && b9.getLabel()=="X")
		{
			btn.setLabel("Player X Wins ");
			JOptionPane.showMessageDialog(this, "Player X Won");
			dispose();
		}
		else if(b1.getLabel()=="X" && b4.getLabel()=="X" && b7.getLabel()=="X")
		{
			btn.setLabel("Player X Wins ");
			JOptionPane.showMessageDialog(this, "Player X Won");
			dispose();
		}
		else if(b2.getLabel()=="X" && b5.getLabel()=="X" && b8.getLabel()=="X")
		{
			btn.setLabel("Player X Wins ");
			JOptionPane.showMessageDialog(this, "Player X Won");
			dispose();
		}
		else if(b3.getLabel()=="X" && b6.getLabel()=="X" && b9.getLabel()=="X")
		{
			btn.setLabel("Player X Wins ");
			JOptionPane.showMessageDialog(this, "Player X Won");
			dispose();
		}
		else if(b1.getLabel()=="X" && b5.getLabel()=="X" && b9.getLabel()=="X")
		{
			btn.setLabel("Player X Wins ");
			JOptionPane.showMessageDialog(this, "Player X Won");
			dispose();
		}
		else if(b3.getLabel()=="X" && b5.getLabel()=="X" && b7.getLabel()=="X")
		{
			btn.setLabel("Player X Wins ");
			JOptionPane.showMessageDialog(this, "Player X Won");
			dispose();
		}

		else if(b1.getLabel()=="O" && b2.getLabel()=="O" && b3.getLabel()=="O")
		{
			btn.setLabel("Player O Wins ");
			JOptionPane.showMessageDialog(this, "Player O Won");
			dispose();
		}
		else if(b4.getLabel()=="O" && b5.getLabel()=="O" && b6.getLabel()=="O")
		{
			btn.setLabel("Player O Wins ");
			JOptionPane.showMessageDialog(this, "Player O Won");
			dispose();
		}
		else if(b7.getLabel()=="O" && b8.getLabel()=="O" && b9.getLabel()=="O")
		{
			btn.setLabel("Player O Wins ");
			JOptionPane.showMessageDialog(this, "Player O Won");
			dispose();
		}
		else if(b1.getLabel()=="O" && b4.getLabel()=="O" && b7.getLabel()=="O")
		{
			btn.setLabel("Player O Wins ");
			JOptionPane.showMessageDialog(this, "Player O Won");
			dispose();
		}
		else if(b2.getLabel()=="O" && b5.getLabel()=="O" && b8.getLabel()=="O")
		{
			btn.setLabel("Player O Wins ");
			JOptionPane.showMessageDialog(this, "Player O Won");
			dispose();
		}
		else if(b3.getLabel()=="O" && b6.getLabel()=="O" && b9.getLabel()=="O")
		{
			btn.setLabel("Player O Wins ");
			JOptionPane.showMessageDialog(this, "Player O Won");
			dispose();
		}
		else if(b1.getLabel()=="O" && b5.getLabel()=="O" && b9.getLabel()=="O")
		{
			btn.setLabel("Player O Wins ");
			JOptionPane.showMessageDialog(this, "Player O Won");
			dispose();
		}
		else if(b3.getLabel()=="O" && b5.getLabel()=="O" && b7.getLabel()=="O")
		{
			btn.setLabel("Player O Wins ");
			JOptionPane.showMessageDialog(this, "Player O Won");
			dispose();
		}
		else if((b1.getLabel()=="O" || b1.getLabel()=="X") && (b2.getLabel()=="O"
				|| b2.getLabel()=="X") && (b3.getLabel()=="O" || b3.getLabel()=="X") 
				&& (b4.getLabel()=="O" || b4.getLabel()=="X") && (b5.getLabel()=="O"
				|| b5.getLabel()=="X") && (b6.getLabel()=="O" || b6.getLabel()=="X")
				&& (b7.getLabel()=="O" || b7.getLabel()=="X") && (b8.getLabel()=="O"
				|| b8.getLabel()=="X") && (b9.getLabel()=="O" || b9.getLabel()=="X"))
		{
			b10.setBounds(610, 650, 200, 40);
			l2.setBounds(100, 650, 500, 40);
			add(b10);
			add(l2);
			l2.setFont(f3);
			b10.setFont(f3);
			b10.setBackground(Color.CYAN);

			b10.addActionListener(this);
			
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			b1.setLabel(s);
			b1.setEnabled(false);
		}
		if(ae.getSource()==b2)
		{
			b2.setLabel(s);
			b2.setEnabled(false);
		}
		if(ae.getSource()==b3)
		{
			b3.setLabel(s);
			b3.setEnabled(false);
		}
		if(ae.getSource()==b4)
		{
			b4.setLabel(s);
			b4.setEnabled(false);
		}
		if(ae.getSource()==b5)
		{
			b5.setLabel(s);
			b5.setEnabled(false);
		}
		if(ae.getSource()==b6)
		{
			b6.setLabel(s);
			b6.setEnabled(false);
		}
		if(ae.getSource()==b7)
		{
			b7.setLabel(s);
			b7.setEnabled(false);
		}
		if(ae.getSource()==b8)
		{
			b8.setLabel(s);
			b8.setEnabled(false);
		}
		if(ae.getSource()==b9)
		{
			b9.setLabel(s);
			b9.setEnabled(false);
		}
		CheckPair();

		if(s.equals("X"))
		{
			s = "O";
			btn.setLabel("O Turn");
		}
		else
		{
			s = "X";
			btn.setLabel("X Turn");
		}
		
		if(ae.getSource()==b10)
		{
			dispose();
		}
	}

	public static void main(String args[])
	{
		TicTacToe t = new TicTacToe(); 
		t.setSize(900, 900);
		t.setVisible(true);
		
	}
}
