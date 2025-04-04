import materials.Weather;
import store.User;

public class weatherRunner {
    public static void main(String[] args) {
        User user = new User();
        user.weatherCheck(null);

        Weather weather = new Weather();
        user.weatherCheck(weather);
    }
}
