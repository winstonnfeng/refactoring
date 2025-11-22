package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private final String playID;
    private final int audience;

    public Performance(final String playID, final int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    public final String getPlayID() {
        return this.playID;
    }

    public final int getAudience() {
        return this.audience;
    }
}
