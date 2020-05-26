// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 
package Server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import ocsf.server.*;

/**
 * This class overrides some of the methods in the abstract superclass in order
 * to give more functionality to the server.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;re
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Paul Holden
 * @version July 2000
 */

public class EchoServer extends AbstractServer {
	// Class variables *************************************************

	/**
	 * The default port to listen on.
	 */
	final public static int DEFAULT_PORT = 5555;

	// Constructors ****************************************************

	/**
	 * Constructs an instance of the echo server.
	 *
	 * @param port The port number to connect on.
	 * 
	 */

	public EchoServer(int port) {
		super(port);
	}

	// Instance methods ************************************************

	/**
	 * This method handles any messages received from the client.
	 *
	 * @param msg    The message received from the client.
	 * @param client The connection from which the message originated.
	 * @param
	 */
	public void handleMessageFromClient(Object msg, ConnectionToClient client) {
		System.out.println("Message received: " + msg + " from " + client);
		
		ObservableList<employee> people= (GetDataFromDataBase(mysqlConnection.GetCon()));
		String st;
		  st=msg.toString();
		  String[] result = st.split("\\s");
		
		if((boolean)msg.equals("getdata"))
		{
			for (int i = 0; i <= people.size(); i++) {
				this.sendToAllClients( people.get(i).toString());
			}
			
		}
		
		else if((boolean)result[0].equals("change"))
		{
			  System.out.println(result[0]+""+result[1]+""+result[2]);
			try {
				OnChangedJob(result[2],result[1]);
				System.out.println(result[1]+""+result[2]);
				this.sendToAllClients( "client choose to change the job for the worker the id '"+result[2]+"' to '"+result[1]+"'");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
		
				this.sendToAllClients( msg);
			
		}
		
		
	}
	public void OnChangedJob(String value,String id)
			throws SQLException {
		
		
		Statement s;
		s=mysqlConnection.GetCon().createStatement();
		s.executeUpdate("UPDATE `test`.`employee` SET `job` = '" + value
		+ "' WHERE (`id` = '" + id + "')");
	}
	
	public static ObservableList<employee> GetDataFromDataBase(Connection con) {
		ObservableList<employee> people = FXCollections.observableArrayList();

		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee;");
			while (rs.next()) {
				people.add(new employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6)));
			}
			rs.close();
			return people;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return people;
	}

	/**
	 * This method overrides the one in the superclass. Called when the server
	 * starts listening for connections.
	 */
	protected void serverStarted() {
		
		  System.out.println ("Server listening for connections on port " + getPort());
		/* students[0]=new Student("12345","Yossi","Cohen",new Faculty("SE","9901000"));
		 * students[1]=new Student("66666","Yossefa","Levi",new
		 * Faculty("IE","9901123")); students[2]=new
		 * Student("77777","moshe","galili",Faculty.getFaculty("SE")); students[3]=new
		 * Student("77778","moran","galil",Faculty.getFaculty("SE"));
		 */
	}

	/**
	 * This method overrides the one in the superclass. Called when the server stops
	 * listening for connections.
	 */
	protected void serverStopped() {
		System.out.println("Server has stopped listening for connections.");
	}
}
//End of EchoServer class
