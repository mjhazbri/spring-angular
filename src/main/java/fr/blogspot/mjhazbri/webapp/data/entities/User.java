/**
 * 
 */
package fr.blogspot.mjhazbri.webapp.data.entities;

import java.io.Serializable;

/**
 * @author Jalel
 *
 */
public class User implements Serializable {

	/**
	 * The serial version UID
	 */
	private static final long serialVersionUID = 2265761244148462881L;

	private String id;
	private String firstName;
	private String lasteName;
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasteName() {
		return lasteName;
	}

	public void setLasteName(String lasteName) {
		this.lasteName = lasteName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
