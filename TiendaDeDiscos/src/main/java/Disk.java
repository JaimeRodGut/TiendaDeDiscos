import java.util.HashSet;
import java.util.Objects;

public class Disk {
    private String title;
    private String artist;
    private HashSet<String> genres;

    public Disk(String title, String artist, HashSet<String> genres) {
        this.title = title;
        this.artist = artist;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public HashSet<String> getGenres() {
        return genres;
    }

    public void setGenres(HashSet<String> genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disk disk = (Disk) o;
        return Objects.equals(title, disk.title) && Objects.equals(artist, disk.artist) && Objects.equals(genres, disk.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, genres);
    }

    @Override
    public String toString() {
        return "Disk{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genres=" + genres +
                '}';
    }
}
