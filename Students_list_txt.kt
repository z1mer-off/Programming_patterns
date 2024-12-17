package main.src
import Data_list
import main.src.Student.Examination
import java.io.File

class Students_list_txt(private val filePath: String) {
    private val students : MutableList<Student> = mutableListOf()
    init {
        readFromTxt()
    }
    // Чтение файла
    fun readFromTxt(): List<SuperStudent> {
        val file = File(filePath)
        if (!file.exists() || !file.canRead()) {
            throw IllegalArgumentException("Файл недоступен: $filePath")
        }
        file.forEachLine { line ->
            try{
                val student = Student(line)
                @@ -27,9 +28,9 @@ class Students_list_txt(private val filePath: String) {
                    return Student.students
                }

                // Запись в файл
                fun writeToTxt() {
                    val file = File("output.txt")
                    file.bufferedWriter().use { writer ->
                        Student.students.forEach { student ->
                            writer.write(
                                @@ -41,32 +42,32 @@ class Students_list_txt(private val filePath: String) {
                                }
                        }

                        // Получение объекта класса Student по ID
                        fun getStudentById(id: Int): Student? {
                            return Student.students.find { it.id == id }
                        }

                        // Получение списка k по счету n объектов класса Student_short
                        fun get_k_n_student_short_list(n: Int, k: Int): Data_list<Student_short> {
                            val startIndex = (n - 1) * k
                            val endIndex = startIndex + k
                            val studentShortList = Student.students.subList(startIndex.coerceAtLeast(0), endIndex.coerceAtMost(students.size)).map { Student_short(it) }
                            return Data_list(studentShortList)
                        }

                        // Сортировка элементов по ФИО
                        fun sortStudents() {
                            Student.students.sortBy { it.getInfo() }
                        }

                        // Добавление объектов класса Student в список
                        fun addStudent(student: Student, id: Int = students.maxOf { it.id } + 1) {
                            val newStudent = student
                            newStudent.id = id
                            Student.students.add(newStudent)
                        }

                        // Замена элементов списка по ID
                        fun replaceStudentById(id: Int, newStudent: Student) {
                            val newStud = newStudent
                            newStud.id = id
                            @@ -75,7 +76,7 @@ class Students_list_txt(private val filePath: String) {
                                else this.addStudent(newStudent, id)
                            }

                            // Удаление элемента списка по ID
                            fun removeStudentById(id: Int) {
                                val index = Student.students.indexOfFirst { it.id == id }
                                if (index != -1) {
                                    @@ -85,7 +86,7 @@ class Students_list_txt(private val filePath: String) {
                                    }
                                }

                                // Получение количества элементов
                                fun getStudentShortCount(): Int {
                                    return Student.students.size
                                }