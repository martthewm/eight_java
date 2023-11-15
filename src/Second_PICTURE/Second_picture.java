package Second_PICTURE;// ЗАДАНИЕ: Создать окно, отобразить в нем картинку, путь к которой указан в
//аргументах КОМАНДНОЙ СТРОКИ. КАРТИНКА с того диска, где запускается код (или моя).

// путь к моей:  ../eight/src/Second_PICTURE/pic.jpg
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

class Picture extends JFrame {
    int WINDOW_WIDTH = 910;
    int WINDOW_HEIGHT = 512;
    String image_path;

    Picture() {
        super("pict");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void set_background_image_path(String path) {
        this.image_path = path;
    }

    // Paint method
    @Override
    public void paint(Graphics g2) { // Метод отрисовки изображения
        Graphics2D g = (Graphics2D) g2; // Создание объекта класса Graphics2D
        Image img = Toolkit.getDefaultToolkit().getImage(this.image_path); // Получение изображения по пути image_path
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this); // Отрисовка отображения

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Создание объекта для ввода данных
        String n = sc.nextLine(); // Считывание пути к изображению
        Picture app = new Picture(); // Создание объекта класса Second_PICTURE.Picture

        app.set_background_image_path(n); // Вызов метода для установки пути к изображению
    }
}
//C:\Users\mattb\OneDrive\Рабочий стол\IMG20210623224633.jpg