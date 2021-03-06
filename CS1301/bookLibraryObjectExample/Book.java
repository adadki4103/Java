// Bowman's CSC1301 Project 3.
// Author: Adam Adkins
// Created: 7/7/2015


public class Book{
  String bookAuthor, bookTitle, bookPublisher, bookPubYear,bookPageNumber,isCheckedOut;
//Book Constructor - creates a Book object when class is called. 
  public Book (String author, String title, String publisher, String pubYear, String pageNumber, String checkOut){
    bookAuthor = author;
    bookTitle = title;
    bookPublisher = publisher;
    bookPubYear = pubYear;
    bookPageNumber = pageNumber;
    isCheckedOut = checkOut;}
//****************************************>>>>>  SETTERS <<<<<******************************\\
//::::::::::::::::::::::::::::::::::::::::::::::::::::
/** This method sets the Author of a book to a 
  * specific String.
  * @param author   The Author's name for this book.*/
 public void setAuthor (String author){
    bookAuthor = author;}
//::::::::::::::::::::::::::::::::::::::::::::
/** This method sets the Title of a book to a 
  * specific String.
  * @param title   The Title for this book.*/
 public void setTitle (String title){
    bookTitle = title;}
//:::::::::::::::::::::::::::::::::::::::::::::::::::::
/** This method sets the Publisher of a book to a 
  * specific String.
  * @param publisher   The Publisher name this book.*/
 public void setPub (String publisher){
   bookPublisher = publisher;} 
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
/** This method sets the Year of Publication for a book to a 
  * specific String.
  * @param pubYear   The Year of Publication for this book.*/
 public void setPubYear (String pubYear){
    bookPubYear = pubYear;}
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
/** This method sets the Number of Pages within a book to a 
  * specific String.
  * @param pageNumber  The Number of Pages for this book.*/
 public void setPageNum (String pageNumber){
   bookPageNumber = pageNumber;}
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
 /** This method sets whether or not a book is checked out
   * or not.  Checked Out: YES or NO. 
   * @ param checkOut  Yes or No to indicate if the book is 
   * checked out or not. */
 public void setCheckOut (String checkOut){
   isCheckedOut = checkOut;}
//****************************************>>>>>  GETTERS <<<<<******************************\\
//::::::::::::::::::::::::::::::::::::::::::::
/** This method returns the Author of a book
  * as a String.*/
  public String getAuthor(){
    return bookAuthor;}
//::::::::::::::::::::::::::::::::::::::::::::
/** This method returns the Title of a book
  * as a String.*/
  public String getTitle(){
    return bookTitle;}
//:::::::::::::::::::::::::::::::::::::::::::::::
/** This method returns the Publisher of a book
  * as a String.*/
  public String getPub(){
    return bookPublisher;}
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::
/** This method returns the Year of Publication of a book
  * as a String.*/
  public String getPubYear(){
    return bookPubYear;}
//::::::::::::::::::::::::::::::::::::::::::::::::::::
/** This method returns the Number of Pages of a book
  * as a String.*/
  public String getNum(){
    return bookPageNumber;} 
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
/** This method returns whether or not a book is checked out
   * or not.  Checked Out: YES or NO. 
   *  Yes or No to indicate if the book is checked out or not. */
 public String getCheckOut (){
   return isCheckedOut;}
//****************************************>>>>>  toString <<<<<******************************\\
  public String toString(){
    return "\n\nTitle: " + bookTitle +"\n"+"Author: "+ bookAuthor +"\n"+"Publisher: "+ bookPublisher +"\n"+"Year: "+ bookPubYear +"\n"+"Number of Pages: "+bookPageNumber+"\n"+"Checked Out: "+isCheckedOut+"\n";}
} 
  
  