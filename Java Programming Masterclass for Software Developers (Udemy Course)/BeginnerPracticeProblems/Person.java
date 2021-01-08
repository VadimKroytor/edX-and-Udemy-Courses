package BeginnerPracticeProblems;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        boolean result = false;
        if (this.age > 12 && this.age < 20) {
            result = true;
        }
        return result;
    }

    public String getFullName() {
        String result = this.firstName + " " + this.lastName;
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            result = "";
        }
        else if (lastName.isEmpty()) {
            result = this.firstName;
        }
        else if (firstName.isEmpty()) {
            result = this.lastName;
        }
        return result;
    }
}