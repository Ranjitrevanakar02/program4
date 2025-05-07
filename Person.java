import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class Person {
    private String name;
    private String dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayName() {
        System.out.println("Person's Name: " + name);
    }

    public void displayAge() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date birthDate = sdf.parse(dob);
            long ageInMillis = System.currentTimeMillis() - birthDate.getTime();
            long ageInYears = TimeUnit.MILLISECONDS.toDays(ageInMillis) / 365;
            System.out.println(name + "'s Age: " + ageInYears);
        } catch (Exception e) {
            System.out.println("Error in parsing date.");
        }
    }
}
