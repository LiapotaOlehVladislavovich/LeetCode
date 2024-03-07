package first_bad_version_278;

public class VersionControl {
    private final int bad;

    public VersionControl(int bad) {
        this.bad = bad;
    }

    protected boolean isBadVersion(int version) {
        return version >= bad;
    }
}
