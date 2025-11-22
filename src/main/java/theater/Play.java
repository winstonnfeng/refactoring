package theater;

/**
 * Represents a theatrical play with a name and type.
 */

public class Play {

    private final String name;
    private final String type;

    public Play(final String name, final String type) {
        this.name = name;
        this.type = type;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }
}
