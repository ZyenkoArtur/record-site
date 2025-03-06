package itprogerr.displayingEntriesOnTelegram.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Record{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private String brend;

    @Column(nullable = true)
    private String number;

    @Column(nullable = true)
    private Short radius;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;

}


