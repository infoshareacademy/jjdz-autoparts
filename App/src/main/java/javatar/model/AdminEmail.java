package javatar.model;

import java.util.HashSet;

public class AdminEmail {

    private static HashSet<String> emails = new HashSet<String>() {{
        add("danielkepczynski@gmail.com");
        add("anetatruszczynska@wp.pl");
        add("michal.cymerys@gmail.com");
    }};

    public static int getIsAdmin(String email){
        return emails.contains(email) ? 1 : 0;
    }


}
