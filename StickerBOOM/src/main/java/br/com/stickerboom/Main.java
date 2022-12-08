package br.com.stickerboom;

import br.com.stickerboom.database.CommonQueries;
import br.com.stickerboom.database.DBConnection;
import br.com.stickerboom.view.ScreenManager;
import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.SQLException;


public class Main extends Application {

    public static void main(String[] args) {
        DBConnection.build();
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        ScreenManager.build();
        ScreenManager.showMainScreenCollector();
    }
}
