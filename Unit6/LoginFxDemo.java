package Unit6;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class LoginFxDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label l1 = new Label("Username");
        TextField t1 = new TextField();

        Label l2 = new Label("Password");
        PasswordField p1 = new PasswordField();

        Label l3 = new Label("Repassword");
        PasswordField p2 = new PasswordField();

        Label l4 = new Label("Gender");
        RadioButton r1 = new RadioButton("Male");
        RadioButton r2 = new RadioButton("Female");

        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);

        Label l5 = new Label("Course");
        CheckBox c1 = new CheckBox("C");
        CheckBox c2 = new CheckBox("C++");
        CheckBox c3 = new CheckBox("Java");

        Label l6 = new Label("Country");

        ChoiceBox<String> cb = new ChoiceBox<>();
        cb.getItems().addAll("Nepal", "China", "USA");

        Button b1 = new Button("Submit");

        // Grid
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setVgap(5);
        gp.setHgap(5);

        gp.add(l1, 0, 0);
        gp.add(t1, 1, 0);

        gp.add(l2, 0, 1);
        gp.add(p1, 1, 1);

        gp.add(l3, 0, 2);
        gp.add(p2, 1, 2);

        gp.add(l4, 0, 3);
        gp.add(r1, 1, 3);
        gp.add(r2, 2, 3);

        gp.add(l5, 0, 4);
        gp.add(c1, 1, 4);
        gp.add(c2, 2, 4);
        gp.add(c3, 3, 4);

        gp.add(l6, 0, 5);
        gp.add(cb, 1, 5);

        gp.add(b1, 0, 6);

        Scene sc = new Scene(gp, 400, 400);
        stage.setTitle("Layout");
        stage.setScene(sc);
        stage.show();
    }
}
