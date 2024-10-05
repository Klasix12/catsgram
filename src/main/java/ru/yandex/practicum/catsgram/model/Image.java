package ru.yandex.practicum.catsgram.model;


import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class Image {
    long id;
    long postId;
    String originalFileName;
    String filePath;
}
