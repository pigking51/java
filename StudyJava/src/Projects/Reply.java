package Projects;

import java.util.ArrayList;

public class Reply {

    String id;
    String content;
    String logInId;
    FreeBoard title;
    FreeBoard replies;

    public Reply() {
    }

    public Reply(String id, String content, String logInId, FreeBoard title) {
        this.id = id;
        this.content = content;
        this.logInId = logInId;
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

    public String getLogInId() {
        return logInId;
    }

    public void setLogInId(String logInId) {
        this.logInId = logInId;
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
