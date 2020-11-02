package OOPCAPackage;

public class Song {
    private static int trackID=0;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song(String title,String artist,String genre,int duration,int releaseYear)
    {
        this.title=title;
        this.artist=artist;
        this.genre=genre;
        this.duration=duration;
        this.releaseYear=releaseYear;
        setTrackNumber(trackNumber);
    }

    private void setTrackNumber(int trackNumber) {
        trackID++;
        this.trackNumber = trackID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "\n\n" + String.format("%-22s%-30s%-15s",getTrackNumber(),getTitle(),getArtist());
    }
}
