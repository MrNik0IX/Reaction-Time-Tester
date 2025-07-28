package com.mrnik.view;


import java.util.List;
import java.util.stream.Stream;

import com.mrnik.controller.Controller;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class View extends Application{
	

	
	
	//Components for the menuroot
	public VBox menuroot = new VBox();
	public Label menuTitle = new Label("Reaction-Time Tester");
	
	//Buttons with images
	public Button menuStartButton = new Button("");
	public Button menuOptionsButton = new Button("");
		
	
	//Components for the game turtorial root
	public VBox gameTurtorialRoot = new VBox();
	
	public Label gameTurtorialTitle = new Label("How to test?");
	public Label declarationText = new Label("Press enter once you see the red and greencolor on the circles at the same time.");
	
	public Button turtorialOkButton = new Button("Start Test");
	
	
	//Components for the game root
	public GridPane gameRoot = new GridPane();
	
	public Label gameTitle = new Label("Reaction Test");
	public Circle circle = new Circle();
	
	
	
	public Scene scene = new Scene(menuroot);
	
	Controller viewController = new Controller(this);
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Css linking
		scene.getStylesheets().add(getClass().getResource("/styles/menustyle.css").toExternalForm());
		
		//Primary Stage settings
		primaryStage.show();
		primaryStage.setTitle("Reactiontime Tester");
		primaryStage.setWidth(800);
		primaryStage.setHeight(900);
		primaryStage.setScene(scene);
		
		
		
		
		
		//Menudesign
		
		//Title		
		menuTitle.getStyleClass().add("title");
		
		
		//Buttons
		
		//Imageviews for both buttons
		ImageView startImage = new ImageView(new Image(getClass().getResourceAsStream("/images/startbutton.png")));
		ImageView optionsImage = new ImageView(new Image(getClass().getResourceAsStream("/images/optionsbutton.png")));
		
		//Sizeadaptations for both images
		List.of(startImage, optionsImage).stream().forEach(i->{	
			i.setFitWidth(200);
			i.setPreserveRatio(true);
			
		});
		menuStartButton.setGraphic(startImage);
		menuOptionsButton.setGraphic(optionsImage);
		menuStartButton.getStyleClass().add("menuButton");
		menuOptionsButton.getStyleClass().add("menuButton");
		//Menuroot design
		menuroot.setAlignment(Pos.TOP_CENTER);
		menuroot.setSpacing(70);
		menuroot.getChildren().addAll(menuTitle, menuStartButton, menuOptionsButton);
		
		
		
		//Gameturtorial design
		
		//Label designs
		
		//title design
		gameTurtorialTitle.getStyleClass().add("title");
		 
		//Declarationtext design
		declarationText.setId("declarationText");
		
		//Gameturtorialroot design
		gameTurtorialRoot.setAlignment(Pos.TOP_CENTER);
		gameTurtorialRoot.setSpacing(60);
		gameTurtorialRoot.getChildren().addAll(gameTurtorialTitle, declarationText, turtorialOkButton);
		
		
		
		
		
		
		//Gamepage design
		
		//title design
		gameTitle.getStyleClass().add("title");
		
		//Gamepage root design
		circle.setRadius(50.0f);
		gameRoot.setHgap(200);
		gameRoot.setVgap(100);
		gameRoot.add(gameTitle,1,0);
		gameRoot.add(circle,1,1);
		
	}

}
