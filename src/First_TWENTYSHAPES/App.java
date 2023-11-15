package First_TWENTYSHAPES;

import java.awt.*;
import javax.swing.*;

class App extends JFrame {
    int WINDOW_WIDTH = 512;
    int WINDOW_HEIGHT = 512;
    App() {
        super("20 случайных фигур"); // Заголовок окна
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);// Размеры окна
        setLocation(300, 300);// Расположение окна
        setLayout(null);// Менеджер компоновки
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Операция закрытия по умолчанию
        setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics; // Создание объекта класса Graphics2D
        randomShapesPaint(20, graphics2D); // Вызов метода рисовки фигур
    }

    void randomShapesPaint(int shapes, Graphics2D g) {

        for (int i = 0; i < shapes; i++) { // Создание случайных чисел, в зависимости от которых создаются случайные фигуры
            int choice = (int) (Math.random() * 4);
            switch (choice) {

                case 1:
                    Oval oval = new Oval(); // Создание объекта класса TWENTYSHAPES.Oval
                    g.setColor(oval.getColor()); // Установка цвета овала
                    g.fillOval(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight()); // Заполнение овала
                    g.setColor(oval.getColor().darker()); // Установка цвета эллипса
                    g.drawOval(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight()); // Рисовка контура овала
                    break;


                case 2:
                    Rect rect = new Rect();
                    g.setColor(rect.getColor());
                    g.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
                    g.setColor(rect.getColor().darker());
                    g.drawRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
                    break;


                case 3:
                    Circle circle = new Circle();
                    g.setColor(circle.getColor());
                    g.fillOval(circle.getX(), circle.getY(), circle.getWidth(), circle.getWidth());
                    g.setColor(circle.getColor().darker());
                    g.drawOval(circle.getX(), circle.getY(), circle.getWidth(), circle.getWidth());
                    break;


                case 4:
                    Square square = new Square();
                    g.setColor(square.getColor());
                    g.fillRect(square.getX(), square.getY(), square.getWidth(), square.getWidth());
                    g.setColor(square.getColor().darker());
                    g.drawRect(square.getX(), square.getY(), square.getWidth(), square.getWidth());
                    break;

                default:
                    break;
            }
        }
    }
}