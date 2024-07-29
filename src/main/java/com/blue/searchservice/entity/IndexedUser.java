package com.blue.searchservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "users")
public class IndexedUser {
    @Id
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
}
