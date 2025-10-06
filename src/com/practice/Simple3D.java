package com.practice;

import java.awt.Color;

import javax.swing.GroupLayout.Group;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Simple3D extends Application {
    @Override
    public void start(Stage stage) {
        Sphere sphere = new Sphere(80);
        PhongMaterial mat = new PhongMaterial(Color.DARKRED);
        sphere.setMaterial(mat);

        Group root = new Group(sphere);
        PerspectiveCamera cam = new PerspectiveCamera(true);
        cam.setTranslateZ(-500);

        Scene scene = new Scene(root, 600, 400, true);
        scene.setFill(Color.BLACK);
        scene.setCamera(cam);

        // Animation (rotation)	
        RotateTransition rt = new RotateTransition(Duration.seconds(5), sphere);
        rt.setAxis(Rotate.Y_AXIS);
        rt.setByAngle(360);
        rt.setCycleCount(RotateTransition.INDEFINITE);
        rt.play();

        stage.setScene(scene);
        stage.setTitle("3D Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
