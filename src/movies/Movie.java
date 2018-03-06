package movies;

public class Movie {
    private String title;

    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public static void getGenre (String genre) {
        System.out.println("=========================================");
        for (Movie movie : MoviesArray.findAll()) {

            if (movie.getGenre().equalsIgnoreCase(genre)) {
                System.out.printf("|" + "%-10s", movie.getTitle() + " -- " + movie.getGenre() + "\n");
                System.out.println("=========================================");
            }
        }
    }
}

