#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

class Student
{
public:
    int roll_number;
    std::string name;
    std::string date_of_birth;
    int total_marks;

    Student() {}

    void input()
    {
        std::cout << "Enter Roll Number: ";
        std::cin >> roll_number;
        std::cin.ignore();

        std::cout << "Enter Name: ";
        std::getline(std::cin, name);

        std::cout << "Enter Date of Birth (YYYY-MM-DD): ";
        std::getline(std::cin, date_of_birth);

        std::cout << "Enter Total Marks: ";
        std::cin >> total_marks;
    }

    void display() const
    {
        std::cout << "Roll Number: " << roll_number << ", Name: " << name
                  << ", Date of Birth: " << date_of_birth << ", Total Marks: " << total_marks << "\n";
    }
};

bool compareByRollNumber(const Student &a, const Student &b)
{
    return a.roll_number < b.roll_number;
}

bool compareByDateOfBirth(const Student &a, const Student &b)
{
    return a.date_of_birth < b.date_of_birth;
}

bool compareByTotalMarks(const Student &a, const Student &b)
{
    return a.total_marks < b.total_marks;
}

int main()
{
    std::vector<Student> students;

    for (int i = 0; i < 10; ++i)
    {
        Student student;
        std::cout << "Enter data for Student " << (i + 1) << ":\n";
        student.input();
        students.push_back(student);
    }

    std::sort(students.begin(), students.end(), compareByRollNumber);
    std::cout << "\nSorted by Roll Number:\n";
    for (const Student &student : students)
    {
        student.display();
    }

    std::sort(students.begin(), students.end(), compareByDateOfBirth);
    std::cout << "\nSorted by Date of Birth:\n";
    for (const Student &student : students)
    {
        student.display();
    }

    std::sort(students.begin(), students.end(), compareByTotalMarks);
    std::cout << "\nSorted by Total Marks:\n";
    for (const Student &student : students)
    {
        student.display();
    }

    return 0;
}