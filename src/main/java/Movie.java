import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Movie {
    private int id;
    private String movieTitle;
    private String genre;

    public Movie(int id, String movieTitle, String genre) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.genre = genre;
    }
}





