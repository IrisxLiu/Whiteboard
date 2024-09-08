package WhiteboardMVC;

import java.util.ArrayList;
import java.util.List;

/**
 * WhiteboardModel class for keeping a record of current drawn Shapes
 */

public class WhiteboardModel implements IWhiteboardModel {
    private List<ActualShape> shapes;

    /**
     * Constructs a WhiteboardModel object
     */
    public WhiteboardModel() {
        shapes = new ArrayList<>();
    }

    /**
     * Method for adding a Shape on to canvas
     * @param shape a concrete shape to be added on canvas
     */
    public void addShape(ActualShape shape) {
        shapes.add(shape);
    }

    /**
     * Method for clearing all existing Shapes currently on canvas
     */
    public void clearShapes() {
        shapes.clear();
    }

    /**
     * Method for returning the list of existing Shapes currently on canvas
     * @return list of concrete shapes
     */
    public List<ActualShape> getShapes() {
        return shapes;
    }
}
