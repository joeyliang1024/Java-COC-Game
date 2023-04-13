package coc.final_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;


public class COC extends Application {
    public static Stage currentStage;
    public static Scene menuScene;
    public static Scene explainScene;
    public static Scene sceneSix;
    public static Scene sceneSeven;
    public static Scene sceneFive;
    public static Scene sceneFour;
    public static Scene sceneThree;
    public static Scene sceneTwo;
    public static Scene sceneOne;
    public static Scene sceneBE;
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader8 = new FXMLLoader(COC.class.getResource("menu.fxml"));
        FXMLLoader fxmlLoader9 = new FXMLLoader(COC.class.getResource("explain.fxml"));
        FXMLLoader fxmlLoader10 = new FXMLLoader(COC.class.getResource("bad_end.fxml"));
        FXMLLoader fxmlLoader6 = new FXMLLoader(COC.class.getResource("scene6.fxml"));
        FXMLLoader fxmlLoader7 = new FXMLLoader(COC.class.getResource("scene7.fxml"));
        FXMLLoader fxmlLoader5 = new FXMLLoader(COC.class.getResource("scene5.fxml"));
        FXMLLoader fxmlLoader4 = new FXMLLoader(COC.class.getResource("scene4.fxml"));
        FXMLLoader fxmlLoader3 = new FXMLLoader(COC.class.getResource("scene3.fxml"));
        FXMLLoader fxmlLoader2 = new FXMLLoader(COC.class.getResource("scene2.fxml"));
        FXMLLoader fxmlLoader1 = new FXMLLoader(COC.class.getResource("scene1.fxml"));
        menuScene = new Scene(fxmlLoader8.load());
        explainScene = new Scene(fxmlLoader9.load());
        sceneBE = new Scene(fxmlLoader10.load());
        sceneSix = new Scene(fxmlLoader6.load());
        sceneSeven = new Scene(fxmlLoader7.load());
        sceneFive = new Scene(fxmlLoader5.load());
        sceneFour = new Scene(fxmlLoader4.load());
        sceneThree = new Scene(fxmlLoader3.load());
        sceneTwo = new Scene(fxmlLoader2.load());
        sceneOne = new Scene(fxmlLoader1.load());
        currentStage = primaryStage;
        currentStage.setTitle("常闇之廂");
        currentStage.setScene(menuScene);
        currentStage.show();
    }
}
