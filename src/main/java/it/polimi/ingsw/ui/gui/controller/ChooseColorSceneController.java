package it.polimi.ingsw.ui.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class ChooseColorSceneController {

	@FXML
	private ImageView button_green;

	@FXML
	private ImageView button_red;

	@FXML
	private ImageView button_blue;

	@FXML
	private ImageView button_next;

	@FXML
	private ImageView button_exit;

	@FXML
	private Text text_player;

	private String namePlayer = "sdfhjsjdflksdflksdf"; //only as example. //max 19

	Image buttonNextPressed = new Image("/img/home_next_btn_pressed.png");
	Image buttonNext = new Image("/img/home_next_btn.png");
	Image buttonExitPressed = new Image("/img/home_exit_btn_pressed.png");
	Image buttonExit = new Image("/img/home_exit_btn.png");
	Image buttonRedPressed = new Image("/img/color_btn_coral_pressed.png");
	Image buttonRed = new Image("/img/color_red_btn.png");
	Image buttonGreenPressed = new Image("/img/color_btn_green_pressed.png");
	Image buttonGreen = new Image("/img/color_green_btn.png");
	Image buttonBluePressed = new Image("/img/color_btn_blue_pressed.png");
	Image buttonBlue = new Image("/img/color_blue_btn.png");

	public void initialize(){
		text_player.setFont(Font.loadFont(getClass().getResourceAsStream("/fonts/LillyBelle.ttf"), 34));
		text_player.setText(namePlayer);
	}

	private String setNamePlayer() {
		//TODO:...
		return namePlayer;
	}


	public void mousePressedRed(MouseEvent mouseEvent) {
		button_red.setImage(buttonRedPressed);
		button_green.setImage(buttonGreen);
		button_blue.setImage(buttonBlue);
	}

	public void mouseReleasedRed(MouseEvent mouseEvent) {
		button_red.setImage(buttonRedPressed);
	}

	public void mousePressedGreen(MouseEvent mouseEvent) {
		button_green.setImage(buttonGreenPressed);
		button_blue.setImage(buttonBlue);
		button_red.setImage(buttonRed);
	}

	public void mouseReleasedGreen(MouseEvent mouseEvent) {
		button_green.setImage(buttonGreenPressed);
	}

	public void mousePressedBlue(MouseEvent mouseEvent) {
		button_blue.setImage(buttonBluePressed);
		button_red.setImage(buttonRed);
		button_green.setImage(buttonGreen);
	}

	public void mouseReleasedBlue(MouseEvent mouseEvent) {
		button_blue.setImage(buttonBluePressed);
	}

	public void mousePressedNext(MouseEvent mouseEvent) {
		button_next.setImage(buttonNextPressed);
	}

	public void mouseReleasedNext(MouseEvent mouseEvent) {
		button_next.setImage(buttonNext);
	}

	public void mousePressedExit(MouseEvent mouseEvent) {
		button_exit.setImage(buttonExitPressed);
	}

	public void mouseReleasedExit(MouseEvent mouseEvent) {
		button_exit.setImage(buttonExit);
	}
}
