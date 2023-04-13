package coc.final_project;

import javafx.fxml.FXML;

import java.io.IOException;

public class menuController {
    @FXML
    public void OnStartPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneSix);
    }
    @FXML
    public void OnExplainPressed() throws IOException {
        COC.currentStage.setScene(COC.explainScene);
    }
    @FXML
    public void OnExitPressed() throws IOException{
        COC.currentStage.close();
    }
}
