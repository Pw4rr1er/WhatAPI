package api.inbox.conversation;


/**
 * The Class Messages.
 * 
 * @author Gwindow
 */
public class Messages {

	/** The body. */
	private String body;

	/** The message id. */
	private Number messageId;

	/** The sender id. */
	private Number senderId;

	/** The sender name. */
	private String senderName;

	/** The sent date. */
	private String sentDate;

	private String bbBody;

	/**
	 * @return the bbBody
	 */
	public String getBBBody() {
		return bbBody.replace("\r", "");
	}

	/**
	 * Gets the body.
	 * 
	 * @return the body
	 */
	public String getBody() {
		return this.body;
	}

	/**
	 * Gets the message id.
	 * 
	 * @return the message id
	 */
	public Number getMessageId() {
		return messageId;
	}

	/**
	 * Gets the sender id.
	 * 
	 * @return the sender id
	 */
	public Number getSenderId() {
		return senderId;
	}

	/**
	 * Gets the sender name.
	 * 
	 * @return the sender name
	 */
	public String getSenderName() {
		if (senderName == null || senderName.length() == 0)
			senderName = "System";
		return senderName;
	}

	public boolean isSystem() {
		return getSenderName().equals("System");
	}

	/**
	 * Gets the sent date.
	 * 
	 * @return the sent date
	 */
	public String getSentDate() {
		return this.sentDate;
	}

	/**
	 * Gets the quotable body.
	 * 
	 * @return the quotable body
	 */
	public String getQuotableBody() {
		return "[quote=" + senderName + "]" + getBBBody() + "[/quote]";

	}

	@Override
	public String toString() {
		return "Messages [getBBBody()=" + getBBBody() + ", getBody()=" + getBody() + ", getMessageId()=" + getMessageId()
				+ ", getSenderId()=" + getSenderId() + ", getSenderName()=" + getSenderName() + ", isSystem()=" + isSystem()
				+ ", getSentDate()=" + getSentDate() + ", getQuotableBody()=" + getQuotableBody() + "]";
	}

}
