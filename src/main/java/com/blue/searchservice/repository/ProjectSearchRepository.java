package com.blue.searchservice.repository;

import com.blue.searchservice.dto.TaskEvent;
import com.blue.searchservice.entity.IndexedProject;
import com.blue.searchservice.entity.IndexedTask;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectSearchRepository extends ElasticsearchRepository<IndexedTask, Long> {
    List<IndexedProject> findByNameContaining(String keyword);
}
