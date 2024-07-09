package cl.praxis.startup2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDAO {
    private int id;
    private String email;
    private String nick;
    private String name;
    private String password;
    private Float weight;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    UserDAO(String email, String nick, String name, String password, Float weight){
        this.email = email;
        this.nick = nick;
        this.name = name;
        this.password = password;
        this.weight = weight;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
