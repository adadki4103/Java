// Adam Adkins
// 11-3-16

import java.sql.*;
import java.util.*;


class AdaSqlCon{
 // Show Databases Method. 
  public static void showDatabases(Statement stmt, DatabaseMetaData dbmd){
    try{
      ResultSet rs = stmt.executeQuery("show databases"); 
      System.out.println(" Databases: "+ dbmd.getDatabaseProductName()+".");
      System.out.println("---------------------------");
      while(rs.next()){
        String db=rs.getString(1);
        System.out.println(" "+db);}}
      catch(Exception e){ System.out.println(e);}}
  
  // Create Database Method.
  public static void createDatabase(Scanner scan, Statement stmt){
    try{
      System.out.println("");
      System.out.println("What would you like to name your New Database?");
      String newDBName = scan.next();
      String sqlnewDB = "CREATE DATABASE "+newDBName;
      System.out.println("Creating Database...");
      stmt.executeUpdate(sqlnewDB);
      System.out.println("Database \""+newDBName+"\" created successfully!");}
    catch(Exception e){System.out.println(e);}}
  
  // Delete Database Method.
  public static void deleteDatabase(Scanner scan, Statement stmt){
    try{
      System.out.println("");
      System.out.println("Which Database would you like to Delete?");
      String dbToDel = scan.next();
      String sqldelDB = "DROP DATABASE "+dbToDel;
      System.out.println("Deleting Database...");
      stmt.executeUpdate(sqldelDB);
      System.out.println("Database \""+dbToDel+"\" deleted successfully!");}
    catch(Exception e){System.out.println(e);}}
  
