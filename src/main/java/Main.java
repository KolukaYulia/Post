public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Петр";
        post.patronymic = "Петрович";
        post.surname = "Петров";
        post.passport = "1010 № 222333";
        post.phone = "+7 (921) 555-44-33";
        post.subscription = "true";
        post.birthday = new FormDate();
        post.birthday.day = "01";
        post.birthday.month = "10";
        post.birthday.year = "1990";

        System.out.println("Имя : " + post.name);
        System.out.println("Отчество : " + post.patronymic);
        System.out.println("Фамилия : " + post.surname);
        System.out.println("Паспорт : " + post.passport);
        System.out.println("Телефон : " + post.phone);
        System.out.println("Подписка : " + post.subscription);
        System.out.println("Дата Рождения : ");
        System.out.println("День Рождения : " + post.birthday.day);
        System.out.println("Месяц Рождения : " + post.birthday.month);
        System.out.println("Год рождения : " + post.birthday.year);

    }



}