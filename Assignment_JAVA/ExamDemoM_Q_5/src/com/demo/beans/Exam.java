package com.demo.beans;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;


public class Exam {
	
	 private int examid;
	 private String examname;
	 private String topic;
     private LocalDate ld;
     private Question[] ques;
	
     public Exam() 
     {
		super();
	 }

	public Exam(int examid, String examname, String topic, LocalDate ld, Question[] ques) {
		super();
		this.examid = examid;
		this.examname = examname;
		this.topic = topic;
		this.ld = ld;
		this.ques = ques;
	}

	public int getExamid() {
		return examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public String getExamname() {
		return examname;
	}

	public void setExamname(String examname) {
		this.examname = examname;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public LocalDate getLd() {
		return ld;
	}

	public void setLd(LocalDate ld) {
		this.ld = ld;
	}

	public Question[] getQues() {
		return ques;
	}

	public void setQues(Question[] ques) {
		this.ques = ques;
	}

	@Override
	public String toString() {
		return "Exam [examid=" + examid + ", examname=" + examname + ", topic=" + topic + ", ld=" + ld + ", ques="
				+ Arrays.toString(ques) + "]";
	} 
     
     
     
	
}
