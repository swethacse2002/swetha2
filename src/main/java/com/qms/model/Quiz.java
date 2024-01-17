package com.qms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quiz {

	@Id

	private int qid;
	@Column
	private String title;
	@Column
	private String category;
	@Column
	private int noOfQues;
	@Column
	private int marks;
	@Column
	private String time;

	public Quiz() {
		super();

	}

	public Quiz(int qid, String title, String category, int noOfQues, int marks, String time) {
		super();
		this.qid = qid;
		this.title = title;
		this.category = category;
		this.noOfQues = noOfQues;
		this.marks = marks;
		this.time = time;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNoOfQues() {
		return noOfQues;
	}

	public void setNoOfQues(int noOfQues) {
		this.noOfQues = noOfQues;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Quiz [qid=" + qid + ", title=" + title + ", category=" + category + ", noOfQues=" + noOfQues
				+ ", marks=" + marks + ", time=" + time + "]";
	}

}
