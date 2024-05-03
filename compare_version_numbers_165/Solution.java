package compare_version_numbers_165;

public class Solution {
    /**
     * Method gets two versions which consist of one or more revisions joined by a dot '.'.
     * Methods compares two versions by comparing their revisions in left-to-right order.
     *
     * @param version1 first version number as string
     * @param version2 second version number as string
     * @return -1 if version1 < version2
     *         1 if version1 > version2
     *         0 if version1 = version2
     * */
    public int compareVersion(String version1, String version2) {
        //split versions into arrays where each cell represents revision
        String[] version1AsRevisions = version1.split("\\.");
        String[] version2AsRevisions = version2.split("\\.");
        // set index of revision
        int index = 0;

        // while exists revision of same level in each version
        while (index < version1AsRevisions.length && index < version2AsRevisions.length) {
            // if revision of first version is bigger
            if (Integer.parseInt(version1AsRevisions[index]) < Integer.parseInt(version2AsRevisions[index])) {
                // return -1, to represent that all version is bigger
                return -1;
            // if revision of second version is bigger
            } else if (Integer.parseInt(version1AsRevisions[index]) > Integer.parseInt(version2AsRevisions[index])) {
                // return 1, to represent that all version is bigger
                return 1;
            } else {
                // increment index because revisions are the same
                index++;
            }
        }

        // while obviously exists revisions of first version
        while (index < version1AsRevisions.length) {
            // if revision is bigger than 0
            if (Integer.parseInt(version1AsRevisions[index]) > 0) {
                // return 1, to represent that all version is bigger
                return 1;
            } else {
                // increment index because revisions are the same
                index++;
            }
        }

        // while obviously exists revisions of second version
        while (index < version2AsRevisions.length) {
            // if revision is bigger than 0
            if (Integer.parseInt(version2AsRevisions[index]) > 0) {
                // return -1, to represent that all version is bigger
                return -1;
            } else {
                // increment index because revisions are the same
                index++;
            }
        }

        // return 0, to represent that versions are the same
        return 0;
    }
}