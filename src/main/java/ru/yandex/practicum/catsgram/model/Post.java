package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class Post {
    long id;
    long authorId;
    String description;
    Instant postDate;
}
