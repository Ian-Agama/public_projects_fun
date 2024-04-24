package africanicity;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;

import java.util.ArrayList;

/**
 * Basic demonstration of mouse events in action.
 *
 * @author Roderick  Agama
 */
public class Main extends Application {
    GraphicsContext gc;
    // TODO: Instance Variables for View Components and Model

    //Arraylist<CyndicatePiece> circle = new ArrayList<>();


    // TODO: Private Event Handlers and Helper Methods
//    private void pressHandler(MouseEvent me) {
//        System.out.println("Pressed " + me.getButton() + " at (" + me.getX() + "," + me.getY() + ").");
//    }
//    private void drawHandler(MouseEvent me){
//        gc.setFill(Color.CADETBLUE);
//        gc.fillOval(me.getX(),me.getY(),20,20);
//    }
//
//    private void releaseHandler(MouseEvent me) {
//        System.out.println("Released " + me.getButton() + " at (" + me.getX() + "," + me.getY() + ").");
//    }

    /**
     * This is where you create your components and the model and add event
     * handlers.
     *
     * @param stage The main stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Arraylist<CyndicatePiece> circle = new ArrayList<>();
        CyndicateBoard board = new CyndicateBoard();
        Pane root = new Pane();
        Scene scene = new Scene(board, 400, 400); // set the size here
        stage.setTitle("Cyndicate game "); // set the window title here
        stage.setScene(scene);
        // TODO: Add your GUI-building code here

        // 1. Create the model
        // 2. Create the GUI components
        Canvas c = new Canvas(400, 225);
        //Alert alert = new Alert("Game ");
        // 3. Add components to the root
        root.getChildren().add(c);
        // 4. Configure the components (colors, fonts, size, location)
         gc = c.getGraphicsContext2D();
        gc.setFill(Color.LIGHTYELLOW);
        //drawBoard();
        gc.fillRect(0, 0, 400, 225);
        // 5. Add Event Handlers and do final setup
//        c.addEventHandler(MouseEvent.MOUSE_PRESSED, this::pressHandler);
//        c.addEventHandler(MouseEvent.MOUSE_RELEASED, this::releaseHandler);
//        c.addEventHandler(MouseEvent.MOUSE_PRESSED,this::drawHandler);
//        c.addEventHandler(MouseEvent.MOUSE_PRESSED,this::pressHandler);
        // 6. Show the stage
        stage.show();
    }

    /**
     * Make no changes here.
     *
     * @param args unused
     */
    public static void main(String[] args) {



        launch(args);
    }
}