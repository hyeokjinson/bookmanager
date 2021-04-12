package com.fastcampus.jpa.bookmanager.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

//@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity

public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User(Long id,String name, String email, LocalDateTime created_at, LocalDateTime updated_at) {
        this.id=id;
        this.name = name;
        this.email = email;
        this.createdAt = created_at;
        this.updatedAt = updated_at;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id='"+id+'\''+
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", UpdatedAt=" + updatedAt +
                '}';
    }
}
