package application;

import java.io.IOException;

import Server.employee;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class llll extends Application {
	@FXML
	private PasswordField job;
	@FXML
	private Button show;
	///////////////Sharif
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/lll.fxml"));

		Scene scene = new Scene(root);
		primaryStage.setTitle("Student Managment Tool");
		primaryStage.setScene(scene);

		primaryStage.show();
	//System.out.println(job.getText());	
	}

	public void OnBtnClick()
	{
		System.out.println(job.getText());
	}
	public static void main(String[] args) {
		launch(args);
	}
}
