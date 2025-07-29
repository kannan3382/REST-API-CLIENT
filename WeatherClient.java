import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class WeatherClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String city = scanner.nextLine().trim();
        scanner.close();

        String apiKey = "554074de233b0bcc1dea24fa1596d004";

        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" 
                         + city + "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int status = conn.getResponseCode();

            if (status == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JSONObject json = new JSONObject(response.toString());
                JSONObject main = json.getJSONObject("main");
                JSONObject weather = json.getJSONArray("weather").getJSONObject(0);

                System.out.println("\nWeather Data for " + city.toUpperCase());
                System.out.println("Temperature: " + main.getDouble("temp") + " °C");
                System.out.println("Humidity: " + main.getInt("humidity") + " %");
                System.out.println("Condition: " + weather.getString("description"));
            } else {
                System.out.println("Error: Unable to fetch data. HTTP Status Code: " + status);
            }

            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
