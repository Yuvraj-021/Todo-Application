package com.example.todoapplication.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cglib.core.Local;

import jakarta.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@RequiredArgsConstructor
@Getter @Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String title;
    private String description;

    private LocalDate localDate;

    private Boolean completed=false;


    @Column(name = "created_at", updatable = false)
    private LocalDate createdAt= LocalDate.now();

    @Column(name = "updated_at")
    private LocalDate updatedAt=LocalDate.now();


}
