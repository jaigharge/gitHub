/**
 * 
 */
package com.start.home.dataobjects;

/**
 * @author jgharge
 *
 */
public class StartLinksDO {

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

	@Override
	public String toString() {
		return "StartLinksDO [label=" + label + ", link=" + link
				+ ", description=" + description + "]";
	}
	
	
}
