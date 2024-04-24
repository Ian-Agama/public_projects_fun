package africanicity;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.util.ArrayList;

public class CyndicateBoard extends Pane {

    private boolean isMove;
    //constructor for the board
    public CyndicateBoard() {
        //creating the board outlines
        Line border1 = new Line(30, 30, 350, 30);//top
        Line border2 = new Line(30, 30, 30, 350);
        Line border3 = new Line(350, 30, 350, 350);//left-sideworking
        Line border4 = new Line(30, 350, 350, 350);
        //lines for the horizontal, vertical and diagonal lines
        Line verticalLine = new Line(190, 30, 190, 350);
        Line horizontalLine = new Line(30, 190, 350, 190);
        Line diagonalLine = new Line(30,30,350,350);
        Line diagonalLine2 = new Line(30,350,350,30);
        //coloring of the line
        verticalLine.setStroke(Color.BLACK);
        horizontalLine.setStroke(Color.BLACK);
        diagonalLine.setStroke(Color.BLACK);
        diagonalLine2.setStroke(Color.BLACK);
        //borders of the game
        border1.setStroke(Color.BLACK);
        border2.setStroke(Color.BLACK);
        border3.setStroke(Color.BLACK);
        border4.setStroke(Color.BLACK);

        getChildren().addAll(verticalLine, horizontalLine,diagonalLine,diagonalLine2,border1,border2,border3,border4);

        // Add a piece for demonstration
        //Array list for the top column
        ArrayList<CyndicatePiece> top = new ArrayList<>();
        top.add(new CyndicatePiece(30, 30, Color.RED));
        top.add(new CyndicatePiece(190, 30, Color.RED));
        top.add(new CyndicatePiece(350, 30, Color.RED));


        for(CyndicatePiece piece : top){getChildren().add(piece);}



        ArrayList<CyndicatePiece> bottom = new ArrayList<>();
        bottom.add(new CyndicatePiece(30, 350, Color.BLUE));
        bottom.add(new CyndicatePiece(190, 350, Color.BLUE));
        bottom.add(new CyndicatePiece(350, 350, Color.BLUE));
        //iterating through the arrayList to get each element
        for(CyndicatePiece piece : bottom){getChildren().add(piece);}
    }

    //functionality methods
    //self play method
    public void selfPlay(){

    }
}

