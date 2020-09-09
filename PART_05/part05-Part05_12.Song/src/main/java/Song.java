
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    /*public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Song song) {
        if (this == song) {
            return true;
        }

        if (!(song instanceof Song)) {
            return false;
        }
        Song test = (Song) song;
        if (this.artist.equals(test.artist) && this.name.equals(test.name) && this.durationInSeconds == test.durationInSeconds) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + String.valueOf(this.durationInSeconds) + "s)";
    }*/
    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compared;

        if (this.artist.equals(comparedSong.artist)
                && this.name == comparedSong.name
                && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
