package WhiteboardMVC;

import java.util.List;

public class MockWhiteboardModel implements IWhiteboardModel {
  private StringBuilder log;

  public MockWhiteboardModel() {
    log = new StringBuilder();
  }

  @Override
  public void addShape(ActualShape shape) {
    log.append(shape.getShape());
  }

  @Override
  public void clearShapes() {
    log.setLength(0);
  }

  @Override
  public List<ActualShape> getShapes() {
    log.append("Get shapes");
    return null;
  }

  public String getLog() {
    return log.toString();
  }
}
