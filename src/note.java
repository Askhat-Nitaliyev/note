import java.time.Instant;

public class note {
    private final String name;

    private String text;

    private final String author;

    private final Instant create;

    private Instant updateDate;

    public note(String name, String text) {
        this.name = name;
        this.text = text;
        author = null;
        create = Instant.now();
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public Instant getCreate() {
        return create;
    }

    public Instant getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
    }
}
