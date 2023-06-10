package com.example.aqa_tms_gui;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.Map;
import java.util.TreeMap;

public class HelloController {

    public ListView word = new ListView<>();
    public ListView translate = new ListView<>();
    public TextField inputField = new TextField();

    Map<String, String> words = new TreeMap<>();

    public void action(ActionEvent actionEvent) {

        word.getItems().clear();
        translate.getItems().clear();

        try {
            String str = inputField.getText();
            String[] temp = str.split(" ", 2);
            words.put(temp[0], temp[1]);
        } catch (Exception e) {
            System.err.println("Please word and it's translation");
        }

        inputField.clear();

        words.forEach((key, value) -> {
            word.getItems().add(key);
            translate.getItems().add(value);
        });
    }
}