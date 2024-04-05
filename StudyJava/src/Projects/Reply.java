package Projects;

import java.util.ArrayList;
import java.util.List;

public class Reply {

    String id;
    String content;
    String logInId;



    public Reply() {
    }

    public Reply(String id, String content, String logInId) {
        this.id = id;
        this.content = content;
        this.logInId = logInId;
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

}
