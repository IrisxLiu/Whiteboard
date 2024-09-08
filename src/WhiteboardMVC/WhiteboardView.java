package WhiteboardMVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

/**
 * WhiteboardView class for preparing the window for client view
 */

public class WhiteboardView extends JFrame implements IWhiteboardView {
    private JPanel options, canvas;
    private JButton rectangleBtn, circleBtn, lineBtn, clearBtn;
    // for the sole purpose of rendering the shapes on the screen, not changing anything in model
    private final IWhiteboardModel model;

    /**
     * Constructs a WhiteboardView object for display
     * @param model a WhiteboardModel object
     */
    public WhiteboardView(IWhiteboardModel model) {
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

    /**
     * Method for initializing panel of buttons
     */
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

    /**
     * Method for setting button listeners
     * @param l AcstionListener object for buttons
     */
    public void setButtonListener(ActionListener l) {
        rectangleBtn.addActionListener(l);
        circleBtn.addActionListener(l);
        lineBtn.addActionListener(l);
        clearBtn.addActionListener(l);
    }

    /**
     * Method for drawing shapes on canvas panel
     */
    private void initCanvasPanel() {
        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2D = (Graphics2D) g;
                for (ActualShape as : model.getShapes()) {
                    g2D.setColor(as.getColor());
                    if (as.getShape() instanceof Line2D) {
                        g2D.draw(as.getShape());
                    } else {
                        g2D.fill(as.getShape());
                    }
                }
            }
        };
        canvas.setBackground(Color.white);
    }

    /**
     * Method for setting MouseListener to get drawing position for shapes
     * @param l MouseListener object
     */
    public void setMouseListener(MouseListener l) {
        canvas.addMouseListener(l);
    }

    /**
     * Getter for returning the canvas panel
     * @return the canvas JPanel
     */
    public JPanel getCanvas() {
        return canvas;
    }
}
