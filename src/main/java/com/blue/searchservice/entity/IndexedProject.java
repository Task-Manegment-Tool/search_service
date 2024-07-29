package com.blue.searchservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "projects")
public class IndexedProject {

    @Id
    private Long id;
    private String name;
    private String description;
    private Long userId;
}
