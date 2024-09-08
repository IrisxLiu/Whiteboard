package WhiteboardMVC;

import java.awt.Color;
import java.awt.Point;
import java.awt.Shape;

/**
 * ActualShape class defines the concrete shape being drawn.
 */

public class ActualShape {
    private final Shape shape;
    private final Color color;

    /**
     * Constructor for creating a concrete shape object
     * @param shape concrete shape's shape represented as Enum
     * @param color concrete shape's color
     */
    public ActualShape(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    /**
     * Getter for returning the concrete shape's shape back to client
     * @return Shape of the concrete shape
     */
    public Shape getShape() {
        return shape;
    }


    /**
     * Getter for returning the concrete shape's color back to client
     * @return Color of the concrete shape
     */
    public Color getColor() {
        return color;
    }
}
