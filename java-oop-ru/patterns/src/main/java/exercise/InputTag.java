package exercise;

import java.util.List;

// BEGIN
class InputTag implements TagInterface{
    private String type;
    private String value;
    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public InputTag() {
    }
    @Override
    public String render() {
        return "<input type=\"" + type + "\" " + "value=\"" + value  + "\">";
    }
}
// END
