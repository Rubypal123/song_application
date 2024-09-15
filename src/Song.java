public class Song {

    private String title;
    private double songDuration;

    public Song(String title , double duration) {
        this.title = title;
        this.songDuration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(double songDuration) {
        this.songDuration = songDuration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", songDuration=" + songDuration +
                '}';
    }
}
