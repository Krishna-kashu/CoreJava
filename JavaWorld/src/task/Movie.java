package task;

public class Movie {
    String language;
    double duration;

    public Movie(String language, double duration){
        this.language=language;
        this.duration=duration;
    }
    public void display(){
        System.out.println("Movie language: "+language);
        System.out.println("Movie duration: "+duration);
    }
}
