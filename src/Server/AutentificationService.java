package Server;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class AutentificationService {

    private static final Set<Entry> entries = Set.of(
            new Entry("User1", "l1", "p1"),
            new Entry("User2", "l2", "p2"),
            new Entry("User3", "l3", "p3")
    );

    public Optional<Entry> findEntryByCredentials(String login, String password) {
        return entries.stream().filter(entry -> entry.getLogin().equals(login) && entry.getPassword().equals(password)).findFirst();
    }

    public static class Entry {
        public String name;
        public String login;
        public String password;

        public Entry(String name, String login, String password) {
            this.name = name;
            this.login = login;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }
    }
}
