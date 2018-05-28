package com.revature.hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Week")
public class Week{
	
	@Id
	@GeneratedValue
	@Column(name="Week_Id")
	private int Week_Id;
	
	@Column(name="overallFeedback")
	String overallFeedback;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="Assessment")
	private List<Assessment> assessments = new ArrayList<>();

	public Week() {}
	
	public String getOverallFeedback() {
		return overallFeedback;
	}

	public void setOverallFeedback(String overallFeedback) {
		this.overallFeedback = overallFeedback;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((overallFeedback == null) ? 0 : overallFeedback.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Week other = (Week) obj;
		if (overallFeedback == null) {
			if (other.overallFeedback != null)
				return false;
		} else if (!overallFeedback.equals(other.overallFeedback))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Week [overallFeedback=" + overallFeedback + "]";
	}
	
	
}
