// Bowman's CSC1301 Project 3.
// Author: Adam Adkins
// Created: 7/7/2015

import java.util.ArrayList;

class Library {
    String bookOwner;
    int numberOfBooks = 0;
    ArrayList<Book> bookList = new ArrayList<Book>();
    int libraryLength = bookList.size();
//Library Constructor - creates a Library object when class is called. 
  public Library (String owner, int bookNum){
  bookOwner = owner;
  numberOfBooks = bookNum;}
//****************************************>>>>>  SETTERS <<<<<******************************\\
//::::::::::::::::::::::::::::::::::::::::::::::::::::
/** This method sets the Owner of a book to a 
  * specific String.
  * @param owner   The Owner's name for this book.*/
 public void setOwner (String owner){
    bookOwner = owner;}
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
/** This method sets the Number of a books to a 
  * specific Integer.
  * @param bookNum   The Number of books within the Library.*/
 public void setBookNum (int bookNum){
   numberOfBooks = bookNum;}
//****************************************>>>>>  GETTERS <<<<<******************************\\
//::::::::::::::::::::::::::::::::::::::::::::
/** This method returns the Owner of a book
  * as a String.*/
  public String getOwner(){
    return bookOwner;}
//::::::::::::::::::::::::::::::::::::::::::::
/** This method returns the Number of a books
  * as an Integer.*/
  public int getBookNum(){
    return numberOfBooks;}
//******************************************************************************************\\
//:::::::::::::::::::::::::::::::::::::::::::::
/** This method adds a Book to the Library. */ 
  public void addBook(String author, String title, String publisher, String pubYear, String pageNumber, String checkOut){
    Book bookie = new Book(author, title, publisher, pubYear, pageNumber, checkOut);
    numberOfBooks++;
    bookList.add(bookie);}
//::::::::::::::::::::::::::::::::::::::::::::::::::
/** This method deletes a book from the Library. */
  public void delBook(int bookCountThing){
    bookList.remove(bookCountThing);
    numberOfBooks--;}
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  
//****************************************>>>>>  toString <<<<<******************************\\
  public String toString(){
    return "Library Owner: " + bookOwner +"\n"+"Size: "+ numberOfBooks +"\n"+"Books: "+bookList;}
  }