  // Pick Database Method
  public static void pickDatabase(Statement stmt, Scanner scan,Connection con){
    try{
      System.out.println("");
      System.out.println("Which Database would you like to use?");
      String pickDB = scan.next();
      String DB_URL = "jdbc:mysql://localhost/"+pickDB;
      String USER = "root";
      String PASS = "root";
      System.out.println("Connecting to selected database...");
      con = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully!");}
    catch(Exception e){System.out.println(e);}}
      
  // Show Tables Method
  public static void showTables(DatabaseMetaData dbmd){
  try{
    System.out.println("");
    System.out.println("---------------------------");
    ResultSet rs2 = dbmd.getTables(null, null, "%", null);
    while (rs2.next()){System.out.println(rs2.getString(3));}}
  catch(Exception e){ System.out.println(e);}}
  
  // Show Columns of Specified Table Method
  public static void showColumns(DatabaseMetaData dbmd, Statement stmt, Scanner scan){
    try{
      System.out.println("");
      System.out.println("Tables of Database: "+ dbmd.getDatabaseProductName()+".");
      System.out.println("---------------------------");
      ResultSet rs2 = dbmd.getTables(null, null, "%", null);
      while (rs2.next()){
        System.out.println(rs2.getString(3));}}
    catch(Exception e){ System.out.println(e);}
    System.out.println("");
    System.out.println("Please Specify the Table name");
    try{
      String tableName = scan.next();
      System.out.println("Columns of Table: "+tableName+".");
      System.out.println("---------------------------");
      ResultSet rs3 = stmt.executeQuery("select * from "+tableName);
      ResultSetMetaData rsmd = rs3.getMetaData();
      int columnCount = rsmd.getColumnCount();
      for(int i = 1; i <= columnCount; i++ ){
        String name = rsmd.getColumnName(i);
        System.out.println(name);}}
    catch(Exception e){ System.out.println(e);}}
  
  // Show Rows of Specified Table Method.
  public static void showRows(Connection con, String tableName){
    try {System.out.println("Rows of \"" + tableName + "\" are:");
      System.out.println("---------------------------------------");
      try (PreparedStatement selectStmt = con.prepareStatement("SELECT * from " + tableName, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           ResultSet rs = selectStmt.executeQuery()){if (!rs.isBeforeFirst()){
             System.out.println("No rows found.");}
           else{while (rs.next()){for (int i = 1; i < rs.getMetaData().getColumnCount() + 1; i++){
             System.out.print(" " + rs.getMetaData().getColumnName(i) + " = " + rs.getObject(i)+",");}
           System.out.println("");}}}}
    catch(SQLException e){throw new RuntimeException(e);}}
  
  // Insert Data into a Table Method.
  public static void insertData(Scanner scan, Statement stmt){
    try{System.out.println("");
      System.out.println("Please Specify the Table name");
      String tableName = scan.next();
      System.out.println("::: "+tableName+":::");
      System.out.println("---------------------------");
      ResultSet rs3 = stmt.executeQuery("select * from "+tableName);
      ResultSetMetaData rsmd = rs3.getMetaData();
      int columnCount = rsmd.getColumnCount();
      for(int i = 1; i <= columnCount; i++ ){
        String name = rsmd.getColumnName(i);
        System.out.print(name+", ");}
      System.out.println("");
      System.out.println("Enter the Data seperated by commas.");
      System.out.println("Everything EXCEPT the FIRST entry MUST BE IN QUOTATIONS.");
      System.out.println("No Spaces allowed. Use under_scores.");
      String theData = scan.next();
      System.out.println("Inserting Data ....");
      String sql = "INSERT INTO "+tableName+" VALUES ("+theData+")";
      stmt.executeUpdate(sql);
      System.out.println("Data Inserted Successfully!");}
    catch(Exception e){ System.out.println(e);}}
  
  // Delete Data from a Table Method.
  public static void delData(Scanner scan, Statement stmt){
    try{
      System.out.println("Which Table would you like to Delete from?");
      String tableName2 = scan.next();
      System.out.println("MUST BE IN FORM OF: \"some_value\"=some_column");
      System.out.println("UNLESS, the value is the Primary Key."); 
      System.out.println("Delete from "+tableName2+" where _____ ?");
      String deleteVal = scan.next();
      System.out.println("");
      String sqlDel = "DELETE FROM "+tableName2+" WHERE ("+deleteVal+") LIMIT 1";
      System.out.println("Deleting...");
      stmt.executeUpdate(sqlDel);
      System.out.println("Deleted Successfully!");}
    catch(Exception e){ System.out.println(e);}}
  
  // Show Foreign Keys Method
  private static void printForeignKeys(Connection con, String tableName) throws SQLException {
    try{
      DatabaseMetaData metaData = con.getMetaData();
      ResultSet foreignKeys = metaData.getImportedKeys(con.getCatalog(), null, tableName);
      while (foreignKeys.next()) {
        String fkTableName = foreignKeys.getString("FKTABLE_NAME");
        String fkColumnName = foreignKeys.getString("FKCOLUMN_NAME");
        String pkTableName = foreignKeys.getString("PKTABLE_NAME");
        String pkColumnName = foreignKeys.getString("PKCOLUMN_NAME");
        System.out.println(fkTableName + "." + fkColumnName + " -> " + pkTableName + "." + pkColumnName);
    }}catch(Exception e){ System.out.println(e);}}
  
  // Create Table Method *** SUPER SIMPLE. NEEDS WORK
  private static void makeNewKey(Statement stmt, Scanner scan){
    try{
      System.out.println("");
      System.out.println("What name shall the table have?");
      String tableName = scan.next();
      System.out.println("Enter your data in the format: ` table_name data_name` data_type, ");
      System.out.println("Enter your data: ");
      String newTSql = "CREATE TABLE "+tableName;
      System.out.println("Creating table...");
      stmt.executeUpdate(newTSql);
      System.out.println("Table created successfully!");}
    catch(Exception e){System.out.println(e);}}
  
  // Delete Table Method
  private static void deleteTable(Statement stmt, Scanner scan){
    try{
      System.out.println("");
      System.out.println("What table do you want to delete?");
      String tableName = scan.next();
      String delTSql = "DROP TABLE "+tableName;
      System.out.println("Deleting table...");
      System.out.println("Are you sure?(y/n)");
      char c = scan.next().charAt(0);
      if (c == 'y'){
      stmt.executeUpdate(delTSql);
      System.out.println("Table deleted successfully!");}
      else if(c == 'n'){
        System.out.println("Ok...");}
      else{System.out.println("That wasn't a choice...");}}  
    catch(Exception e){System.out.println(e);}}

 //*****************************************************************************************************
  //           End Methods. Start Main.
  //****************************************************************************************************
public static void main(String args[]){
  // Connect to Server
     Scanner scan = new Scanner(System.in);
     Scanner scan2 = new Scanner(System.in);
     char again = 'y';
     while(again == 'y'){
       try{
         Class.forName("com.mysql.jdbc.Driver");  
         // Change 'idealhome' here to change the default used.
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/idealhome","root","root");  
         Statement stmt = con.createStatement(); 
         DatabaseMetaData dbmd = con.getMetaData();
         System.out.println("Connected successfully.");
    
    // User Menu
    System.out.println("");
    System.out.println("----------------------------------------------------------------------------------------");
    System.out.println("| Welcome.  Please make a selection:                                                    |");
    System.out.println("|          1. Show databases                                                            |");
    System.out.println("|          2. Create database                                                           |");
    System.out.println("|          3. Delete database                                                           |");
    System.out.println("|          4. Pick database to use                                                      |");
    System.out.println("|          5. Show tables                                                               |");
    System.out.println("|          6. Show columns of a table                                                   |");
    System.out.println("|          7. Show rows of a table                                                      |");
    System.out.println("|          8. Insert data into a table                                                  |");
    System.out.println("|          9. Delete Data from a table                                                  |");
    System.out.println("|         10. Show foreign keys of a table                                              |");
    System.out.println("|         11. Create a new table                                                        |");
    System.out.println("|         12. Drop a table                                                              |");       
    System.out.println("----------------------------------------------------------------------------------------");
    System.out.println("");
    
    int userChoice = scan.nextInt();
  
// Show Databases Choice
    if(userChoice == 1){
      try{showDatabases(stmt,dbmd);}
        catch(Exception e){System.out.println(e);} }
    
// Create Database Choice
    else if(userChoice == 2){
      try{createDatabase(scan,stmt);}
      catch(Exception e){System.out.println(e);}}
    
// Delete Database Choice
    else if(userChoice == 3){
      try{deleteDatabase(scan, stmt);}
      catch(Exception e){System.out.println(e);}}
    
 // Pick Database Choice
    else if(userChoice ==4){
      try{pickDatabase(stmt,scan,con);}
      catch(Exception e){System.out.println(e);}}

 // Show Tables Choice
    else if(userChoice == 5){
      try{showTables(dbmd);}
      catch(Exception e){System.out.println(e);}}

 // Show Columns of Specified Table Choice
    else if(userChoice == 6){
      try{showColumns(dbmd, stmt, scan);}
      catch(Exception e){System.out.println(e);}}
    
 // Show Rows of Specified Table Choice
    else if(userChoice == 7){
      System.out.println("");
      System.out.println("Please Specify the Table name");
      String tableName = scan.next();
      showRows(con,tableName);}
    
//  Insert Data into a Table Choice
    else if(userChoice == 8){
      try{insertData(scan, stmt);}
      catch(Exception e){System.out.println(e);}}
    
 // Delete Data from a Table Choice
    else if(userChoice == 9){
      try{delData(scan, stmt);}
      catch(Exception e){System.out.println(e);}}
    
 // Show Foreign Keys Choice
    else if(userChoice == 10){
      System.out.println("");
      System.out.println("Please Specify the Table name");
      String tableName = scan.next();
      try{printForeignKeys(con, tableName);}
      catch(Exception e){System.out.println(e);}}
    
 // Create New Table Choice
    else if(userChoice == 11){
      try{makeNewKey(stmt, scan);}
      catch(Exception e){System.out.println(e);}}
    
 // Drop Table Choice
    else if(userChoice == 12){
      try{deleteTable(stmt, scan);}
      catch(Exception e){System.out.println(e);}}
    
    
    
  /// **** END
 }
       catch(Exception e){System.out.println(e);}
 System.out.println("---------------------------");
           System.out.println("");
           System.out.println("Continue? (y/n)");
           again = scan2.nextLine().charAt(0);
     }
     System.out.println("Goodbye!");


}}



  