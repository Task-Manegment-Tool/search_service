package com.blue.searchservice.repository;

//import com.blue.searchservice.entity.IndexedTask;
import com.blue.searchservice.entity.IndexedUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserSearchRepository extends ElasticsearchRepository<IndexedUser, Long> {
    List<IndexedUser> findByUsernameContaining(String keyword);
}
