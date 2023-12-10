
package JavaNotes.Unit6;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;//for diffrent layout
import javafx.event.*;
public class LayoutFXDemo extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
    Button b1=new Button("buttom1");
    Button b2=new Button("buttom2");
    Button b3=new Button("buttom3");
    Button b4=new Button("buttom4");
    Label l1=new Label("Result");
    //using flowpane put componet from left to right
//    FlowPane fp=new FlowPane();
//    fp.setHgap(50);
//    fp.getChildren().add(b1);
//    fp.getChildren().add(b2);
//    fp.getChildren().add(b3);
//    fp.getChildren().add(b4);
//    fp.getChildren().add(l1);

///grid pane:put componet in term of row and column
//  x right ma jada increse

//    GridPane gp=new GridPane();
//    gp.add(b1,0,0);
//    gp.add(b2,1,0);
//    gp.add(b3,0,1);
//    gp.add(b4,1,1);
//    gp.add(l1,0,2);

//border pane:put compnent in term of direction left right button
BorderPane bp=new BorderPane();
bp.setCenter(l1);
bp.setTop(b1);
bp.setBottom(b2);
bp.setLeft(b3);
bp.setRight(b4);


    
    
    
    //hanlfing action 
    b1.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void  handle(ActionEvent t){
            l1.setText("button 1 is pressed");
        }
    });
     b2.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void  handle(ActionEvent t){
            l1.setText("button 2 is pressed");
        }
    });
    //adding layout to window
    //for flowpane
//    Scene sc= new Scene(fp,400,400);
//for gridpane
//Scene sc= new Scene(gp,400,400);

//for borderpane
    Scene sc= new Scene(bp,400,400);
    //adding scene to stage
    stage.setTitle("Layout");
    stage.setScene(sc);//adding scene to satge
    stage.show();
    
    
    }
    
}
