package NumberGuessingGame;

import java.awt. *;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class NumberGuessingGame extends Frame implements ActionListener
{
	Label l1, l2, l3;
	Button b1, b2;
	Frame f;
	TextField tf1;
	TextArea ta1;
	
	NumberGuessingGame()
	{
		setSize(800, 800);
		setVisible(true);
		setLayout(null);
		setBackground(Color.PINK);
		
		Font f1 = new Font("ALGERIAN", Font.BOLD, 40);
		Font f2 = new Font("Callibri", Font.PLAIN, 30);

		l1 = new Label("Number Guessing Game");
		l1.setBounds(200, 250, 480, 50);
		l1.setBackground(Color.BLACK);
		l1.setForeground(Color.PINK);
		l1.setFont(f1);
		add(l1);

		b1 = new Button("Start the game");
		b1.setBounds(280, 400, 200, 40);
		b1.setFont(f2);
		b1.setBackground(Color.CYAN);
		add(b1);
		b1.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			f = new Frame("Anuja");
			f.setLayout(null);
			f.setBounds(100, 100, 600, 600);
			f.setSize(600, 600);
			f.setVisible(true);

			l2 = new Label("Enter the number to guess : ");
			l2.setFont(new Font("ALGERIAN", Font.BOLD, 30));
			l2.setBounds(100, 100, 400, 40);
			f.add(l2);

			tf1 = new TextField();
			tf1.setBounds(100, 160, 200, 40);
			tf1.setFont(new Font("Callibri", Font.PLAIN, 30));
			f.add(tf1);

			b2 = new Button("Check");
			b2.setFont(new Font("Callibri", Font.PLAIN, 30));
			b2.setBounds(100, 240, 100, 40);
			f.add(b2);
			b2.addActionListener(this);
			
			ta1 = new TextArea();
			ta1.setBounds(100, 300, 100, 100);
			ta1.setFont(new Font("Callibri", Font.PLAIN, 30));
			f.add(ta1);

			l3 = new Label("Game in process");
			l3.setBounds(330, 160, 200, 40);
			l3.setFont(new Font("Callibri", Font.PLAIN, 20));
			f.add(l3);

			add(f);
		}
			
		if(ae.getSource()==b2)
		{	
			PlayGame();
		}

	}
	
	Random rand = new Random();
	int numberToGuess = rand.nextInt(100) + 1;
	int numberOfGuesses = 0;
	int guess;
	boolean win = false;

	void PlayGame()
	{	
		try
		{
			while(guess!=numberToGuess)	
			{	
				//System.out.println("");
				guess = Integer.parseInt(tf1.getText());
				numberOfGuesses++;
				if(guess == numberToGuess)
				{
					JOptionPane.showMessageDialog(this, "Congratulations, You guessed this number !!");
					l3.setText("You guessed the number !!");
					win = true;
					ta1.setText(""+guess);
					reset();
					dispose();
					f.dispose();
				}
				else if(guess < numberToGuess)
				{
					l3.setText("Too Low, try again !!");
					ta1.setText(""+guess);
					win=false;
					reset();
				}
				else
				{
					l3.setText("Too High, try again !!");
					ta1.setText(""+guess);
					win=false;
					reset();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	void reset()
	{
		tf1.setText("");
	}

	public static void main(String args[])
	{
		NumberGuessingGame n = new NumberGuessingGame();
	}
}
