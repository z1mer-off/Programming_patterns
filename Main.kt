fun main() {
    val students = mutableListOf<Student>();
    students.add(Student("Овдиенко","Артём","Сергеевич"));
    students.add(Student("Мамин-Сибиряк","Дмитрий","Наркисович", telegram = "@poet123"));
    students.add(Student("Махмудов","Арарат-Магомед","Саркисович", gitHub = "abu0987"));
    students.add(Student("Лермонтов","Михаил","Юрьевич", email = "literatureclub@gmail.com"));
    students.add(Student("Городецкий","Эдуард","Романович", phoneNumber = "+78005553535"));
    students.add(Student(hashMapOf(Pair("name","Владислав"),Pair("surname","Романов"),Pair("patronymic","Витальевич"))));
    students.forEach { it: Student -> println(it) };
}