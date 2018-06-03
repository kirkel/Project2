package com.revature.hibernate.entity;

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

import com.revature.hibernate.enums.FlagColor;
import com.revature.hibernate.enums.TrainingStatus;

@Entity
@Table(name="Trainee")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Trainee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_gen")
	@SequenceGenerator(name="T_gen", sequenceName = "T_seq", allocationSize=1)
	@Column(name="Trainee_Id")
	private int Trainee_Id;
	
	@Column(name="fullName")
	String fullName;
	
	@Column(name="flagColor")
	FlagColor flagColor;
	
	@Column(name="flagNotes")
	String flagNotes;
	
	@Column(name="email")
	String email;
	
	@Column(name="status")
	TrainingStatus status;
	
	@Column(name="phonenumber")
	long phonenumber;
	
	@Column(name="skypeId")
	String skypeId;
	
	@Column(name="college")
	String college;
	
	@Column(name="degree")
	String degree;
	
	@Column(name="major")
	String major;
	
	@Column(name="recruiterName")
	String recruiterName;
	
	@Column(name="techScreenerName")
	String techScreenerName;
	
	@Column(name="projectCompletion")
	float  projectCompletion;
	
	@Column(name="profileUrl")
	String profileUrl;
	
	@ManyToOne(cascade= {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(name="Batch_Id")
	private Batch batch;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="trainee")
	List<AssessmentScore> assessmentScores = new ArrayList<>();
	
	public Trainee() {}
	
	public Trainee(String fullName) {
		super();
		this.fullName = fullName;
	}
	
	public Trainee(String fullName, FlagColor flagColor, String flagNotes) {
		super();
		this.fullName = fullName;
		this.flagColor = flagColor;
		this.flagNotes = flagNotes;
	}

	public Trainee(String fullName, FlagColor flagColor, String flagNotes, String email, TrainingStatus status,
			long phonenumber, String skypeId, String college, String degree, String major, String recruiterName,
			String techScreenerName, float projectCompletion, String profileUrl, Batch batch) {
		super();
		this.fullName = fullName;
		this.flagColor = flagColor;
		this.flagNotes = flagNotes;
		this.email = email;
		this.status = status;
		this.phonenumber = phonenumber;
		this.skypeId = skypeId;
		this.college = college;
		this.degree = degree;
		this.major = major;
		this.recruiterName = recruiterName;
		this.techScreenerName = techScreenerName;
		this.projectCompletion = projectCompletion;
		this.profileUrl = profileUrl;
		this.batch = batch;
	}

	public int getTrainee_Id() {
		return Trainee_Id;
	}

	public void setTrainee_Id(int trainee_Id) {
		Trainee_Id = trainee_Id;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public FlagColor getFlagColor() {
		return flagColor;
	}
	public void setFlagColor(FlagColor flagColor) {
		this.flagColor = flagColor;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public TrainingStatus getStatus() {
		return status;
	}
	public void setStatus(TrainingStatus status) {
		this.status = status;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getSkypeId() {
		return skypeId;
	}
	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getRecruiterName() {
		return recruiterName;
	}
	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}
	public String getTechScreenerName() {
		return techScreenerName;
	}
	public void setTechScreenerName(String techScreenerName) {
		this.techScreenerName = techScreenerName;
	}
	public float getProjectCompletion() {
		return projectCompletion;
	}
	public void setProjectCompletion(float projectCompletion) {
		this.projectCompletion = projectCompletion;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	public String getFlagNotes() {
		return flagNotes;
	}
	public void setFlagNotes(String flagNotes) {
		this.flagNotes = flagNotes;
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
		result = prime * result + ((college == null) ? 0 : college.hashCode());
		result = prime * result + ((degree == null) ? 0 : degree.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((flagColor == null) ? 0 : flagColor.hashCode());
		result = prime * result + ((flagNotes == null) ? 0 : flagNotes.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + (int) (phonenumber ^ (phonenumber >>> 32));
		result = prime * result + ((profileUrl == null) ? 0 : profileUrl.hashCode());
		result = prime * result + Float.floatToIntBits(projectCompletion);
		result = prime * result + ((recruiterName == null) ? 0 : recruiterName.hashCode());
		result = prime * result + ((skypeId == null) ? 0 : skypeId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((techScreenerName == null) ? 0 : techScreenerName.hashCode());
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
		Trainee other = (Trainee) obj;
		if (college == null) {
			if (other.college != null)
				return false;
		} else if (!college.equals(other.college))
			return false;
		if (degree == null) {
			if (other.degree != null)
				return false;
		} else if (!degree.equals(other.degree))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (flagColor != other.flagColor)
			return false;
		if (flagNotes == null) {
			if (other.flagNotes != null)
				return false;
		} else if (!flagNotes.equals(other.flagNotes))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (major == null) {
			if (other.major != null)
				return false;
		} else if (!major.equals(other.major))
			return false;
		if (phonenumber != other.phonenumber)
			return false;
		if (profileUrl == null) {
			if (other.profileUrl != null)
				return false;
		} else if (!profileUrl.equals(other.profileUrl))
			return false;
		if (Float.floatToIntBits(projectCompletion) != Float.floatToIntBits(other.projectCompletion))
			return false;
		if (recruiterName == null) {
			if (other.recruiterName != null)
				return false;
		} else if (!recruiterName.equals(other.recruiterName))
			return false;
		if (skypeId == null) {
			if (other.skypeId != null)
				return false;
		} else if (!skypeId.equals(other.skypeId))
			return false;
		if (status != other.status)
			return false;
		if (techScreenerName == null) {
			if (other.techScreenerName != null)
				return false;
		} else if (!techScreenerName.equals(other.techScreenerName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trainee [fullName=" + fullName + ", flagColor=" + flagColor + ", flagNotes=" + flagNotes + ", email="
				+ email + ", status=" + status + ", phonenumber=" + phonenumber + ", skypeId=" + skypeId + ", college="
				+ college + ", degree=" + degree + ", major=" + major + ", recruiterName=" + recruiterName
				+ ", techScreenerName=" + techScreenerName + ", projectCompletion=" + projectCompletion
				+ ", profileUrl=" + profileUrl + "]";
	}
	
	
	
}
