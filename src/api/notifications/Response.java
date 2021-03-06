package api.notifications;

import java.util.List;

/**
 * The Class Response.
 * 
 * @author Gwindow
 */
public class Response {

	/** The current pages. */
	private Number currentPages;

	/** The num new. */
	private Number numNew;

	/** The pages. */
	private Number pages;

	/** The results. */
	private List<Results> results;

	/**
	 * Gets the current pages.
	 * 
	 * @return the current pages
	 */
	public Number getCurrentPages() {
		return this.currentPages;
	}

	/**
	 * Gets the num new.
	 * 
	 * @return the num new
	 */
	public Number getNumNew() {
		return this.numNew;
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
	 * Gets the results.
	 * 
	 * @return the results
	 */
	public List<Results> getResults() {
		return this.results;
	}

	/**
	 * Clear.
	 */
	public void clear() {
		currentPages = 0;
		numNew = 0;
		pages = 0;
		if (results != null && !results.isEmpty()) {
			results.clear();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Response [getCurrentPages=" + getCurrentPages() + ", getNumNew=" + getNumNew() + ", getPages=" + getPages()
				+ ", getResults=" + getResults() + "]";
	}
}
