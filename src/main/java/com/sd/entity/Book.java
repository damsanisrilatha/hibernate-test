package com.sd.entity;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "book_id")
	private Integer bookid; 
	
	
	private String bookname;

@ManyToOne
@JoinColumn(name = "author_id", referencedColumnName = "author_id")
   private Author authors; 


	public Author getAuthors() {
	return authors;
}

public void setAuthors(Author authors) {
	this.authors = authors;
}

	Book()
	{
		
	}

	public Book(Integer bookid, String bookname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	

	

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname
				+ "]";
	}
	
}
