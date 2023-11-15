package Third_ANIMATION;

import javax.swing.*;

public class Third_Animation extends JFrame {
    private JLabel imgLabel;

    private int img = 1;
    private Third_Animation(){
        super("Aнимация"); // Заголовок окна
        this.setSize(512, 512); // Размеры окна
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.jpg")), SwingConstants.CENTER); //  Создание новой метки с изображением и установка ее в центр
        getContentPane().add(imgLabel); // Добавление изображение на панель содержимого окна
        Timer timer = new Timer(400, e -> nextImg()); // Создание таймера, который вызывает метод nextImg
        timer.start(); // Запуск таймера
    }
    private void nextImg(){ // Метод, меняющий отображаемое изображение
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++img)+".jpg"))); // Переопределение изображения
        if(img == 5) img = 0; // При достижении img пяти, сброс в ноль
    }
    public static void main(String[] args) {

        Third_Animation animation = new Third_Animation(); // Создание объекта класса Animation
        animation.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Операция закрытия по умолчанию
        animation.setVisible(true); // Установка видимости окна

    }
}