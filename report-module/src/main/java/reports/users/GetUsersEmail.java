package reports.users;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ejb.Stateless;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

@Stateless
public class GetUsersEmail {

    private final String userURL = "http://jboss:8080/jjdz-autoparts/api/users/reports";

    public ArrayList<User> getEmails() throws IOException {
        String usersJSON = httpGet(userURL);
        return getUsers(usersJSON);

    }

    private String httpGet(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn =
                (HttpURLConnection) url.openConnection();

        if (conn.getResponseCode() != 200) {
            throw new IOException(conn.getResponseMessage());
        }

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();

        conn.disconnect();
        return sb.toString();
    }

    private ArrayList<User> getUsers(String jsonArray) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        ArrayList<User> users = mapper.readValue(jsonArray, new TypeReference<ArrayList<User>>() {
        });

        return users;
    }



}
