package com.can.me.repository;

import com.can.me.model.Cv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CvRepository extends JpaRepository<Cv, Long> {
}
