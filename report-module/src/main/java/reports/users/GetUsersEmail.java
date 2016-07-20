package reports.users;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

@Stateless
public class GetUsersEmail {

    private static final String userURL = "http://localhost:8080/jjdz-autoparts/api/users/reports";

    public String getEmails() throws IOException {
        String usersJSON = httpGet("http://localhost:8080/jjdz-autoparts/api/users/reports");
        ArrayList<User> users = getUsers(usersJSON);
        return getEmailsFromUsers(users);
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

    private String getEmailsFromUsers(ArrayList<User> users) {
        String emails = "";
        for (User user : users) {
            emails += user.geteMail() + ";";
        }
        return emails.substring(emails.length() - 1).equals(";") ? emails.substring(0, emails.length() - 1) : emails;

    }

}
