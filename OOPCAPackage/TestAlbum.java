package OOPCAPackage;

import javax.swing.*;
import java.awt.*;

public class TestAlbum {
    public static void main(String[] args) {

        JTextArea textArea =new JTextArea();
        Font newFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(newFont);

        //Create tracks Array
        Song[] tracks= new Song[5];

        //Create 5 song objects
        Song song1 = new Song("Sugar Baby Love","Rubettes","Pop",136,1977);
        Song song2 = new Song("Living on a Prayer","Bon Jovi","Rock",184,1985);
        Song song3 = new Song("Blue Suede Shoes","Elvis Presley","Pop",157,1963);
        Song song4 = new Song("Someone Like You","Adele","Pop",223,2013);
        Song song5 = new Song("House of Fun","Madness","Pop",178,1984);

        //adding songs to tracks array
        tracks[0]=song1;
        tracks[1]=song2;
        tracks[2]=song3;
        tracks[3]=song4;
        tracks[4]=song5;

        //Creating an Album
        Album newAlbum = new Album("Now that’s what I call music 98",tracks, "Universal Music", 2016);

        //Adding Album to the textArea
        textArea.setText(newAlbum.toString());

        JOptionPane.showMessageDialog(null,textArea,"Album Information",JOptionPane.INFORMATION_MESSAGE);

        String userInput= JOptionPane.showInputDialog("Which track number would you like to play?");

        newAlbum.playTrack(Integer.parseInt(userInput));

        System.exit(0);
    }
}
