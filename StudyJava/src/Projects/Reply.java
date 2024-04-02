package Projects;

import java.util.ArrayList;

public class Reply {

    String id;
    String content;
    String logIn;
    FreeBoard title;
    FreeBoard replies;

    public Reply() {
    }

    public Reply(String id, String content, String logIn, FreeBoard title) {
        this.id = id;
        this.content = content;
        this.logIn = logIn;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLogIn() {
        return logIn;
    }

    public void setLogIn(String logIn) {
        this.logIn = logIn;
    }

    public FreeBoard getTitle() {
        return title;
    }

    public void setTitle(FreeBoard title) {
        this.title = title;
    }

    public void setReplies(FreeBoard replies) {
        this.replies = replies;
    }
}
