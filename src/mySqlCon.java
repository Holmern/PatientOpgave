import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class mySqlCon {


    public static void main(String[] args) {
       /* try{
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/patient?useTimezone=true&serverTimezone=UTC","root", "JoCa2911");
//here patient is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from patientInfo");
            while(rs.next())
                System.out.println(rs.getInt("cpr")+"  "+rs.getString("firstName"));

            stmt = con.createStatement(); //KALD I TDB
            //Her kommer vores input ind i DB

            String sql ="INSERT INTO cpr" + "VALUES (cpr, firstName)";
            //Det her er vores 'Form'


            con.close();
        }catch(Exception e){ System.out.println(e);}*/

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/patient?useTimezone=true&serverTimezone=UTC", "root", "Bpq53uwz");
//here patient is database name, root is username and password
            Statement stmt = con.createStatement();  //KALD I TDB

            //Her kommer vores input ind i DB
            toDataBase db = new toDataBase();

            String sql = "INSERT INTO patientInfo (cpr, forNavn, efterNavn, højde_cm, vægt_kg, beskrivelse, adresse, telefon, Konsultation_cpr)"
                    + "VALUES( ?, ?,?,?,?,?,?,?,?)";
            //Det her er vores 'Form'
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, db.enterCpr());
            preparedStatement.setString(2, db.enterFirstName());
            preparedStatement.setString(3, db.enterLastName());
            preparedStatement.setInt(4, db.enterheight());
            preparedStatement.setInt(5, db.enterWeight());
            preparedStatement.setString(6, db.enterDescription());
            preparedStatement.setString(7, db.enteraddress());
            preparedStatement.setInt(8, db.enterPhone());
            preparedStatement.setInt(9, db.enterCpr());



            preparedStatement.executeUpdate();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

      /*  try{
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/patient?useTimezone=true&serverTimezone=UTC","root", "JoCa2911");
//here patient is database name, root is username and password
            Statement stmt=con.createStatement();  //KALD I TDB

            //Her kommer vores input ind i DB
            toDataBase db = new toDataBase();

            String sql =("UPDATE patientInfo SET cpr = ?, forNavn = ? WHERE cpr = ?");
            //Det her er vores 'Form'
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,db.enterCpr());
            preparedStatement.setString(2,db.enterForNavn());
            preparedStatement.setInt(3,db.changeCpr());
            preparedStatement.executeUpdate();

            con.close();
        }catch(Exception e){ System.out.println(e);}*/



        /*try{
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/patient?useTimezone=true&serverTimezone=UTC","root", "JoCa2911");
//here patient is database name, root is username and password
            Statement stmt=con.createStatement();  //KALD I TDB

            //Her kommer vores input ind i DB
            toDataBase db = new toDataBase();

            String sql =("DELETE FROM patientInfo WHERE cpr = ?");
            //Det her er vores 'Form'
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,db.enterCpr());
            preparedStatement.executeUpdate();

            con.close();
        }catch(Exception e){ System.out.println(e);}
*/

    }


}

