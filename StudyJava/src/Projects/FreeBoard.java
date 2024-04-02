package Projects;

import java.util.ArrayList;
import java.util.List;

public class FreeBoard {
    String id;
    String title;
    String content;
    String loginId;

    List<Reply> replies = new ArrayList<>();

    public FreeBoard() {
    }

    public FreeBoard(String id, String title, String content, String loginId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.loginId = loginId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
}
