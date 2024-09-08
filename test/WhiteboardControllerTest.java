import WhiteboardMVC.MockWhiteboardModel;
import WhiteboardMVC.MockWhiteboardView;
import WhiteboardMVC.Shapes;
import WhiteboardMVC.WhiteboardController;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

/**
 * This class contains unit tests for WhiteboardController class
 */
public class WhiteboardControllerTest {
  private MockWhiteboardModel model;
  private MockWhiteboardView view;
  private WhiteboardController controller;

  @Before
  public void setUp() {
    model = new MockWhiteboardModel();
    view = new MockWhiteboardView(model);
    controller = new WhiteboardController(model, view);
  }

  @Test
  public void testActionPerformed() {
    ActionEvent event1 = new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "Draw line");
    controller.actionPerformed(event1);
    assertEquals(Shapes.LINE, controller.getNextShape());

    ActionEvent event2 = new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "Draw circle");
    controller.actionPerformed(event2);
    assertEquals(Shapes.CIRCLE, controller.getNextShape());

    ActionEvent event3 = new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "Draw rectangle");
    controller.actionPerformed(event3);
    assertEquals(Shapes.RECTANGLE, controller.getNextShape());

    ActionEvent event4 = new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "Clear board");
    controller.actionPerformed(event4);
    assertEquals("", model.getLog());
  }
}
