package com.fundamentals.curs5_Abstr_Encaps;

public class Lectia5 {

    public static void main(String[] args) {

        Student st = new Student("Elon", "Musk",
                "elon-musk-cnp", "B12", "0643612512", "elon@gmail.com");
        Teacher teacher = new Teacher("Bill", "Gates", "" +
                "bill-gates-cnp", "Math", "0362342141", "bill@gmail.com");


//        st.getStudentInfo();
//        teacher.getTeacherInfo();
//        rector.getRectorInformation();

//        p.printDetails();
//        st.printDetails();
//        teacher.printDetails();
//        rector.printDetails();

        Person p = new Person("Test name", "Test 2nd Name", "11621612", "063263432", "person@email.com");
        Person studentPerson = new Student("Elon", "Musk",
                "elon-musk-cnp", "B12", "0643612512", "elon@gmail.com");
        Person teacherPerson = new Teacher("Bill", "Gates", "" +
                "bill-gates-cnp", "Math", "0362342141", "bill@gmail.com");
        Rector rector = new Rector("Ali", "Baba", "alibaba", "2323612", "alibaba@aliexpres",
                "Information", "IT");
        Person assistant = new TeacherAssistant("Tim", "Cook", "test", "phisics",
                "063631623", "timcook@gmail.com", "Phisics lab");
        Person[] personArray = {p, studentPerson, teacherPerson, rector, assistant};

        Student[] students = { st };

        for (int i=0; i<personArray.length; i++) {
            personArray[i].printDetails();
            if (personArray[i] instanceof Student) {
                ((Student) personArray[i]).printDetails(" some-nickname ");
            }
        }

        for (int i=0; i<students.length; i++) {
            students[i].printDetails( " nickanme" +i);
        }
    }

}
