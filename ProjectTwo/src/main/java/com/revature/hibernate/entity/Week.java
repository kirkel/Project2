package com.revature.hibernate.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Week")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Week implements Serializable{

	private static final long serialVersionUID = 2712370107165662657L;

	@Id
	@GeneratedValue(generator="week_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="week_seq", allocationSize=1, initialValue=1)
	@Column(name="Week_Id")
	private int Week_Id;
	
	@Column(name="overallFeedback")
	String overallFeedback;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="week")
	private List<Assessment> assessments = new ArrayList<>();

	@ManyToOne(cascade= {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(name="Batch_Id")
	private Batch batch;
	
	public Week() {}
	
	public Week(Batch batch) {
		super();
		this.batch = batch;
	}
	
	public Week(String overallFeedback, Batch batch) {
		super();
		this.overallFeedback = overallFeedback;
		this.batch = batch;
	}

	public Week(String overallFeedback, List<Assessment> assessments, Batch batch) {
		super();
		this.overallFeedback = overallFeedback;
		this.assessments = assessments;
		this.batch = batch;
	}



	public int getWeek_Id() {
		return Week_Id;
	}

	public void setWeek_Id(int week_Id) {
		Week_Id = week_Id;
	}

	public String getOverallFeedback() {
		return overallFeedback;
	}

	public void setOverallFeedback(String overallFeedback) {
		this.overallFeedback = overallFeedback;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
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
