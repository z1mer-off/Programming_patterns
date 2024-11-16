fun main() {
    val students = mutableListOf<Student>();
    students.add(Student("Романов","Владислав","Витальевич"));
    students.add(Student("Овдиенко","Артём","Сергеевич", studentTelegram = "@aaaaaaa"));
    students.add(Student("Придава","Александр","Александрович", studentGit = "megaladon"));
    students.add(Student("Полевая","Полина","Андреевна", studentEmail = "shroudolka@gmail.com"));
    students.add(Student("Абрамов","Иван","Дмитриевич"));
    students.add(Student("Гонтарев","Александр","Дмитриевич"));
    students.add(Student("Попов","Иван","Викторович"));
    students.forEach { it: Student -> println(it) };
}