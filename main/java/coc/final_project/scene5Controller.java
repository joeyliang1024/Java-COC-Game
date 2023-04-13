package coc.final_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class scene5Controller {
    @FXML
    AnchorPane 完整報紙;
    @FXML
    Button 報紙;
    @FXML
    Text text;
    @FXML
    Button 觀察判定1;
    @FXML
    Button seeMoreNews;
    @FXML
    public void OnBackwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneBE);//GG
    }
    @FXML
    public void OnForwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneFour);//車廂五
    }
    @FXML
    public void OnInvestigatePressed() throws IOException {
        int investigate = 0;
        investigate = (int)(Math.random()*10);
        if(investigate<=5){
            報紙.setVisible(true);
            text.setText("你在椅子下發現報紙");
        }
        觀察判定1.setVisible(false);
    }
    @FXML
    public void OnInvestigate2Pressed() throws IOException {
        int investigate = 0;
        investigate = (int)(Math.random()*10);
        if(investigate<=5){
            text.setText("你發現報紙上面的事件是和現在同一年同一天發生的事情，隨後意識到這是來自明天的報紙。");
        }
        else {
            text.setText("你認為這是一份普通的意外報導");
        }
        seeMoreNews.setVisible(false);
    }
    @FXML
    public void OnNewsPressed() throws IOException {
        完整報紙.setVisible(true);
    }
    @FXML
    public void OnFinishPressed() throws IOException {
        完整報紙.setVisible(false);
    }
    @FXML
    public void OnSeeMoreNewsPressed() throws IOException {
        觀察判定1.setVisible(true);
    }
}
