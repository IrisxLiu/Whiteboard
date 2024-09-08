package WhiteboardMVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * Whiteboard controller class for communicating between View and Model
 */
public class WhiteboardController extends MouseAdapter implements ActionListener  {
    private IWhiteboardView view;
    private IWhiteboardModel model;
    private Shapes nextShape;

    /**
     * Constructs a WhiteboardController object
     * @param model WhiteboardModel object
     * @param view WhiteboardView object
     */
    public WhiteboardController(IWhiteboardModel model, IWhiteboardView view) {
        this.view = view;
        this.model = model;
        view.setButtonListener(this);
        view.setMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "Draw line":
                nextShape = Shapes.LINE;
                break;
            case "Draw circle":
                nextShape = Shapes.CIRCLE;
                break;
            case "Draw rectangle":
                nextShape = Shapes.RECTANGLE;
                break;
            case "Clear board":
                model.clearShapes();
                view.getCanvas().repaint();
                break;
            default:
                model.clearShapes();
                view.getCanvas().repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        if (nextShape == null) {
            JOptionPane.showMessageDialog(null,
                    "Please choose a shape.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            switch (nextShape) {
                case CIRCLE:
                    // create new circle
                    Ellipse2D newCircle = new Ellipse2D.Double(e.getX() - 35, e.getY() - 35, 70, 70);
                    model.getShapes().add(new ActualShape(newCircle, Color.RED));
                    break;
                case RECTANGLE:
                    // create new rectangle
                    Rectangle2D newRectangle = new Rectangle2D.Double(e.getX() - 35, e.getY() - 35, 70, 70);
                    model.getShapes().add(new ActualShape(newRectangle, Color.BLUE));
                    break;
                case LINE:
                    // create new line
                    Line2D newLine = new Line2D.Double(e.getX(), e.getY(), e.getX() + 70, e.getY());
                    model.getShapes().add(new ActualShape(newLine, Color.BLACK));
                    break;
            }
            view.getCanvas().repaint();
        }
    }
}
