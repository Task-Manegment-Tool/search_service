package com.blue.searchservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "tasks")
@ToString
public class IndexedTask {

    @Id
    private Long taskId;

    @Field(type = FieldType.Text, name = "externalId")
    private String externalId;

    @Field(type = FieldType.Text, name = "name")
    private String name;

    @Field(type = FieldType.Text, name = "description")
    private String description;

    //private LocalDateTime expiryTime;
    @Field(type = FieldType.Long, name = "userId")
    private Long userId;

    @Field(type = FieldType.Text, name = "status")
    private TaskStatus status;
}
