package com.mera.training.advanced.practice11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Task3 {
    public static class Lection {
        private String subject;
        private LocalDate date;

        public Lection(String subject, LocalDate date) {
            this.subject = subject;
            this.date = date;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Lection)) {
                return false;
            }
            Lection lection = (Lection) o;
            return Objects.equals(subject, lection.subject) &&
                    Objects.equals(date, lection.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(subject, date);
        }

        @Override
        public String toString() {
            return "Lection{" +
                    "subject='" + subject + '\'' +
                    ", date=" + date +
                    '}';
        }

        public String getSubject() {
            return subject;
        }

        public LocalDate getDate() {
            return date;
        }
    }

    public static class Student {
        private String name;
        private Set<Lection> lections;

        public Student(String name, Set<Lection> lections) {
            this.name = name;
            this.lections = lections;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public Set<Lection> getLections() {
            return lections;
        }
    }

    public static void main(String[] args) {
        Lection matan21 = new Lection("матанализ", LocalDate.of(2020, 12, 21));
        Lection english21 = new Lection("английкий язык", LocalDate.of(2020, 12, 21));
        Lection history21 = new Lection("история", LocalDate.of(2020, 12, 21));
        Lection physical21 = new Lection("физкультура", LocalDate.of(2020, 12, 21));

        Lection philosophy22 = new Lection("философия", LocalDate.of(2020, 12, 22));
        Lection physical22 = new Lection("физкультура", LocalDate.of(2020, 12, 22));

        Lection matan23 = new Lection("матанализ", LocalDate.of(2020, 12, 23));
        Lection english23 = new Lection("английкий язык", LocalDate.of(2020, 12, 23));
        Lection physical23 = new Lection("физкультура", LocalDate.of(2020, 12, 23));

        Lection history24 = new Lection("история", LocalDate.of(2020, 12, 24));
        Lection physical24 = new Lection("физкультура", LocalDate.of(2020, 12, 24));

        Lection matan25 = new Lection("матанализ", LocalDate.of(2020, 12, 25));
        Lection english25 = new Lection("английкий язык", LocalDate.of(2020, 12, 25));
        Lection philosophy25 = new Lection("философия", LocalDate.of(2020, 12, 25));
        Lection physical25 = new Lection("физкультура", LocalDate.of(2020, 12, 25));

        Student student1 = new Student("Студент 1", new HashSet<>(Arrays.asList(matan21, english21, philosophy22, physical22, matan23, english23, history24, physical24, matan25, english25)));
        Student student2 = new Student("Студент 2", new HashSet<>(Arrays.asList(matan21, english21, matan23, english23, matan25, english25)));
        Student student3 = new Student("Студент 3", new HashSet<>(Arrays.asList(matan21, english21, history21, physical21, matan23, english23, physical23, matan25, english25, philosophy25, physical25)));
        Student student4 = new Student("Студент 4", new HashSet<>(Arrays.asList(physical21, physical22, physical23, physical24, physical25)));
        Student student5 = new Student("Студент 5", new HashSet<>(Arrays.asList(matan21, matan23, matan25)));
        Student student6 = new Student("Студент 6", new HashSet<>(Arrays.asList(matan21, english21, history21, physical21, philosophy22, physical22, matan23, english23, physical23, history24, physical24, matan25, english25, philosophy25, physical25)));
        Student student7 = new Student("Студент 7", new HashSet<>(Arrays.asList(history21, philosophy22, history24, philosophy25)));
        Student student8 = new Student("Студент 8", new HashSet<>(Arrays.asList(matan21, english21, physical21, matan23, english23, physical23, matan25, english25, physical25)));
        Student student9 = new Student("Студент 9", new HashSet<>(Arrays.asList(matan21)));
        Student student10 = new Student("Студент 10", new HashSet<>(Arrays.asList(matan25, english25)));

        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10));

        /*
        Теперь проведем аналитику:
        Для всех заданий используй students.stream() и операции с потоками.

        1. Выведите список студентов, которые хоть раз посещали матанализ.
        2. Выведите статистику посещений для каждого студентам в формате: имя - количество посщенных лекций.
        3. Выведите название дисциплин, имеющих наибольшее количество посещений.
        Если два разных студента посещают одну лекцию в один день, то это считается как два посещения.
        4. Выведите имена студентов, которые посетили наибольшее количество лекций в день.
        5. Выведите статистику по курсам в формате:
        название курсов - количество разных студентов, которые посетили хотя бы одно занятие. (т.е. в лучше случае это будет 10)
         */

        //students.stream().collect(Collectors.toMap)
        //Map<Student, HashSet<String>> map = students.stream().collect(Collectors.toMap(student->student, student -> student.lections, );
        // List<Student> s =  students.stream().filter(student -> student.lections.stream().filter(lection -> lection.subject.equals("матанализ"))).collect(Collectors.toList());
        System.out.println("1. Выведите список студентов, которые хоть раз посещали матанализ.");
        List<Student> list = students.stream().filter(student -> student.lections.stream().anyMatch(lection -> lection.subject.equals("матанализ"))).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("2. Выведите статистику посещений для каждого студентам в формате: имя - количество посщенных лекций.");
        students.stream().map(student -> student.name + " - " + student.lections.size()).forEach(System.out::println);
        System.out.println("3. Выведите название дисциплин, имеющих наибольшее количество посещений.");
        Map<Object, Long> lectionRating =  students.stream().flatMap(student -> student.lections.stream()).collect(Collectors.groupingBy(lection -> lection.subject, Collectors.counting()));
        System.out.println(lectionRating.entrySet().stream().max((entry1, entry2)-> (int) (entry1.getValue() - entry2.getValue())).get().getKey());
    }
}
