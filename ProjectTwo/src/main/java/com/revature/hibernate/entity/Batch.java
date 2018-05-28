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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.revature.hibernate.enums.SkillType;
import com.revature.hibernate.enums.TrainingLocation;

@Entity
@Table(name="Batch")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Batch{

	@Id
	@GeneratedValue
	@Column(name="Batch_Id")
	private int Batch_Id;
	
	@Column(name="trainingName")
	String trainingName;
	
	@Column(name="trainingLocation")
	TrainingLocation trainingLocation;
	
	@Column(name="skillType")
	SkillType skillType;
	
	@Column(name="trainer")
	String trainer;
	
	@Column(name="cotrainer")
	String cotrainer;
	
	@Column(name="start_month")
	int start_month;
	
	@Column(name="start_day")
	int start_day;
	
	@Column(name="start_year")
	int start_year;
	
	@Column(name="end_month")
	int end_month;
	
	@Column(name="end_day")
	int end_day;
	
	@Column(name="end_year")
	int end_year;
	
	@Column(name="goodGrade")
	float goodGrade;
	
	@Column(name="passingGrade")
	float passingGrade;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="Trainee")
	private List<Trainee> trainees = new ArrayList<>();
	
	public Batch(String trainingName) {
		super();
		this.trainingName = trainingName;
	}
	public Batch(String trainingName, TrainingLocation trainingLocation, SkillType skillType, String trainer,
			String cotrainer, int start_month, int start_day, int start_year, int end_month, int end_day, int end_year,
			float goodGrade, float passingGrade) {
		super();
		this.trainingName = trainingName;
		this.trainingLocation = trainingLocation;
		this.skillType = skillType;
		this.trainer = trainer;
		this.cotrainer = cotrainer;
		this.start_month = start_month;
		this.start_day = start_day;
		this.start_year = start_year;
		this.end_month = end_month;
		this.end_day = end_day;
		this.end_year = end_year;
		this.goodGrade = goodGrade;
		this.passingGrade = passingGrade;
	
	}
	
	
	public int getBatch_Id() {
		return Batch_Id;
	}
	public void setBatch_Id(int batch_Id) {
		Batch_Id = batch_Id;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public TrainingLocation getTrainingLocation() {
		return trainingLocation;
	}
	public void setTrainingLocation(TrainingLocation trainingLocation) {
		this.trainingLocation = trainingLocation;
	}
	public SkillType getSkillType() {
		return skillType;
	}
	public void setSkillType(SkillType skillType) {
		this.skillType = skillType;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getCotrainer() {
		return cotrainer;
	}
	public void setCotrainer(String cotrainer) {
		this.cotrainer = cotrainer;
	}
	public int getStart_month() {
		return start_month;
	}
	public void setStart_month(int start_month) {
		this.start_month = start_month;
	}
	public int getStart_day() {
		return start_day;
	}
	public void setStart_day(int start_day) {
		this.start_day = start_day;
	}
	public int getStart_year() {
		return start_year;
	}
	public void setStart_year(int start_year) {
		this.start_year = start_year;
	}
	public int getEnd_month() {
		return end_month;
	}
	public void setEnd_month(int end_month) {
		this.end_month = end_month;
	}
	public int getEnd_day() {
		return end_day;
	}
	public void setEnd_day(int end_day) {
		this.end_day = end_day;
	}
	public int getEnd_year() {
		return end_year;
	}
	public void setEnd_year(int end_year) {
		this.end_year = end_year;
	}
	public float getGoodGrade() {
		return goodGrade;
	}
	public void setGoodGrade(float goodGrade) {
		this.goodGrade = goodGrade;
	}
	public float getPassingGrade() {
		return passingGrade;
	}
	public void setPassingGrade(float passingGrade) {
		this.passingGrade = passingGrade;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cotrainer == null) ? 0 : cotrainer.hashCode());
		result = prime * result + end_day;
		result = prime * result + end_month;
		result = prime * result + end_year;
		result = prime * result + Float.floatToIntBits(goodGrade);
		result = prime * result + Float.floatToIntBits(passingGrade);
		result = prime * result + ((skillType == null) ? 0 : skillType.hashCode());
		result = prime * result + start_day;
		result = prime * result + start_month;
		result = prime * result + start_year;
		result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
		result = prime * result + ((trainingLocation == null) ? 0 : trainingLocation.hashCode());
		result = prime * result + ((trainingName == null) ? 0 : trainingName.hashCode());
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
		Batch other = (Batch) obj;
		if (cotrainer == null) {
			if (other.cotrainer != null)
				return false;
		} else if (!cotrainer.equals(other.cotrainer))
			return false;
		if (end_day != other.end_day)
			return false;
		if (end_month != other.end_month)
			return false;
		if (end_year != other.end_year)
			return false;
		if (Float.floatToIntBits(goodGrade) != Float.floatToIntBits(other.goodGrade))
			return false;
		if (Float.floatToIntBits(passingGrade) != Float.floatToIntBits(other.passingGrade))
			return false;
		if (skillType != other.skillType)
			return false;
		if (start_day != other.start_day)
			return false;
		if (start_month != other.start_month)
			return false;
		if (start_year != other.start_year)
			return false;
		if (trainer == null) {
			if (other.trainer != null)
				return false;
		} else if (!trainer.equals(other.trainer))
			return false;
		if (trainingLocation != other.trainingLocation)
			return false;
		if (trainingName == null) {
			if (other.trainingName != null)
				return false;
		} else if (!trainingName.equals(other.trainingName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Batch [trainingName=" + trainingName + ", trainingLocation=" + trainingLocation + ", skillType="
				+ skillType + ", trainer=" + trainer + ", cotrainer=" + cotrainer + ", start_month=" + start_month
				+ ", start_day=" + start_day + ", start_year=" + start_year + ", end_month=" + end_month + ", end_day="
				+ end_day + ", end_year=" + end_year + ", goodGrade=" + goodGrade + ", passingGrade=" + passingGrade
				+ "]";
	}
	
	
	
}
