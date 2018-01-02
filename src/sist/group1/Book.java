package sist.group1;

import java.io.Serializable;

public class Book implements Serializable, Comparable<Book>{

	/**
	 * 직렬화 UID
	 */
	private static final long serialVersionUID = 2L;
	/*
	 @Param
	 고유번호(ex. BOO1, BOO2...), 도서명, 저자, 출판사, 현재 도서 상태
	 */
	private String bookNo;
	private String bookTitle;
	private String author;
	private String publisher;
	private int bookStatus; //0: 비치중, 1: 대출중, 2:연체중
	
	public Book() {
		
	}
	
	public Book(String bookNo, String bookTitle, String author, String publisher) {
		
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public String getBookNo() {
		return bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return author;
	}
	
	public int getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(int bookStatus) {
		this.bookStatus = bookStatus;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Book) {
			Book book = (Book)obj;
			if(this.bookNo.equals(book.getBookNo())){
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public int compareTo(Book o) {
		int result = 0;
		if(o instanceof Book) {
			Book book = (Book)o;
			result = this.bookNo.compareTo(book.getBookNo());
		}
		return result;
	}
}