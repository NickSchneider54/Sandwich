import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Sauce_Seasonings extends Application{
    
    Stage window;
    Scene scene1, scene2;
 
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        GridPane saucePane = new GridPane();
        saucePane.setHgap(5);
        saucePane.setVgap(10);
        
        //images and checkboxes
        
        CheckBox cb1 = new CheckBox("BBQ");
        CheckBox cb2 = new CheckBox("Buffalo");
        CheckBox cb3 = new CheckBox("Chipotle");
        CheckBox cb4 = new CheckBox("LightMayo");
        CheckBox cb5 = new CheckBox("Mayo");
        CheckBox cb6 = new CheckBox("Ranch");
        CheckBox cb7 = new CheckBox("Sriracha");
        CheckBox cb8 = new CheckBox("Mustard");
        
        
        //Image bbq = new Image("images/bbq.png");
//----------------------End Checks/Images---------------------------
        //First Row Images
        //saucePane.add(new ImageView("images/newbbq.png"), 0, 1);
        
        //ImageView bbq = new ImageView("images/bbq.png");
        saucePane.getChildren().add(new ImageView(new Image("image/newbbq.png")));
        //saucePane.getChildren().add(new ImageView(new Image("image/buffalo.png")));

        //First Row CheckBoxes
        saucePane.add(cb1, 0, 2);
        saucePane.add(cb2, 1, 2);
        saucePane.add(cb3, 2, 2);
        saucePane.add(cb4, 3, 2);
        saucePane.add(cb5, 4, 2);
        saucePane.add(cb6, 5, 2);
        saucePane.add(cb7, 6, 2);
        saucePane.add(cb8, 7, 2);
        
        Button button1 = new Button("Go to Seasonings");
        button1.setOnAction(e ->window.setScene(scene2));
        
        
        
        //Layout
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(saucePane, button1);
        scene1 = new Scene(layout1, 700, 200);
//---------------------End Sauces Layout 1-----------------------------------------
        //Layout 2
        GridPane seasonPane = new GridPane();
        seasonPane.setHgap(5);
        seasonPane.setVgap(10);
        Text tf = new Text("Would you Like Salt and Pepper?");
        
        RadioButton yes = new RadioButton("Yes");
        RadioButton no = new RadioButton("No");
        
        ToggleGroup bgroup = new ToggleGroup();
        yes.setToggleGroup(bgroup);
        no.setToggleGroup(bgroup);
        
        seasonPane.add(tf, 0, 0);
        seasonPane.add(yes, 0, 2);
        seasonPane.add(no, 0, 3);
        
        Button button2 = new Button("Go to Sauces");
        button2.setOnAction(e ->window.setScene(scene1));
        
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(seasonPane, button2);
        scene2 = new Scene(layout2, 400, 200);
//----------------------End Seasoning Layout 2----------------------------------------       
        window.setScene(scene1);
        window.setTitle("Sauces/Seasonings");
        
        window.show();
    }
    public static void main(String[] args) {
      launch(args);  
    }
}
