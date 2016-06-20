package javatar.model;

import java.util.HashMap;

public class AdminEmail {

    private static HashMap<String, Integer> emails = new HashMap<String, Integer>() {{
        put("danielkepczynski@gmail.com", 1);
        put("anetatruszczynska@wp.pl", 1);
        put("michal.cymerys@gmail.com", 1);
    }};

    public static int getIsAdmin(String email){
        return emails.containsKey(email) ? 1 : 0;
    }


}
