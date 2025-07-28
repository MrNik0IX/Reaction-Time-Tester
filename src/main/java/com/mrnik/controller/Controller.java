package com.mrnik.controller;

import java.awt.event.ActionListener;

import com.mrnik.view.View;



public class Controller {
	
	public Controller(View view){
		
	view.menuStartButton.setOnAction(startEvent->{
		
	view.scene.setRoot(view.gameTurtorialRoot);	
	});
	
	view.turtorialOkButton.setOnAction(okButtonEvent->view.scene.setRoot(view.gameRoot));
		
	}
	}
