import WhiteboardMVC.ActualShape;
import WhiteboardMVC.Shapes;
import WhiteboardMVC.WhiteboardModel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

/**
 * This contains unit tests for WhiteboardModel class
 */
public class WhiteboardModelTest {
  private WhiteboardModel model;

  @Before
  public void setUp() {
    model = new WhiteboardModel();
  }

  @Test
  public void testAddShape() {
    assertTrue(model.getShapes().isEmpty());
    Rectangle2D newRectangle = new Rectangle2D.Double();
    model.getShapes().add(new ActualShape(newRectangle, Color.BLUE));
    assertEquals(1, model.getShapes().size());
    Line2D newLine = new Line2D.Double();
    model.getShapes().add(new ActualShape(newLine, Color.BLACK));
    Ellipse2D newCircle = new Ellipse2D.Double();
    model.getShapes().add(new ActualShape(newCircle, Color.RED));
    assertEquals(3, model.getShapes().size());
  }

  @Test
  public void testClearShapes() {
    assertTrue(model.getShapes().isEmpty());
    Rectangle2D newRectangle = new Rectangle2D.Double();
    model.getShapes().add(new ActualShape(newRectangle, Color.BLUE));
    assertEquals(1, model.getShapes().size());
    Line2D newLine = new Line2D.Double();
    model.getShapes().add(new ActualShape(newLine, Color.BLACK));
    Ellipse2D newCircle = new Ellipse2D.Double();
    model.getShapes().add(new ActualShape(newCircle, Color.RED));
    assertEquals(3, model.getShapes().size());
    model.clearShapes();
    assertEquals(0, model.getShapes().size());
  }

  @Test
  public void testGetShapes() {
    assertEquals("[]", model.getShapes().toString());

    Rectangle2D newRectangle = new Rectangle2D.Double();
    model.getShapes().add(new ActualShape(newRectangle, Color.BLUE));

    Line2D newLine = new Line2D.Double();
    model.getShapes().add(new ActualShape(newLine, Color.BLACK));
    Ellipse2D newCircle = new Ellipse2D.Double();
    model.getShapes().add(new ActualShape(newCircle, Color.RED));

    List<ActualShape> shapes = model.getShapes();
    StringBuilder sb = new StringBuilder();
    for (ActualShape s : shapes) {
      sb.append(s.getColor());
    }
    assertEquals("java.awt.Color[r=0,g=0,b=255]java.awt.Color[r=0,g=0,b=0]java.awt.Color[r=255,g=0,b=0]",
            sb.toString());

  }
}
