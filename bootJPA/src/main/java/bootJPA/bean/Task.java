/**
 * 
 */
package bootJPA.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author $ Rakesh K Ray
 *
 * @Created May 19, 2017 3:54:12 PM
 */
@Entity(name = "t_tasks")
public class Task implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date dateCreated;
	private boolean finished;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreared) {
		this.dateCreated = dateCreared;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public Task(String name, String description, Date dateCreared, boolean finished) {
		this.name = name;
		this.description = description;
		this.dateCreated = dateCreared;
		this.finished = finished;
	}

	public Task() {
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Task [id=").append(id).append(", name=").append(name).append(", description=")
				.append(description).append(", dateCreared=").append(dateCreated).append(", finished=").append(finished)
				.append("]");
		return builder.toString();
	}

}
