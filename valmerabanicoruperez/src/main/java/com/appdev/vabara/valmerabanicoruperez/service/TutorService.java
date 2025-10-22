package com.appdev.vabara.valmerabanicoruperez.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.appdev.vabara.valmerabanicoruperez.entity.TutorEntity;
import com.appdev.vabara.valmerabanicoruperez.repository.TutorRepository;

@Service
public class TutorService {

    private final TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    public List<TutorEntity> getAllTutors() {
        return tutorRepository.findAll();
    }

    public Optional<TutorEntity> findById(Long tutorId) {
        return tutorRepository.findById(tutorId);
    }

    public TutorEntity saveTutor(TutorEntity tutorEntity) {
        return tutorRepository.save(tutorEntity);
    }

    public void deleteTutor(Long tutorId) {
        tutorRepository.deleteById(tutorId);
    }

    public boolean existsById(Long tutorId) {
        return tutorRepository.existsById(tutorId);
    }
}
