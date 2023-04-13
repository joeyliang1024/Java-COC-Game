package coc.final_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
public class scene1Controller {
    //有無鑰匙
    boolean key=true;
    //男人有無同行
    boolean man=true;
    statue statue = new statue();
    @FXML
    Text text;
    @FXML
    Button ignore;
    @FXML
    Button stop;
    @FXML
    Button Check;
    @FXML
    Button up;
    @FXML
    Button down;
    @FXML
    Button open;
    @FXML
    ImageView BE;
    @FXML
    Button back;

    @FXML
    public void OnBackwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneBE);//GG
    }
    //檢查面板
    @FXML
    public void OnCheckPressed() throws IOException {
        if(key==false && man == false){
            text.setText("沒有鑰匙的你只能發呆般地看著面板發呆，一段時間後你聽到了咀嚼的聲音，你的意識慢慢變得模糊。你死了。");
            Check.setVisible(false);
            BE.setVisible(true);
            back.setVisible(true);
            statue.setBe(1);
        }
        else if(key==false && man==true){
            text.setText("在你們走進車廂後，男人迅速的拿出了鑰匙打開了操作面版有些癲狂的說:「我們快停下電車吧。」他想將拉桿往上推。");
            ignore.setVisible(true);
            stop.setVisible(true);
            Check.setVisible(false);
        }
        else {
            text.setText("你手中握有鑰匙");
            open.setVisible(true);
            Check.setVisible(false);
        }
    }

    //無視他
    @FXML
    public void OnignorePressed() throws IOException {
        text.setText("男人停下了電車。");
        BE.setVisible(true);
        back.setVisible(true);
        statue.setBe(1);
    }

    //阻止他
    @FXML
    public void OnstopPressed() throws IOException {
        text.setText("你成功阻止了他，把他拉倒在地。");
        ignore.setVisible(false);
        stop.setVisible(false);
        up.setVisible(true);
        down.setVisible(true);
    }

    //打開控制面板
    @FXML
    public void OnopenPressed() throws IOException {
        open.setVisible(false);
        up.setVisible(true);
        down.setVisible(true);
    }

    //往上拉
    @FXML
    public void OnupPressed() throws IOException {
        text.setText("你將電車加速了。");
    }

    //往下拉
    @FXML
    public void OndownPressed() throws IOException{
        COC.currentStage.setScene(COC.sceneBE);//GG
        statue.setBe(1);

    }

    //回到標題畫面
    @FXML
    public void OnbackPressed() throws IOException {
        COC.currentStage.setScene(COC.menuScene);
    }
}
