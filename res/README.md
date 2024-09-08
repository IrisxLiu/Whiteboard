# Whiteboard

## Feature Overview
This project is a Whiteboard following the MVC design pattern that allows user to draw on the canvas. The project supports the following features:

- Draw a selection of fixed size shapes which includes:
  - rectangle
  - circle
  - line
- Clear canvas: restart on a blank canvas

## How to run
- **Mac**: Double-click on the jar file to start the application (no arguments needed)

## How to use the program
- Upon opening the application, choose a shape, place the mouse cursor on a desired position on the canvas, and left-click the mouse to place the shape. 
- To clear the canvas, click on Clear option.

## Design/Model changes
- version 1 (4/15/24): Initial design consists of a single View module.
- version 2 (4/19/24): Restructured design adhering to MVC paradigm.

## Assumptions/limitation
- 3 types of shape are allowed to be drawn on canvas: rectangle, circle, line.
- The color of the shapes are fixed: red circles, blue rectangles, and black lines.
- The size of the shapes are fixed
- Shapes can only be drawn within the application window inside the canvas panel.
- The application only supports users mouse interaction, no keyboard interaction is supported.

## Citations
- “JPanel (Java Platform SE 8 ),” docs.oracle.com. https://docs.oracle.com/javase/8/docs/api/javax/swing/JPanel.html
- “JFrame (Java Platform SE 8 ),” docs.oracle.com. https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html
- “JDK 22 Documentation, Shape Interface” Oracle Help Center. https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/awt/Shape.html (accessed Apr. 21, 2024).
- “MouseAdapter (Java Platform SE 8 ),” docs.oracle.com. https://docs.oracle.com/javase/8/docs/api/java/awt/event/MouseAdapter.html