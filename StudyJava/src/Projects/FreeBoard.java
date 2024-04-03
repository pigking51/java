package Projects;

import java.util.ArrayList;
import java.util.List;

public class FreeBoard {
    String id;
    FreeBoardTitle title;
    String content;
    String loginId;

    static List<Reply> replies = new ArrayList<>();



    public FreeBoard() {

    }

    public FreeBoard(String id, FreeBoardTitle title, String content, String loginId) {
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

    public FreeBoardTitle getTitle() {
        return title;
    }

    public void setTitle(FreeBoardTitle title) {
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



    public static void main(String[] args) {
        System.out.println(replies.size());
    }
}
