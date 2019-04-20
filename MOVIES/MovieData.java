
public class MovieData {
    String movie_name, actor, director;
    double box_office;

    public MovieData(String movie_name, String actor, String director, double box_office) {
        this.movie_name = movie_name;
        this.actor = actor;
        this.director = director;
        this.box_office = box_office;
    }

    public String getM_name() {
        return movie_name;
    }

    public void setM_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getBox_office() {
        return box_office;
    }

    public void setBox_office(double box_office) {
        this.box_office = box_office;
    }
    
}
