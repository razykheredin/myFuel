package application;

import java.io.IOException;

import client.ClientUI;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController extends Application {
public static int flag=0;
	@FXML
	private Button btnExit = null;
	@FXML
	private Button btnDone = null;
	@FXML
	private Label lbllist;

	@FXML
	private TextField portxt;
	ObservableList<String> list;

	


public void ShowBtn(ActionEvent event) throws Exception {
	
	ClientUI.chat.accept("client choose to see table");
	flag=1;
	 ClientUI.chat.accept("getdata");
	((javafx.scene.Node) event.getSource()).getScene().getWindow().hide();
	flag=0;
	FXMLLoader loader = new FXMLLoader();
	Stage primaryStage = new Stage();
	Pane root = loader.load(getClass().getResource("/application/TableInterface.fxml").openStream());
	Scene scene = new Scene(root);
	primaryStage.setTitle("Student Managment Tool");
	primaryStage.setScene(scene);
	primaryStage.show();
}
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/MainInterface.fxml"));

		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("/gui/ServerPort.css").toExternalForm());
		primaryStage.setTitle("Client");
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	public void OnExitBtn(ActionEvent event)
	{
		ClientUI.chat.accept("client choose to Exit");
		((javafx.scene.Node) event.getSource()).getScene().getWindow().hide();
	}
}
