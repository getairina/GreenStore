package com.UG;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main extends Application {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GreenStore");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        primaryStage.setTitle("GreenStore"); // title of window
        primaryStage.setScene(new Scene(root, 600, 800));
        primaryStage.setMinHeight(800);
        primaryStage.setMinWidth(600);

        //without lambda
//        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
//                                           @Override
//                                           public void handle(WindowEvent event) {
//                                           }
//                                       });
        primaryStage.show(); // show the actual window
    }
}
