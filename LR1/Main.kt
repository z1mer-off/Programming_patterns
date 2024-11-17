fun main() {
    val students = mutableListOf<Student>();
    students.add(Student("Овдиенко","Артём","Сергеевич"));
    students.add(Student("Мамин-Сибиряк","Дмитрий","Наркисович", telegramValue = "@poet777"));
    students.add(Student("Махмудов","Арарат-Магомед","Саркисович", gitHubValue = "abu123"));
    students.add(Student("Лермонтов","Михаил","Юрьевич", emailValue = "literature@gmail.com"));
    students.add(Student("Баладин","Максим","Викторович", phoneNumberValue = "+79095889812"));
    students.add(Student(hashMapOf(Pair("name","Владислав"),Pair("surname","Романов"),Pair("patronymic","Витальевич"))));
    students.forEach { it: Student -> println(it) };
    println(Student(hashMapOf(Pair("name","Артём"),Pair("surname","Овдиенко"),Pair("patronymic","Сергеевич"))).validate())
    println(Student("Лермонтов","Михаил","Юрьевич", emailValue = "literatureclub@gmail.com", gitHubValue = "famous007").validate());

    val stud = Student("Лермонтов","Михаил","Юрьевич", emailValue = "literatureclub@gmail.com", gitHubValue = "famous007", phoneNumberValue = "+79186916942");
    stud.setContacts(hashMapOf(Pair("email","literatureclub@gmail.com"),Pair("telegram","@miha999"),Pair("gitHub",null)));
    println(stud)
    stud.name = "Саня";
    println(stud)
}
