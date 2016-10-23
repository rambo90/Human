package com.gmail.rav;

public class Group {
    private String name;
    private Student[] group = new Student[8];

    public Group(String name) {
        this.name = name;
    }

    public Group() {
    }

    public void addStudent(Student s) {
        if (s == null) {
            System.out.println("Data about the student is not entered.");
        }
        int count = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = s;
                return;
            } else {
                count++;
            }
        }
        try {
            if (count == 8) {
                throw new MyException();
            }
        } catch (MyException e) {
            System.out.println("This group is full.");
        }
    }

    public void delStudent(Student s) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == s) {
                group[i] = null;
            } else {
                System.out.println("Студент отсутствует");
            }
        }
    }

    public void select(String surname) {
        for (Student s : group) {
            if (s.getSurname() == surname) {
                System.out.println(s.toString());
            }
        }
    }

    public void sort() {
        int numNull = 0;
        for (int i = 0; i < group.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < group.length - i - 1 - numNull; j++) {
                if ((group[j] == null || group[j].getSurname() == null) ||
                        (group[j + 1] == null) || (group[j + 1].getSurname() == null)) {
                    Student tmp = group[j];
                    group[j] = group[j + 1];
                    group[j + 1] = tmp;
                    numNull++;
                } else if ((group[j].getSurname().compareTo(group[j + 1].getSurname()) > 0)) {
                    Student tmp = group[j];
                    group[j] = group[j + 1];
                    group[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        sb.append("Группа " + name + System.lineSeparator());
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                sb.append("  " + group[i].toString() + System.lineSeparator());
            }
        }
        sb.append(System.lineSeparator());
        return sb.toString();
    }

}
