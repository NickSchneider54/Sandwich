import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *  Developers: Nick Schneider, Rachel Myers, Chance Battles
 *  Program:    Group Project 2: Sub Ordering System
 *  Purpose:    To Create a GUI for Subway's Online Ordering Service.
 */
public class SandiwchOrdering extends Application {
    Scene sceneBread, sceneCheese, sceneConfirm, sceneSeasonings, sceneSauces, sizeScene, meatScene, veggieScene;
    
    static String selectedVeggies = "", selectedSauces = "", selectedMeat = "", selectedBread = "", selectedSeasoning = "",
            selectedSize = "", selectedCheese = "";
    
    @Override
    public void start(Stage primaryStage) {
/**
 * 
 * BEGIN ORDER / SELECT SIZE
 * 
 * 
 */ 
        GridPane sizePane = new GridPane();
        sizePane.setHgap(10);
        sizePane.setVgap(10);
        
        ToggleGroup sizeGroup = new ToggleGroup();
        RadioButton rbSmall = new RadioButton("6 inch");
        RadioButton rbLarge = new RadioButton("Foot Long");
        Text begin = new Text("Begin Your Order");
        begin.setStyle("-fx-font: 24 arial;");
        
        
        rbSmall.setToggleGroup(sizeGroup);
        rbLarge.setToggleGroup(sizeGroup);
        
        sizePane.add(begin, 0, 0);
        sizePane.add(new Text("Select Your Sandwich Size"), 0, 2);
        sizePane.add(rbSmall, 0, 4);
        sizePane.add(rbLarge, 1, 4);
        
        //add next button to go to bread selection
        Button btToBread = new Button("Next");
              
        sizePane.add(btToBread, 2, 6);
        
        sizeScene = new Scene(sizePane, 555, 400);

/**
 * 
 * 
 * BREAD SECTION
 * 
 */
        //create gridpane for bread options
        GridPane paneForBread = new GridPane();
        paneForBread.setHgap(10);
        paneForBread.setVgap(5);
        
        //Create next and previous buttons for Bread scene
        Button btPreviousBread = new Button("Previous");
        Button btNextBread = new Button("Next");        
        btPreviousBread.setOnAction(e -> primaryStage.setScene(sizeScene));
        
        
        //create bread radiobuttons
        RadioButton rbBreadGrain = new RadioButton("Grain Wheat");
        RadioButton rbBreadItalian = new RadioButton("Italian");
        RadioButton rbBreadItalianHerbs = new RadioButton("Italian Herbs and Cheese");
        RadioButton rbBreadMultiGrain = new RadioButton("Multi-grain Flatbread");
        RadioButton rbBreadSunflower = new RadioButton("Sunflower Crunch");
        
        //add bread images to pane
        paneForBread.add(new ImageView("images/breadGrainWheat.png"), 0, 0);
        paneForBread.add(new ImageView("images/breadGrainWheat.png"), 1, 0);
        paneForBread.add(new ImageView("images/breadGrainWheat.png"), 2, 0);
        paneForBread.add(new ImageView("images/breadGrainWheat.png"), 0, 2);
        paneForBread.add(new ImageView("images/breadGrainWheat.png"), 1, 2);
       
        
        //add next and previous buttons
        paneForBread.add(btPreviousBread, 0, 4);
        paneForBread.add(btNextBread, 2, 4);
        
        paneForBread.add(rbBreadGrain, 0, 1);
        paneForBread.add(rbBreadItalian, 1, 1);
        paneForBread.add(rbBreadItalianHerbs, 2, 1);
        paneForBread.add(rbBreadMultiGrain, 0, 3);
        paneForBread.add(rbBreadSunflower, 1, 3);
        
        //add bread radio buttons to togglegroup
        ToggleGroup group = new ToggleGroup();
        rbBreadGrain.setToggleGroup(group);
        rbBreadItalian.setToggleGroup(group);
        rbBreadItalianHerbs.setToggleGroup(group);
        rbBreadMultiGrain.setToggleGroup(group);
        rbBreadSunflower.setToggleGroup(group);
        
        //set scene for bread
        sceneBread = new Scene(paneForBread, 550, 400);

/**
 * 
 * 
 * MEAT SECTION
 * 
 */          

        GridPane meatPane = new GridPane();
        meatPane.setHgap(10);
        meatPane.setVgap(5);
        
        ToggleGroup meatGroup = new ToggleGroup();        
        RadioButton rbBacon = new RadioButton("Bacon");  
        RadioButton rbHam = new RadioButton("Black Forest Ham");
        RadioButton rbChicken = new RadioButton("Chicken Strips");
        RadioButton rbSalami = new RadioButton("Genoa Salami");
        RadioButton rbPepperoni = new RadioButton("Pepperoni");
        RadioButton rbSteak = new RadioButton("Shaved Steak");
        
        rbBacon.setToggleGroup(meatGroup);
        rbHam.setToggleGroup(meatGroup);
        rbChicken.setToggleGroup(meatGroup);
        rbSalami.setToggleGroup(meatGroup);
        rbPepperoni.setToggleGroup(meatGroup);
        rbSteak.setToggleGroup(meatGroup);   
        
        //add meat radio buttons to pane
        meatPane.add(rbBacon, 0, 1);       
        meatPane.add(rbHam, 1, 1);       
        meatPane.add(rbChicken, 2, 1);       
        meatPane.add(rbSalami, 0, 3);        
        meatPane.add(rbPepperoni, 1, 3);       
        meatPane.add(rbSteak, 2, 3); 
        
        //add meat images to pane
        meatPane.add(new ImageView("images/bacon.png"), 0, 2);
        meatPane.add(new ImageView("images/ham.png"), 1, 2);
        meatPane.add(new ImageView("images/chicken.png"), 2, 2);
        meatPane.add(new ImageView("images/salami.png"), 0, 4);
        meatPane.add(new ImageView("images/pepperoni.png"), 1, 4);
        meatPane.add(new ImageView("images/steak.png"), 2, 4);
        
        Button btBackToBread = new Button ("Previous");
        Button btToCheese= new Button("Next");
        
        btBackToBread.setOnAction(e ->primaryStage.setScene(sceneBread));
        
        meatPane.add(btBackToBread, 0, 6);
        meatPane.add(btToCheese, 2, 6);
        
        ScrollPane meatScrollPane = new ScrollPane(meatPane);
        
        meatScene = new Scene(meatScrollPane, 555, 400);
                
          
/**
 * 
 * 
 * CHEESE SECTION
 * 
 */        
        
        
        //create cheese section
        GridPane paneForCheese = new GridPane();
        paneForCheese.setHgap(10);
        paneForCheese.setVgap(5);
        paneForCheese.setStyle("-fx-background-color: white;");
        
        RadioButton rbCheeseAmerican = new RadioButton("White American");
        RadioButton rbCheeseMonterey = new RadioButton("Monterey Cheddar");
        RadioButton rbCheeseMozarella = new RadioButton("Shredded Mozarella");
        RadioButton rbCheesePepperJack = new RadioButton("Pepper Jack");
        RadioButton rbCheeseProvolone = new RadioButton("Provolone");
        RadioButton rbCheeseSwiss = new RadioButton("Swiss");
        
        //add cheese images to pane
        paneForCheese.add(new ImageView("images/cheeseAmerican.png"), 0, 0);
        paneForCheese.add(new ImageView("images/cheeseMontereyCheddar.png"), 1, 0);
        paneForCheese.add(new ImageView("images/cheeseMozarella.png"), 2, 0);
        paneForCheese.add(new ImageView("images/cheesePepperJack.png"), 0, 2);
        paneForCheese.add(new ImageView("images/cheeseProvolone.png"), 1, 2);
        paneForCheese.add(new ImageView("images/cheeseSwiss.png"), 2, 2);
        
        //add cheese radio buttons to pane
        paneForCheese.add(rbCheeseAmerican, 0, 1);
        paneForCheese.add(rbCheeseMonterey, 1, 1);
        paneForCheese.add(rbCheeseMozarella, 2, 1);
        paneForCheese.add(rbCheesePepperJack, 0, 3);
        paneForCheese.add(rbCheeseProvolone, 1, 3);
        paneForCheese.add(rbCheeseSwiss, 2, 3);
        
        //create toggle group for cheese radio buttons
        ToggleGroup groupCheese = new ToggleGroup();
        rbCheeseAmerican.setToggleGroup(groupCheese);
        rbCheeseMonterey.setToggleGroup(groupCheese);
        rbCheeseMozarella.setToggleGroup(groupCheese);
        rbCheesePepperJack.setToggleGroup(groupCheese);
        rbCheeseProvolone.setToggleGroup(groupCheese);
        rbCheeseSwiss.setToggleGroup(groupCheese);
        
        //Create next and previous buttons for Cheese scene
        Button btPreviousCheese = new Button("Previous");
        Button btNextCheese = new Button("Next");
        
        btPreviousCheese.setOnAction(e -> primaryStage.setScene(meatScene));
        paneForCheese.add(btPreviousCheese, 0, 4);
        paneForCheese.add(btNextCheese, 2, 4);
                
        //set Cheese scene
         sceneCheese = new Scene(paneForCheese, 550, 400);

 /**
 * 
 * 
 * VEGGIES SECTION
 * 
 */          

        GridPane veggiePane = new GridPane();
        sizePane.setHgap(10);
        sizePane.setVgap(5);
        
        CheckBox cbBananaPeppers = new CheckBox("Banana Peppers");
        CheckBox cbBlackOlives = new CheckBox("Black Olives");
        CheckBox cbCucumbers = new CheckBox("Cucumbers");
        CheckBox cbGreenPeppers = new CheckBox("GreenPeppers");
        CheckBox cbJalapenos = new CheckBox("Jalapenos");
        CheckBox cbLettuce = new CheckBox("Lettuce");
        CheckBox cbPickles = new CheckBox("Pickles");
        CheckBox cbRedOnions = new CheckBox("RedOnions");
        CheckBox cbSpinach = new CheckBox("Spinach");        
        CheckBox cbTomatoes = new CheckBox("Tomatoes");
        
        //add veggie check boxes to pane
        veggiePane.add(cbBananaPeppers, 0, 1);       
        veggiePane.add(cbBlackOlives, 1, 1);       
        veggiePane.add(cbCucumbers, 2, 1);     
        veggiePane.add(cbGreenPeppers, 3, 1);       
        veggiePane.add(cbJalapenos, 0, 3);       
        veggiePane.add(cbLettuce, 1, 3);       
        veggiePane.add(cbPickles, 2, 3);       
        veggiePane.add(cbRedOnions, 3, 3);
        veggiePane.add(cbSpinach, 0, 5);
        veggiePane.add(cbTomatoes, 1, 5);
        
        //add veggie images to pane
        veggiePane.add(new ImageView("images/bananaPeppers.png"), 0, 0);
        veggiePane.add(new ImageView("images/blackOlive.png"), 1, 0);
        veggiePane.add(new ImageView("images/cucumber.png"), 2, 0);
        veggiePane.add(new ImageView("images/greenPeppers.png"), 3, 0);
        veggiePane.add(new ImageView("images/jalapenos.png"), 0, 2);
        veggiePane.add(new ImageView("images/lettuce.png"), 1, 2);
        veggiePane.add(new ImageView("images/pickles.png"), 2, 2);
        veggiePane.add(new ImageView("images/redOnions.png"), 3, 2);
        veggiePane.add(new ImageView("images/spinach.png"), 0, 4);
        veggiePane.add(new ImageView("images/tomatoes.png"), 1, 4);
        
        //create next and previous buttons
        Button btCheese = new Button("Previous");
        btCheese.setOnAction(e ->primaryStage.setScene(sceneCheese));
        Button btToSauces = new Button("Next");
        
       
        
        //add next and previous buttons to pane
        veggiePane.add(btCheese, 0, 7);
        veggiePane.add(btToSauces, 2, 7);
        
        ScrollPane veggieScrollPane = new ScrollPane(veggiePane);
             
        veggieScene = new Scene(veggieScrollPane, 755, 400); 
 
 
        
 /**
 * 
 * 
 * SAUCES SECTION
 * 
 */          
        
        
        GridPane saucePane = new GridPane();
        saucePane.setHgap(10);
        saucePane.setVgap(5);
        
        //images and checkboxes
        
        CheckBox cb1 = new CheckBox("BBQ");
        CheckBox cb2 = new CheckBox("Buffalo");
        CheckBox cb3 = new CheckBox("Chipotle");
        CheckBox cb4 = new CheckBox("LightMayo");
        CheckBox cb5 = new CheckBox("Mayo");
        CheckBox cb6 = new CheckBox("Ranch");
        CheckBox cb7 = new CheckBox("Sriracha");
        CheckBox cb8 = new CheckBox("Mustard");     
        

        //Add CheckBoxes to pane
        saucePane.add(cb1, 0, 1);
        saucePane.add(cb2, 1, 1);
        saucePane.add(cb3, 2, 1);
        saucePane.add(cb4, 0, 3);
        saucePane.add(cb5, 1, 3);
        saucePane.add(cb6, 2, 3);
        saucePane.add(cb7, 0, 5);
        saucePane.add(cb8, 1, 5);
        
        //add sauce images to pane
        saucePane.add(new ImageView("images/newbbq.png"), 0, 0);
        saucePane.add(new ImageView("images/buffalo.png"), 1, 0);
        saucePane.add(new ImageView("images/chipotle.png"), 2, 0);
        saucePane.add(new ImageView("images/lightmayo.png"), 0, 2);
        saucePane.add(new ImageView("images/mayo.png"), 1, 2);
        saucePane.add(new ImageView("images/ranch.png"), 2, 2);
        saucePane.add(new ImageView("images/sriracha.png"), 0, 4);
        saucePane.add(new ImageView("images/mustard.png"), 1, 4);
        
        Button btVeggies = new Button("Previous");
        saucePane.add(btVeggies, 0, 6);
        btVeggies.setOnAction(e ->primaryStage.setScene(veggieScene));
        Button btSeasonings = new Button("Next");
        saucePane.add(btSeasonings, 2, 6);
        
        ScrollPane sauceScrollPane = new ScrollPane(saucePane);
        
        

        sceneSauces = new Scene(sauceScrollPane, 555, 400);
//---------------------End Sauces Layout 1-----------------------------------------
 

/**
 * 
 * 
 * 
 * SEASONINGS SECTION
 */


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
        
        Button btSauces = new Button("Previous");
        btSauces.setOnAction(e ->primaryStage.setScene(sceneSauces));
        seasonPane.add(btSauces, 0, 4);
        Button btConfirm = new Button("Next");
        
        seasonPane.add(btConfirm, 1, 4);

        sceneSeasonings = new Scene(seasonPane, 555, 400);
//----------------------End Seasoning Layout 2----------------------------------------       
       
        primaryStage.setTitle("Sauces/Seasonings");
        
        primaryStage.show();        
 
 /**
 * 
 * 
 * CONFIRM ORDER SECTION
 * 
 */       
       
        
        //create Confirm window
        GridPane paneConfirm = new GridPane();
        paneConfirm.setHgap(5);
        paneConfirm.setVgap(10);
        
        paneConfirm.add(new Label("Confirm Your Order"), 0, 0);
        paneConfirm.add(new Label("Size: "), 0, 1);
        paneConfirm.add(new Label("Bread: "), 0, 2);
        paneConfirm.add(new Label("Meat: "), 0, 3);
        paneConfirm.add(new Label("Cheese: "), 0, 4);
        paneConfirm.add(new Label("Veggies: "), 0, 5);
        paneConfirm.add(new Label("Sauces: "), 0, 6);   
        paneConfirm.add(new Label("Salt/Pepper: "), 0, 7);
             
        
        //Create next and previous buttons for Confirm scene
        Button btPreviousConfirm = new Button("Previous");
        paneConfirm.add(btPreviousConfirm, 0, 9);
        btPreviousConfirm.setOnAction(e -> primaryStage.setScene(sceneSeasonings));
 
        
/**
 * 
 * 
 * 
 * ****************   METHODS FOR POPULATING VALUES ON CONFIRM SCENE   ***********
 */      
        
        //set actions for size buttons    
        VBox sizeLayout = new VBox(1);
        Label textSize = new Label();
        
        btToBread.setOnAction(e ->{
            primaryStage.setScene(sceneBread);               
                                
            if (rbSmall.isSelected()) {
              selectedSize = "Six Inch";              
            }
            
            if (rbLarge.isSelected()) {
              selectedSize = "Foot Long";
            }
            
            textSize.setText(selectedSize);
          });   
        
        sizeLayout.getChildren().add(textSize);        
        paneConfirm.add(sizeLayout, 1, 1);
            
       
         //set actions for bread radio buttons
		VBox breadLayout = new VBox(1);
        Label textBread = new Label();
		
	btNextBread.setOnAction(e ->{ 
            primaryStage.setScene(meatScene);
        
            if (rbBreadGrain.isSelected()) {
                selectedBread = "Grain Wheat";                
            }          
                
            if (rbBreadItalian.isSelected()) {   
              selectedBread =  "Italian";
              
            }         
                
            if (rbBreadItalianHerbs.isSelected()) {
              selectedBread = "Italian Herbs and Cheese";;
            }               
       
            if (rbBreadMultiGrain.isSelected()) {
              selectedBread = "Multi-grain Flatbread";
            }         
                
            if (rbBreadSunflower.isSelected()) {
              selectedBread = "Sunflower Crunch";
            }
			
          textBread.setText(selectedBread);
        });
		
	breadLayout.getChildren().add(textBread);
        paneConfirm.add(breadLayout, 1, 2);
        
        
       
        //set radio button actions for meat  
	VBox meatLayout = new VBox(1);
        Label textMeat = new Label();
		
        btToCheese.setOnAction(e ->{
	primaryStage.setScene(sceneCheese);
			
            if (rbHam.isSelected()) {
              selectedMeat = "Black Forest Ham";
            }
            if (rbChicken.isSelected()) {
              selectedMeat = "Chicken Strips";
            }
            if (rbSalami .isSelected()) {
              selectedMeat = "Genoa Salami";
            }
            if (rbPepperoni.isSelected()) {
              selectedMeat = "Pepperoni";
            }
            if (rbSteak.isSelected()) {
              selectedMeat = "Shaved Steak";
            }
			textMeat.setText(selectedMeat);
        });
		  
	meatLayout.getChildren().add(textMeat);  
        paneConfirm.add(meatLayout, 1, 3);
        
        
        //set radio button actions for cheeses
	VBox cheeseLayout = new VBox(1);
        Label textCheese = new Label();
		
        btNextCheese.setOnAction(e ->{
	primaryStage.setScene(veggieScene);
			
            if (rbCheeseAmerican.isSelected()) {
              selectedCheese = "White American";
            }
			
            if (rbCheeseMonterey.isSelected()) {
              selectedCheese = "Monterey Cheddar";
            }
			
            if (rbCheeseMozarella.isSelected()) {
              selectedCheese = "Shredded Mozarella";
            }
			
            if (rbCheesePepperJack.isSelected()) {
              selectedCheese = "Pepper Jack";
            }
			
            if (rbCheeseProvolone.isSelected()) {
              selectedCheese = "Provolone";
            }
			
            if (rbCheeseSwiss.isSelected()) {
              selectedCheese = "Swiss";
            }
            
            textCheese.setText(selectedCheese);
        });
		  
	cheeseLayout.getChildren().add(textCheese);
	paneConfirm.add(cheeseLayout, 1, 4);
       
        // veggies
        Label labelresponse= new Label();
        VBox veggiesLayout= new VBox(10);
        
        btToSauces.setOnAction(e -> 
        {
            primaryStage.setScene(sceneSauces);
            if (cbBananaPeppers.isSelected())
            {
                selectedVeggies += "Banana Peppers\n";
            }

            if (cbBlackOlives.isSelected())
            {
                selectedVeggies += "Black Olives\n";
            }

            if (cbCucumbers.isSelected())
            {
                selectedVeggies += "Cucumbers\n";
            }

            if (cbGreenPeppers.isSelected())
            {
                selectedVeggies += "Green Peppers\n";
            }    
            
            if (cbJalapenos.isSelected())
            {
                selectedVeggies += "Jalapenos\n";
            }

            if (cbLettuce.isSelected())
            {
                selectedVeggies += "Lettuce\n";
            } 
            
            if (cbPickles.isSelected())
            {
                selectedVeggies += "Pickles\n";
            }

            if (cbRedOnions.isSelected())
            {
                selectedVeggies += "Red Onions\n";
            } 
            
             if (cbSpinach.isSelected())
            {
                selectedVeggies += "Spinach\n";
            } 
             
             if (cbTomatoes.isSelected())
            {
                selectedVeggies += "Tomatoes\n";
            } 
            
            labelresponse.setText(selectedVeggies);
            
        });        
        
	veggiesLayout.getChildren().add(labelresponse);        
        paneConfirm.add(veggiesLayout, 1, 5);
        
         // sauces
        Label labelSauces= new Label();
        VBox saucesLayout= new VBox(10);
        
        btSeasonings.setOnAction(e -> 
        {
            primaryStage.setScene(sceneSeasonings);
            if (cb1.isSelected())
            {
                selectedSauces += "BBQ\n";
            }

            if (cb2.isSelected())
            {
                selectedSauces += "Buffalo\n";
            }

            if (cb3.isSelected())
            {
                selectedSauces += "Chipotle\n";
            }

            if (cb4.isSelected())
            {
                selectedSauces += "Light Mayo\n";
            }    
            
            if (cb5.isSelected())
            {
                selectedSauces += "Mayo\n";
            }

            if (cb6.isSelected())
            {
                selectedSauces += "Ranch\n";
            }
            
            if (cb7.isSelected())
            {
                selectedSauces += "Sriracha\n";
            }

            if (cb8.isSelected())
            {
                selectedSauces += "Mustard\n";
            } 
            
            labelSauces.setText(selectedSauces);            
	});
        
        saucesLayout.getChildren().add(labelSauces);        
        paneConfirm.add(saucesLayout, 1, 6);
        
        //set radio button actions for Seasonings
	VBox seasoningtLayout = new VBox(1);
        Label textSeasoning = new Label();
        
        btConfirm.setOnAction(e ->{
            primaryStage.setScene(sceneConfirm);
		
            if (yes.isSelected()) {
             selectedSeasoning = "Yes";
            }
            
            if (no.isSelected()) {
             selectedSeasoning = "No";
            }
            textSeasoning.setText(selectedSeasoning);
        }); 
        
	seasoningtLayout.getChildren().add(textSeasoning);
	paneConfirm.add(textSeasoning, 1, 7);
         
        //set scene for confirmation screen
        sceneConfirm = new Scene(paneConfirm, 555, 400);
        
 /**
  * 
  * 
  * 
  *****************************       STAGE SECTION   ******************************
  */
          
        //add Subway icon to window  
        Image applicationIcon = new Image(getClass().getResourceAsStream("images/icon.png"));
        primaryStage.getIcons().add(applicationIcon);  
        primaryStage.setTitle("Order Your Sandwich"); // Set the stage title
        primaryStage.setScene(sizeScene); // Place the scene in the stage
        primaryStage.show(); // Display the stage 
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
