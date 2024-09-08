package WhiteboardMVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

public class MockWhiteboardView extends JFrame implements IWhiteboardView {
  private JPanel options, canvas;
  private JButton rectangleBtn, circleBtn, lineBtn, clearBtn;
  // for the sole purpose of rendering the shapes on the screen, not changing anything in model
  private final MockWhiteboardModel model;

  public MockWhiteboardView(MockWhiteboardModel model) {
    this.model = model;
    setTitle("Whiteboard");
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    initOptionsPanel();
    initCanvasPanel();
    add(options, BorderLayout.NORTH);
    add(canvas, BorderLayout.CENTER);
    setLocationRelativeTo(null);
    setVisible(true);
  }

  private void initOptionsPanel() {
    options = new JPanel();
    options.setLayout(new FlowLayout());
    // set up buttons
    rectangleBtn = new JButton("Rectangle");
    lineBtn = new JButton("Line");
    circleBtn = new JButton("Circle");
    clearBtn = new JButton("Clear");
    // set up button action commands
    rectangleBtn.setActionCommand("Draw rectangle");
    circleBtn.setActionCommand("Draw circle");
    lineBtn.setActionCommand("Draw line");
    clearBtn.setActionCommand("Clear board");
    // add buttons to options panel
    options.add(rectangleBtn);
    options.add(circleBtn);
    options.add(lineBtn);
    options.add(clearBtn);
  }

  public void setButtonListener(ActionListener l) {
    rectangleBtn.addActionListener(l);
    circleBtn.addActionListener(l);
    lineBtn.addActionListener(l);
    clearBtn.addActionListener(l);
  }

  private void initCanvasPanel() {
    canvas = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        return;
      }
    };
    canvas.setBackground(Color.white);
  }

  public void setMouseListener(MouseListener l) {
    canvas.addMouseListener(l);
  }

  public JPanel getCanvas() {
    return canvas;
  }
}
