package exercise;

import java.util.List;

// BEGIN
class LabelTag implements TagInterface {
    private String value;
    private TagInterface tag;
    public LabelTag(String value, TagInterface tag1) {
        this.value = value;
        this.tag = tag1;
    }
    @Override
    public String render() {
        return "<label>" + value + tag.render() + "</label>";
    }
}
// END
