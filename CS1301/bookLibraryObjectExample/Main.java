// Bowman's CSC1301 Project 3.
// Author: Adam Adkins
// Created: 7/7/2015

public class Main {
  public static void main (String[] args){ 
    Library lib = new Library("Adam", 0);
    // Author, Title, Publisher, Year Published, Number of Pages, Checked Out?
    System.out.println("************************************************************************************************");
    System.out.println("************************************************************************************************");
    lib.addBook("Douglas Adams", "The Hitchhiker's Guide to the Galaxy","Megadodo Publications","1979","143","NO");
    lib.addBook("Terry Pratchet","The Color of Magic","Colin Smythe","1983","206","NO");
    lib.addBook("Isaac Asimov","Foundation","Gnome Press","1951","296","NO");
    lib.addBook("Dante Alighieri","Inferno","Penguin Classics","1317","331","YES");
    lib.addBook("Neil Gaiman","American Gods","HarperCollins","2001","480","NO");
    lib.addBook("David Mitchell","Cloud Atlas","Sceptre","2004","509","NO");
    lib.addBook("Phillip Pullman","The Subtle Knife","Scholastic Point","1997","341","YES");
    lib.addBook("Ann Rice","Memnoch the Devil","Alfred A. Knopf","1995","354","NO");
    lib.addBook("Abbie Hoffman","Steal this Book","Grove Press","1971","308","NO");
    lib.addBook("Kurt Vonnegut Jr.","God Bless You, Mr. Rosewater", "Holt, Rinehart and Winston","1965","218","NO");
    System.out.print(lib);
    System.out.println("************************************************************************************************");
    System.out.println("****                (( Delete: [ Memnoch the Devil ] ))                                    *****");
    System.out.println("****                       (( Change Owner ))                                               ****");
    System.out.println("************************************************************************************************");
    lib.delBook(7);
    lib.setOwner("Ronin the Great Galactic Destroyer");
    System.out.println(lib);
  }}