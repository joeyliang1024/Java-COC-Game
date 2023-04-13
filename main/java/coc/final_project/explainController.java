package coc.final_project;

import javafx.fxml.FXML;

import java.io.IOException;

public class explainController {
    @FXML
    public void OnBackPressed() throws IOException {
        COC.currentStage.setScene(COC.menuScene);
    }
}
