package serviceconsumer;

import bean.Person;
import com.alibaba.fastjson.JSON;
import disneyworld.service.DisneyWorldMember;

import java.util.ServiceLoader;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application  {

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		String temp = "{\"age\":22,\"name\":\"A\"}";


		Person person = JSON.parseObject(temp, Person.class);
		System.out.println(person);

		System.out.println("----"+temp);

		Label label = new Label("----"+person.getName());

		VBox root = new VBox(30, label);
		root.setAlignment(Pos.CENTER);
		Scene scene = new Scene(root, 640, 480);
		stage.setScene(scene);
		stage.show();
	}
}
