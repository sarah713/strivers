
package Arrays;

import java.util.HashSet;

public class UniqueEmail {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> unique = new HashSet<>();
        for (String email : emails) {
            int split_position = email.indexOf("@");
            String local_name = email.substring(0, split_position);
            String domain_name = email.substring(split_position);

            if (local_name.contains("+")) {
                int plus_position = local_name.indexOf("+");
                local_name = local_name.substring(0, plus_position);
            }
            local_name.replaceAll("\\.", "");
            String new_email = local_name + domain_name;
            unique.add(new_email);

        }
        return unique.size();
    }
}
