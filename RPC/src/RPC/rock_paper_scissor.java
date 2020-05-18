package RPC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.applet.*;

	
public class rock_paper_scissor extends Applet implements ActionListener {

	private static final long serialVersionUID = 1L;
	   Button rock, paper, scissor; // creating Buttons
	   Label Result, C_choice, U_choice, Gplayed, Gwon, Glose, Winper, Last_10r; // Creating Labels
	   Label result, c_choice, u_choice, gplayed, gwon, glose, winper, last_10r; // creating Labels
	   Image backGround; // Background Image
	   static int ggplayed = 0;   //to count games played
	   static int ggwon = 0;   //to count games won
	   static int gglose = 0;   //to counter games lost
	   static double wwinper = 0;   //to calc win percent
	   static String last_10[] = new String[5]; // array

	   public void init() {// initialize function
	       Font font1 = new Font("TimesRoman", Font.BOLD, 20);
	       Font font2 = new Font("TimesRoman", Font.ITALIC, 15);
	       

	       backGround = getImage(getDocumentBase(), "UM.jpg");

	       //created all the labels
	       rock = new Button("Rock");
	       paper = new Button("Paper");
	       scissor = new Button("Scissor");
	       result = new Label();
	       Result = new Label("Result");
	       c_choice = new Label();
	       C_choice = new Label("Computer Choice");
	       u_choice = new Label();
	       U_choice = new Label("Your Choice");
	       Gplayed = new Label("Games Played");
	       gplayed = new Label();
	       Gwon = new Label("Games Won");
	       gwon = new Label();
	       Glose = new Label("Games Lost");
	       glose = new Label();
	       Winper = new Label("Win Percentage");
	       winper = new Label();
	       Last_10r = new Label("Last 5 Results");
	       last_10r = new Label();

	       result.setFont(font1);
	       Result.setFont(font1);
	       c_choice.setFont(font1);
	       C_choice.setFont(font1);
	       u_choice.setFont(font1);
	       U_choice.setFont(font1);
	       rock.setFont(font1);
	       paper.setFont(font1);
	       scissor.setFont(font1);
	       Gplayed.setFont(font1);
	       gplayed.setFont(font1);
	       Gwon.setFont(font1);
	       gwon.setFont(font1);
	       Glose.setFont(font1);
	       glose.setFont(font1);
	       Winper.setFont(font1);
	       winper.setFont(font1);
	       Last_10r.setFont(font1);
	       last_10r.setFont(font2);

	       //setting coordinates labels and buttons
	       rock.setBounds(50, 100, 150, 40);
	       paper.setBounds(220, 100, 150, 40);
	       scissor.setBounds(390, 100, 150, 40);
	       C_choice.setBounds(50, 150, 175, 40);
	       c_choice.setBounds(280, 150, 150, 40);
	       U_choice.setBounds(50, 210, 130, 40);
	       u_choice.setBounds(280, 210, 150, 40);
	       Result.setBounds(50, 270, 75, 40);
	       result.setBounds(280, 270, 150, 40);
	       Gplayed.setBounds(50, 330, 150, 40);
	       gplayed.setBounds(280, 330, 150, 40);
	       Gwon.setBounds(50, 390, 150, 40);
	       gwon.setBounds(280, 390, 150, 40);
	       Glose.setBounds(50, 450, 150, 40);
	       glose.setBounds(280, 450, 150, 40);
	       Winper.setBounds(50, 510, 150, 40);
	       winper.setBounds(280, 510, 150, 40);
	       Last_10r.setBounds(50, 560, 150, 40);
	       last_10r.setBounds(280, 560, 200, 40);
	       
	       c_choice.setBackground(Color.blue);
	       u_choice.setBackground(Color.red);
	       result.setBackground(Color.black);
	       gplayed.setBackground(Color.black);
	       gwon.setBackground(Color.black);
	       glose.setBackground(Color.black);
	       winper.setBackground(Color.black);
	       last_10r.setBackground(Color.black);

	       Last_10r.setForeground(Color.black);
	       Winper.setForeground(Color.black);
	       Gwon.setForeground(Color.black);
	       Glose.setForeground(Color.black);
	       Gplayed.setForeground(Color.black);
	       rock.setForeground(Color.black);
	       paper.setForeground(Color.black);
	       scissor.setForeground(Color.black);
	       C_choice.setBackground(Color.blue);
	       U_choice.setBackground(Color.red);
	       Result.setBackground(Color.black);

	       //adding it to frame
	       add(rock);
	       add(paper);
	       add(scissor);
	       add(C_choice);
	       add(c_choice);
	       add(U_choice);
	       add(u_choice);
	       add(result);
	       add(Result);
	       add(Gplayed);
	       add(gplayed);
	       add(Gwon);
	       add(gwon);
	       add(Glose);
	       add(glose);
	       add(Winper);
	       add(winper);
	       add(Last_10r);
	       add(last_10r);

	       rock.addActionListener(this);
	       paper.addActionListener(this);
	       scissor.addActionListener(this);

	       setLayout(null);
	       setVisible(true);
	       setSize(1500, 844);
	   }

