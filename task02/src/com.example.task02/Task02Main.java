package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        // Проверяем, что номер месяца находится в допустимом диапазоне
        if (monthNumber < 1 || monthNumber > 12) {
            return "Некорректный номер месяца"; // Возвращаем сообщение об ошибке
        }

        // Определяем время года по номеру месяца
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return "зима";   // Декабрь, Январь, Февраль
        } else if (monthNumber <= 5) {
            return "весна";  // Март, Апрель, Май
        } else if (monthNumber <= 8) {
            return "лето";   // Июнь, Июль, Август
        } else {
            return "осень";  // Сентябрь, Октябрь, Ноябрь
        }
    }
}