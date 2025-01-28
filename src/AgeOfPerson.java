public class AgeOfPerson {
    public static void main(String[] args) {
        AgeOfPerson age = new AgeOfPerson();
        age.category(15);
        age.category(34);
        age.category(87);
    }

    public void category(int age) {
        if (age < 18) {
            System.out.println("You are a Minor.");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are a Adult.");
        } else {
            System.out.println("You are a Senior Citizen.");
        }
    }
}
