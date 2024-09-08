import WhiteboardMVC.WhiteboardController;
import WhiteboardMVC.WhiteboardModel;
import WhiteboardMVC.WhiteboardView;

import javax.swing.*;

/**
 * Driver class for Whiteboard Application.
 * Does 3 things:
 * 1. Instantiate Model
 * 2. Instantiate View
 * 3. Instantiate Controller
 */

public class WhiteboardDriver {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        WhiteboardModel model = new WhiteboardModel();
        WhiteboardView view = new WhiteboardView(model);
        WhiteboardController controller = new WhiteboardController(model, view);
      }
    });
  }
}