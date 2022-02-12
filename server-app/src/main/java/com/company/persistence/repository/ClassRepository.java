package com.company.persistence.repository;

import com.company.persistence.entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity, Long>{

    List<ClassEntity> findByCategoryIdAndAcademyId(Long categoryId, Long academyId);
}
