package com.luv2code.hibernate.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.luv2code.hibernate.demo.entity.Course;

@Entity
@Table(name="review")
public class Review 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	 
	
	@Column(name="comment")
	private String comment;
	public Review(String comment) {
		//super();
		this.comment = comment;
	}
	
	public Review()
	{
		
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", comment=" + comment + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
