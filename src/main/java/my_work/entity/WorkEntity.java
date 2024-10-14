package my_work.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = " career ")
@NoArgsConstructor
@AllArgsConstructor
public class WorkEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int year;
    @Column(nullable = false)
    private String name = "monish";
    @Column(nullable = false)
    private String company;
    @Column(nullable = false)
    private String role = "Java Developer";
}
