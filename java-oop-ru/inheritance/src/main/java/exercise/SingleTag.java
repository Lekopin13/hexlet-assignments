package exercise;

import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
class SingleTag extends Tag {
    private Map<String, String> singleTag;
    private String k;
    private String v;
    public String doAttributes(Tag tag, Map singleTag) {
        return "<" + tag + " class=" + singleTag + " id=" + singleTag + ">";
    }



}
// END
