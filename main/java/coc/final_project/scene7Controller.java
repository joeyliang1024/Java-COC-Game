package coc.final_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import java.util.Random;

import java.io.IOException;

public class scene7Controller {
    String checkType = "";
    int pt = 0;
    int bonus = 0;
    int check = 60;
    int num = 0;
    boolean success = false;
    @FXML
    ImageView normal;
    @FXML
    ImageView hurt;
    @FXML
    ImageView crazy;
    @FXML
    ImageView crazyHurt;
    @FXML
    Button 判定;
    @FXML
    Text text;
    @FXML
    Button 觀察後半車廂;
    @FXML
    Button 觀察屍塊;

    @FXML
    public void OnBackwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneBE);//GG
    }
    @FXML
    public void OnForwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneSix);//車廂六
    }
    @FXML
    public void OnObservePressed() throws IOException {
        text.setText("請骰觀察判定");
        判定.setVisible(true);
        checkType = "觀察判定";
        判定.setText("觀察判定");
        num = 1;
        觀察後半車廂.setVisible(false);
    }
    @FXML
    public void OnDeadbodyPressed() throws IOException {
        text.setText("請骰醫學判定");
        判定.setVisible(true);
        checkType = "醫學判定";
        判定.setText("醫學判定");
        num = 2;
        觀察屍塊.setVisible(false);
    }
    @FXML
    public void OnCheckPressed() throws IOException {
        pt = roll();
        success = checking(checkType,pt,bonus,check);
        判定.setVisible(false);
        if(success){
            if(num == 1){
                text.setText("你發現7號車輛深處有著巨大類似嘴巴的東西正在啃蝕車廂，可以理解那是某個比電車還要巨大的存在，由於看見了這個畫面做一個成功減1d3失敗減1d6的san check");
                判定.setVisible(true);
                checkType = "san check";
                判定.setText("san check");
                check = 60;//=san
                num = 3;
            }
            else if(num == 2){
                text.setText("你意識到這些屍塊的死亡時間並不長");
            }
            else if(num == 3){
                //減少San值
            }
        }
        else{
            if(num == 1){
                text.setText("你無法看清黑霧後面是甚麼");
            }
            else if(num == 2){
                text.setText("你的醫學知識並不足以讓你看出屍塊有任何端倪");
            }
            else if(num == 3){
            }
        }
    }
    //擲骰
    public static int roll(){
        Random rd = new Random();
        int pt = rd.nextInt(99) + 1;
        return pt;
    }

    //判定
    private boolean checking(String 判定項目,int pt,int bonus,int check) {
        int temp = check + bonus;
        if(pt <= check+bonus){
            text.setText(判定項目+": "+pt+"<="+temp+'\n'+"判定成功");
            return true;
        }
        else{
            text.setText(判定項目+": "+pt+"<="+temp+'\n'+"判定失敗");
            return false;
        }
    }
}
