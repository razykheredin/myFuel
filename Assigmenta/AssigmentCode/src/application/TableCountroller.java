package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import Server.EchoServer;
import Server.employee;
import client.ChatClient;
import client.ClientUI;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jwright
 */
public class TableCountroller extends Application implements Initializable {

	// configure the table
	@FXML
	private TableView<employee> tableView;
	@FXML
	private TableColumn<employee, String> firstNameColumn;
	@FXML
	private TableColumn<employee, String> lastNameColumn;
	@FXML
	private TableColumn<employee, String> id;
	@FXML
	private TableColumn<employee, String> email;
	@FXML
	private TableColumn<employee, String> job;
	@FXML
	private TableColumn<employee, String> org;
	@FXML
	private Button btnDone = null;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// set up the columns in the table
		firstNameColumn.setCellValueFactory(new PropertyValueFactory<employee, String>("firstName"));
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<employee, String>("lastName"));
		id.setCellValueFactory(new PropertyValueFactory<employee, String>("Eid"));
		email.setCellValueFactory(new PropertyValueFactory<employee, String>("Eemail"));
		job.setCellValueFactory(new PropertyValueFactory<employee, String>("Ejob"));
		org.setCellValueFactory(new PropertyValueFactory<employee, String>("Eorg"));
		job.setCellFactory(TextFieldTableCell.forTableColumn());
		tableView.setItems(ChatClient.ee);

		// Update the table to allow for the first and last name fields
		// to be editable
		tableView.setEditable(true);

		// Disable the detailed employee view button until a row is selected

	}

	/**
	 * This method will create a new employee object and add it to the table
	 */

	/**
	 * This method will return an ObservableList of People objects
	 * 
	 * @throws SQLException
	 */

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/MainInterface.fxml"));

		Scene scene = new Scene(root);
		primaryStage.setTitle("Student Managment Tool");
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void OnBackBtn(ActionEvent event) throws IOException {
		tableView.getItems().clear();
		ClientUI.chat.accept("client choose to go Back");
		((javafx.scene.Node) event.getSource()).getScene().getWindow().hide();
		FXMLLoader loader = new FXMLLoader();
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/application/MainInterface.fxml").openStream());
		Scene scene = new Scene(root);
		primaryStage.setTitle("Client");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void OnChangedJob(TableColumn.CellEditEvent<employee, String> productStringCellEditEvent)
			throws SQLException {

		ClientUI.chat.accept("client choose to change the job for the worker the id '"
				+ productStringCellEditEvent.getRowValue().getEid() + "' to '"
				+ productStringCellEditEvent.getNewValue() + "'");
		ClientUI.chat.accept("change " + productStringCellEditEvent.getRowValue().getEid() + " "
				+ productStringCellEditEvent.getNewValue());
		System.out.println("change " + productStringCellEditEvent.getRowValue().getEid() + " "
				+ productStringCellEditEvent.getNewValue());
	}

}