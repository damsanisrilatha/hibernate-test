package com.sd.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "author_id")
	private Integer authorId;
	
	@Column(name="author_name")
	private String authorname;
   

public Author()
{}

public Integer getAuthorId() {
	return authorId;
}

public void setAuthorId(Integer authorId) {
	this.authorId = authorId;
}

public String getAuthorname() {
	return authorname;
}

public void setAuthorname(String authorname) {
	this.authorname = authorname;
}

public Author(Integer authorId, String authorname) {
	super();
	this.authorId = authorId;
	this.authorname = authorname;
}

@Override
public String toString() {
	return "Author [authorId=" + authorId + ", authorname=" + authorname + "]";
}
 
}
