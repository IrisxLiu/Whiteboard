package WhiteboardMVC;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public interface IWhiteboardView {
  public void setMouseListener(MouseListener l);

  public void setButtonListener(ActionListener l);

  public JPanel getCanvas();
}
