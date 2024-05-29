public class Student {
    private String name;
    private int age;
    private String dateOfBirth;

    public Student(String name, int age, String dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + dateOfBirth;
    }

    public static Student parse(String str) {
        String[] data = str.split(" ");
        if (data.length != 3) {
            throw new IllegalArgumentException("Incorrectly formatted student data: " + str);
        }
        String name = data[0];
        int age;
        try {
            age = Integer.parseInt(data[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid age value: " + data[1]);
        }
        String dateOfBirth = data[2];
        return new Student(name, age, dateOfBirth);
    }
}
