import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class App {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://httpbin.org/json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            JsonObject json = JsonParser.parseReader(new InputStreamReader(conn.getInputStream())).getAsJsonObject();
            JsonObject slideshow = json.getAsJsonObject("slideshow");
            String title = slideshow.get("title").getAsString();

            System.out.println("The title is " + title);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


