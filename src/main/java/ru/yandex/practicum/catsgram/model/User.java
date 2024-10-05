package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class User {
    private long id;
    private String username;
    private String email;
    private String password;
    private Instant registration;
}
