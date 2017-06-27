/**
 * 
 */
package com.start.home.dataobjects;

/**
 * @author jgharge
 *
 */
public class LatestNewsDO {

	private int lastestNewsId;
	
	private String label;
	
	private String link;
	
	private String description;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLastestNewsId() {
		return lastestNewsId;
	}

	public void setLastestNewsId(int lastestNewsId) {
		this.lastestNewsId = lastestNewsId;
	}

	@Override
	public String toString() {
		return "LatestNewsDO [lastestNewsId=" + lastestNewsId + ", label="
				+ label + ", link=" + link + ", description=" + description
				+ "]";
	}

	
	
	
}
