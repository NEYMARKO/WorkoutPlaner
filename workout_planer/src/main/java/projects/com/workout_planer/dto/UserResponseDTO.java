package projects.com.workout_planer.dto;

public class UserResponseDTO {
    private int id;
    private String firstName;
    private String lastName;

    public UserResponseDTO(int id, String firstName, String lastName)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString()
    {
        return this.id + " " + this.firstName + " " + this.lastName;
    }
}
