package africanicity;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CyndicatePiece extends Circle {
    // Variables to store the last position of the mouse
    private double mouseX, mouseY;

    public CyndicatePiece(double x, double y, Color color) {
        super(x, y, 15); // Radius set to 15
        setFill(color);
        setupMouseEvents();
    }

    private void setupMouseEvents() {
        // Mouse pressed event: capture starting position
        setOnMousePressed(e -> {
            mouseX = e.getSceneX();
            mouseY = e.getSceneY();
        });

        // Mouse dragged event: adjust the piece's position
        setOnMouseDragged(e -> {
            double deltaX = e.getSceneX() - mouseX;
            double deltaY = e.getSceneY() - mouseY;
            setCenterX(getCenterX() + deltaX);
            setCenterY(getCenterY() + deltaY);
            mouseX = e.getSceneX();
            mouseY = e.getSceneY();
        });
    }
}
