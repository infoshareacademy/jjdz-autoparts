package javatar.service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.*;
import java.io.*;

public class HtmlReader {
    private static final Logger LOGGER = LogManager.getLogger();
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

