



package api.forum.section;

/**
 * The Class SpecificRules.
 * 
 * @author Gwindow
 */
public class SpecificRules {
	
	/** The thread id. */
	private Number threadId;
	
	/** The thread. */
	private String thread;

	/**
	 * Gets the thread id.
	 * 
	 * @return the thread id
	 */
	public Number getThreadId() {
		return threadId;
	}

	/**
	 * Gets the thread.
	 * 
	 * @return the thread
	 */
	public String getThread() {
		return thread;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpecificRules [getThreadId=" + getThreadId() + ", getThread=" + getThread() + "]";
	}

}
