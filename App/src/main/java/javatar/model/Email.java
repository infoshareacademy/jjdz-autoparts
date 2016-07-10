package javatar.model;

public class Email {
    private String sender;
    private String receiver;
    private String title;
    private String body;

    public Email(String sender, String receiver, String title, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.title = title;
        this.body = body;
    }

    public Email() {
    }

    public void setAllData(String sender, String receiver, String title, String body) {
        setSender(sender);
        setReceiver(receiver);
        setTitle(title);
        setBody(body);
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
