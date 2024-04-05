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

 // Reply에다가 replies배열을 넣어서 쓰는 것이 아닌 여기다 setter넣고(자동생성하나, reply만 받는 setter하나)
 // Main에서 메소드를 만들어서 작성하는 것임
    public static void setReplies(List<Reply> replies) {
     FreeBoard.replies = replies;
    }

    public static void setReplies(Reply reply) {
        replies.add(reply);
    }

    public static void main(String[] args) {
        System.out.println(replies.size());
    }
}
