package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag {
    private Map<String, String> singleTag;
    private String k;
    private String v;
    public String doAttributes(Tag tag, Map singleTag) {
        return "<" + tag + " class=" + singleTag + " id=" + singleTag + ">";
    }
}
// END
