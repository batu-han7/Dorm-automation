import java.sql.*;  

public class Baglanti {
    private Connection conn;
    
    public Connection baglan(  ){
        return conn;
    }
    public Baglanti(  ){

        try{  
Class.forName( "com.mysql.jdbc.Driver" );  
conn=DriverManager.getConnection(   
"jdbc:mysql://localhost:3306/yurt_db", "root", "" );  
 
}catch( Exception e ){ System.out.println( e );}  
        
    }
}


