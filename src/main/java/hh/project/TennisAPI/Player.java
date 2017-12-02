package hh.project.TennisAPI;



import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Player {

    private @Id @GeneratedValue Long Id;
    private String firstName;
    private String lastName;
    private String surface;
    private int points;





    public Player(){}

    public Player(String firstName, String lastName,String surface, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surface = surface;
        this.points = points;
    }

    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return Id;
    }
}
