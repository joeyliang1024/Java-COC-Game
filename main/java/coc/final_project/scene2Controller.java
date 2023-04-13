package coc.final_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;

public class scene2Controller {
    //有無手電筒
    boolean flashlight=true;
    //是否瘋狂
    boolean crazy=false;
    @FXML
    Button openflashligh;
    @FXML
    Text text;
    @FXML
    ImageView background;
    @FXML
    ImageView background2;
    @FXML
    ImageView clicker;
    @FXML
    Button San;
    @FXML
    Button through;
    @FXML
    Button agile;


    @FXML
    public void OnBackwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneBE);//GG
    }
    @FXML
    public void OnForwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneOne);//車廂一
    }

    //開啟手電筒
    @FXML
    public void OnflashlightPressed() throws IOException {
        background2.setVisible(false);
        background.setVisible(true);
        clicker.setOpacity(1);
        if(crazy==true){
            text.setText("一陣寒意從背後襲來，你看到了一個面部畸形的怪物站在車廂中央，你的理智在瘋狂地否定這種生物存在的事實，但印入眼簾的現實卻讓你無法逃避，你的腦子裡只剩下了逃跑兩字。");
            San.setVisible(true);
        }
        else{
            text.setText("畫面變亮，顯示在畫面變亮的瞬間，一陣寒意從背後襲來" +
                    "，你看到了一個面部畸形的怪物站在車廂中央，你的理智在瘋狂地否定這種生物存在的事實，但印入眼簾的現實卻讓你無法逃避，他沒有眼睛，似乎對光不太敏感。");
            through.setVisible(true);
        }
    }

    //默默通過車廂
    @FXML
    public void OnthroughPressed() throws IOException {
        through.setVisible(false);
        openflashligh.setVisible(false);
        agile.setVisible(true);
    }







}
