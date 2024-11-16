fun main() {
    val students = mutableListOf<Student>();
    students.add(Student("Романов","Владислав","Витальевич"));
    students.add(Student("Овдиенко","Артём","Сергеевич", studentTelegram = "@aaaaaaaa"));
    students.add(Student("Придава","Александр","Александрович", gitHub = "megaladon"));
    students.add(Student("Полевая","Полина","Андреевна", email = "shroudolka@gmail.com"));
    students.add(Student("Абрамов","Иван","Дмитриевич"));
    students.add(Student("Гонтарев","Александр","Дмитриевич"));
    students.add(Student("Попов","Иван","Викторович"));
    students.add(Student(hashMapOf(Pair("name", "Артём"), Pair("surname", "Овдиенко"), Pair("patronymic", "Сергеевич"))));
    students.forEach { it: Student -> println(it) };
}