package task.enozom.gmailcomposer.pojos;

/**
 * Created by Mayada on 8/7/2018.
 */

public class MessagePojo {

    private String messageSubject;
    private String messageContent;
    private String attachmentUrl;

    public MessagePojo(String messageSubject,String messageContent, String attachmentUrl){
        this.messageSubject= messageSubject;
        this.messageContent = messageContent;
        this.attachmentUrl= attachmentUrl;
    }



    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }
}
