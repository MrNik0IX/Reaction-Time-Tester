package com.mrnik.view;

import java.util.List;
import java.util.stream.Stream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Primary Stage settings
		primaryStage.show();
		primaryStage.setTitle("Reactiontime Tester");
		primaryStage.setWidth(800);
		primaryStage.setHeight(900);
		
		//Menudesign
		
		//Components
		
		//Title
		Label menuTitle = new Label("Reaction-Time Tester");
		menuTitle.setId("menutitle");
		
		
		//Buttons

		//Imageviews for both images
		ImageView startImage = new ImageView(new Image(getClass().getResourceAsStream("/images/startbutton.png")));
		ImageView optionsImage = new ImageView(new Image(getClass().getResourceAsStream("/images/optionsbutton.png")));
		
		//Sizeadaptations for both images
		List.of(startImage, optionsImage).stream().forEach(i->{	
			i.setFitWidth(200);
			i.setPreserveRatio(true);
		});
		
		//Buttons with images
		Button menuStartButton = new Button("", startImage);
		Button menuOptionsButton = new Button("", optionsImage);
		
		
		
		VBox menuroot = new VBox();
		menuroot.setAlignment(Pos.TOP_CENTER);
		menuroot.setSpacing(70);
		menuroot.getChildren().addAll(menuTitle, menuStartButton, menuOptionsButton);
		
		
		
		
		Scene scene = new Scene(menuroot);
		scene.getStylesheets().add(getClass().getResource("/styles/menustyle.css").toExternalForm());
		primaryStage.setScene(scene);
	}

}
