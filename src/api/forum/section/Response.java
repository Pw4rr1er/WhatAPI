



package api.forum.section;

import java.util.List;

/**
 * The Class Response.
 * 
 * @author Gwindow
 */
public class Response {
	
	/** The current page. */
	private Number currentPage;
	
	/** The forum name. */
	private String forumName;
	
	/** The pages. */
	private Number pages;
	
	/** The specific rules. */
	private List<SpecificRules> specificRules;
	
	/** The threads. */
	private List<Threads> threads;

	/**
	 * Gets the current page.
	 * 
	 * @return the current page
	 */
	public Number getCurrentPage() {
		return (currentPage);
	}

	/**
	 * Gets the forum name.
	 * 
	 * @return the forum name
	 */
	public String getForumName() {
		return this.forumName;
	}

	/**
	 * Gets the pages.
	 * 
	 * @return the pages
	 */
	public Number getPages() {
		return this.pages;
	}

	/**
	 * Gets the specific rules.
	 * 
	 * @return the specific rules
	 */
	public List<SpecificRules> getSpecificRules() {
		return this.specificRules;
	}

	/**
	 * Gets the threads.
	 * 
	 * @return the threads
	 */
	public List<Threads> getThreads() {
		return this.threads;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Response [getCurrentPage=" + getCurrentPage() + ", getForumName=" + getForumName() + ", getPages=" + getPages()
				+ ", getSpecificRules=" + getSpecificRules() + ", getThreads=" + getThreads() + "]";
	}
}
