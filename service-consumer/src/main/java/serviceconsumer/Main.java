package serviceconsumer;

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

		String a = "20018";

		ServiceLoader<DisneyWorldMember> serviceLoader = null;
		try {
			serviceLoader = ServiceLoader.load(DisneyWorldMember.class);
		} catch (Throwable e) {
			e.printStackTrace();
		}

		String temp = "";
		// as iterable
		System.out.println(serviceLoader.findFirst());
		for (final var dwm : serviceLoader) {
			System.out.println(dwm.getName());
			temp += dwm.getName()+"-----";
		}

		System.out.println("----"+temp);

		Label label = new Label("----"+temp);

		VBox root = new VBox(30, label);
		root.setAlignment(Pos.CENTER);
		Scene scene = new Scene(root, 640, 480);
		stage.setScene(scene);
		stage.show();
	}
}
