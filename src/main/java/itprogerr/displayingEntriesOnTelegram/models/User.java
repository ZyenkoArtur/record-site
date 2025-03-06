package itprogerr.displayingEntriesOnTelegram.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column
        private String username;

        @Column
        private String email;

        @Column
        private String password;


    }


