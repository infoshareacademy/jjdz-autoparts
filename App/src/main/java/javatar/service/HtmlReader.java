package javatar.service;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HtmlReader {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(HtmlReader.class);
        public String getText(String url) throws IOException {
            LOGGER.info("Input url: {}",url);
            URL website = new URL(url);
            URLConnection connection = website.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            connection.getInputStream()));

            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null)
                response.append(inputLine);

            in.close();
            LOGGER.info("Response has length: {}",response.length());
            return response.toString();
        }

    }

