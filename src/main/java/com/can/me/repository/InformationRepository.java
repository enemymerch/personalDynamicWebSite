package com.can.me.repository;

import com.can.me.model.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformationRepository extends JpaRepository<Information, Long> {
    public List<Information> findAllByCvId(Long cvId);
}
