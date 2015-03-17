import javax.swing.JOptionPane;

public class Week8_1 {
public static void main(String[] args) {
	
     //Declaring variables
	String people, player;
    int Numpeople, Numplayers, groupsize1, groupsize2;

people = JOptionPane.showInputDialog(" plz Enter number of people: ");
player = JOptionPane.showInputDialog(" plz Enter number of players: ");
Numpeople = Integer.parseInt(people);
Numplayers = Integer.parseInt(player);
groupsize1 = Numpeople/2;
groupsize2 = Numpeople/3;

if(Numpeople>10){
JOptionPane.showMessageDialog(null,"Number of people :" + Numpeople + "\nGroupsize: " + groupsize1 );		
}
else if(Numpeople>3){
JOptionPane.showMessageDialog(null, "Number of people :" + Numpeople + "\nGroupsize: " + groupsize2 );
}
else{
JOptionPane.showMessageDialog(null,"The number of people has to be at least 3");
}
if(Numplayers>=11 && Numplayers<=55){
JOptionPane.showMessageDialog(null,"The number of players: "+ Numplayers + "\nTeam size: " + Numplayers/11);
}
else{
JOptionPane.showMessageDialog(null, "The number of players: "+ Numplayers +"\nTeam size: 1");
}	
}
}