	   public void paint(Graphics g) {

	       g.drawImage(backGround, 0, 0, this);
	   }
	  
	   //computer makes a choice
	   int generate_ran() {
	       Random rand = new Random();
	       int a = rand.nextInt(3);
	       return a;
	   }
	   //checking the buttons pressed by the player
	   public void actionPerformed(ActionEvent e) {
	       int a, b = 0;
	       ggplayed++;
	       try {
	           gplayed.setText(Integer.toString(ggplayed));
	       } catch (Exception e1) {
	           System.out.println(e1);
	       }
	       if (e.getSource() == rock) {
	           b = 0;
	           u_choice.setText("Rock");

	       }
	       if (e.getSource() == paper) {
	           b = 1;
	           u_choice.setText("Paper");
	       }
	       if (e.getSource() == scissor) {
	           b = 2;
	           u_choice.setText("Scissor");
	       }

	       a = generate_ran();

	       if (a == 0) {
	           c_choice.setText("Rock");
	       }
	       if (a == 1) {
	           c_choice.setText("Paper");
	       }
	       if (a == 2) {
	           c_choice.setText("Scissor");
	       }

	       last_10[4] = last_10[3];
	       last_10[3] = last_10[2];
	       last_10[2] = last_10[1];
	       last_10[1] = last_10[0];
	       //calculating result
	       if (a == b) {
	           result.setText("There is a tie");
	           last_10[0] = "TIE";
	           result.setBackground(Color.black);
	       } else if (a == 0 && b == 2) {
	           result.setText("You Lose");
	           last_10[0] = "LOSE";
	           gglose++;
	           glose.setText(Integer.toString(gglose));
	           result.setBackground(Color.blue);
	       } else if (a == 0 && b == 1) {
	           result.setText("You Won");
	           last_10[0] = "WON";
	           ggwon++;
	           gwon.setText(Integer.toString(ggwon));
	           result.setBackground(Color.red);
	       } else if (a == 1 && b == 2) {
	           result.setText("You Won");
	           last_10[0] = "WON";
	           ggwon++;
	           gwon.setText(Integer.toString(ggwon));
	           result.setBackground(Color.red);
	       } else if (a == 1 && b == 0) {
	           result.setText("You Lose");
	           last_10[0] = "LOSE";
	           gglose++;
	           glose.setText(Integer.toString(gglose));
	           result.setBackground(Color.blue);
	       } else if (a == 2 && b == 1) {
	           result.setText("You Lose");
	           last_10[0] = "LOSE";
	           gglose++;
	           glose.setText(Integer.toString(gglose));
	           result.setBackground(Color.blue);
	       } else if (a == 2 && b == 0) {
	           result.setText("You Won");
	           last_10[0] = "WON";
	           ggwon++;
	           gwon.setText(Integer.toString(ggwon));
	           result.setBackground(Color.red);
	       }

	       wwinper = (ggwon * 100) / ggplayed;
	       winper.setText(Double.toString(wwinper) + "%");
	       last_10r.setText(
	               (last_10[0] + " " + last_10[1] + " " + last_10[2] + " " + last_10[3] + " " + last_10[4] + " "));
	   }

	}

