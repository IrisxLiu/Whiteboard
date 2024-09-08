package WhiteboardMVC;

import java.util.List;

public interface IWhiteboardModel {
  public void addShape(ActualShape shape);

  public void clearShapes();

  public List<ActualShape> getShapes();
}
