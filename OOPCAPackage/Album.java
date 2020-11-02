package OOPCAPackage;

import javax.swing.*;
import java.util.Arrays;

public class Album {
    private String name;
    private Song tracks[];
    private String producer;
    private int releaseYear;

    public Album(String name,Song[] tracks,String producer,int releaseYear)
    {
        this.name =name;
        this.tracks=tracks;
        this.producer=producer;
        this.releaseYear=releaseYear;
    }

    public void setName(String name) {
        if(name =="" || name==null)
        {
            this.name="No name specified";
        }
        else
        {
            this.name = name;
        }
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public Song[] getTracks() {
        return tracks;
    }

    public String getProducer() {
        return producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getNumberOfTracks()
    {
        int counter=0;
        for(int i=0;i<tracks.length;i++)
        {
            if (tracks[i] != null)
            {
                counter++;
            }
        }

        return counter;
    }

    public int getPlayingTime()
    {
        int totalDuration=878;
        for(int i=0;i<tracks.length;i++)
        {
            if (tracks[i] != null)
            {
                //totalDuration = Song.getDuration();
            }
        }

        return totalDuration;

    }

    public void playTrack(int userInput)
    {
        int i;
        for(i=0;i<tracks.length;i++)
        {
            if(tracks[i] != null)
            {
                if(i == (userInput-1))
                {
                    break;
                }
            }
        }

        if(i == (userInput-1))
        {
            JOptionPane.showMessageDialog(null,"Now playing track - details are as follows:" +
                    tracks[i],"Playing Track",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"An Invalid track number was supplied!","Bad Track Number",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void shuffle()
    {
        
    }

    @Override
    public String toString() {
        String tracksOutputList="";

        for(int i=0;i< tracks.length;i++)
        {
            if(tracks[i] != null)
            {
                tracksOutputList+=tracks[i];
            }
        }
        return "Name: " + getName() +
                "\n\nProducer: " + getProducer() +
                "\n\nRelease Year: " + getReleaseYear() +
                "\n\nNumber of Tracks: " + getNumberOfTracks() +
                "\n\nTotal Playing Time: " + getPlayingTime() + "\n\n" +
                String.format("%32s%-24s%-30s%-15s","Album Tracks","\n\nTrack Number","Title","Artist") +tracksOutputList;

    }
}
