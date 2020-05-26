// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

package client;

import client.*;
import common.ChatIF;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ocsf.client.AbstractClient;

import java.io.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import Server.employee;
import application.MainController;

/**
 * This class overrides some of the methods defined in the abstract superclass
 * in order to give more functionality to the client.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;
 * @author Fran&ccedil;ois B&eacute;langer
 * @version July 2000
 */
public class ChatClient extends AbstractClient {
	int i = 0, j = 0;
	// Instance variables **********************************************

	/**
	 * The interface type variable. It allows the implementation of the display
	 * method in the client.
	 */
	ChatIF clientUI;
	// public static Student s1 = new Student(null,null,null,new
	// Faculty(null,null));
	public static boolean awaitResponse = false;

	public static ObservableList<employee> ee = FXCollections.observableArrayList();;
	// Constructors ****************************************************

	/**
	 * Constructs an instance of the chat client.
	 *
	 * @param host     The server to connect to.
	 * @param port     The port number to connect on.
	 * @param clientUI The interface type variable.
	 */

	public ChatClient(String host, int port, ChatIF clientUI) throws IOException {
		super(host, port); // Call the superclass constructor
		this.clientUI = clientUI;
	}

	// Instance methods ************************************************

	/**
	 * This method handles all data that comes in from the server.
	 *
	 * @param msg The message from the server.
	 */
	public void handleMessageFromServer(Object msg) {
		employee e = new employee(null, null, null, null, null, null);
		i++;
		System.out.println("--> handleMessageFromServer" + i);
		System.out.println(msg);
		if (MainController.flag == 1) {

			String st;
			st = msg.toString();
			String[] result = st.split("\\s");
			System.out.println(result[0]);
			e.setFirstName(result[0].toString());

			e.setLastName(result[1]);
			e.setEid(result[2]);

			e.setEemail(result[3]);
			e.setEjob(result[4]);
			e.setEorg(result[5]);

			ee.add(e);

		}
		awaitResponse = false;

	}

	/**
	 * This method handles all data coming from the UI
	 *
	 * @param message The message from the UI.
	 */

	public void handleMessageFromClientUI(Object message) {
		try {
			openConnection();
			awaitResponse = true;
			sendToServer(message);
			// wait for response
			while (awaitResponse) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		catch (IOException e) {
			e.printStackTrace();
			clientUI.display("Could not send message to server: Terminating client." + e);
			quit();
		}
	}

	/**
	 * This method terminates the client.
	 */
	public void quit() {
		try {
			closeConnection();
		} catch (IOException e) {
		}
		System.exit(0);
	}
}
//End of ChatClient class
