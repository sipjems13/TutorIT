package com.appdev.vabara.valmerabanicoruperez.repository;

import com.appdev.vabara.valmerabanicoruperez.entity.TutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<TutorEntity, Long> {
}
