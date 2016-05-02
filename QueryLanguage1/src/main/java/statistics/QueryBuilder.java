package statistics;

import java.util.ArrayList;
import java.util.List;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.PlaysIn;

public class QueryBuilder implements Matcher {

    private Matcher matcher;
    private PlaysIn playsin;
    private HasAtLeast hasAtLeast;
    private HasFewerThan hasFewerThan;
    private List<Matcher> matchers;

    public QueryBuilder playsIn(String a) {
        this.playsin = new PlaysIn(a);
        return this;
    }

    public QueryBuilder hasAtLeast(int a, String b) {
        this.hasAtLeast = new HasAtLeast(a, b);
        return this;
    }

    public QueryBuilder hasFewerThan(int a, String b) {
        this.hasFewerThan = new HasFewerThan(a, b);
        return this;

    }

    public Matcher build() {
        matchers = new ArrayList<Matcher>();
        matchers.add(this.hasAtLeast);
        matchers.add(this.hasFewerThan);
        matchers.add(this.playsin);
        return this;

    }

    @Override
    public boolean matches(Player p) {

        for (Matcher matcher1 : matchers) {
            if (!matcher1.matches(p)) {
                return false;
            }
        }
        return true;
    }

}
