public class Text {
    private String text;
    private String category;

    public Text(String text, String category) {
        this.text = text;
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
