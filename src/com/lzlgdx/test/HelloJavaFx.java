package com.lzlgdx.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @className: HelloJavaFx.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/01 下午 04:35
 * @Description:
 */
public class HelloJavaFx extends Application {
    @Override
    public void start(Stage primaryStage) {
        // 创建一个按钮
        Button button = new Button("点击我");

        // 设置按钮点击事件
        button.setOnAction(e -> System.out.println("Hello, JavaFX!"));

        // 创建一个根布局
        StackPane root = new StackPane();
        root.getChildren().add(button);

        // 创建场景
        Scene scene = new Scene(root, 300, 200);

        // 设置主舞台标题
        primaryStage.setTitle("简单的JavaFX应用");

        // 设置主舞台场景
        primaryStage.setScene(scene);

        // 显示主舞台
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
