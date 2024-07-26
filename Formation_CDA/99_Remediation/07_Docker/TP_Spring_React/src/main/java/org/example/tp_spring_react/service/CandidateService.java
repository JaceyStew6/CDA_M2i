package org.example.tp_spring_react.service;

import org.example.tp_spring_react.dto.candidate.CandidateDtoGet;
import org.example.tp_spring_react.dto.candidate.CandidateDtoPost;
import org.example.tp_spring_react.entities.Candidate;
import org.example.tp_spring_react.exception.NotFoundException;
import org.example.tp_spring_react.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CandidateService implements BaseService<CandidateDtoPost, CandidateDtoGet> {
    @Autowired
    private CandidateRepository candidateRepository;
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


    @Override
    public CandidateDtoGet create(CandidateDtoPost candidateDtoPost) {
        Candidate candidate = Candidate.builder()
                .name(candidateDtoPost.getName())
                .identificationNumber(candidateDtoPost.getIdentificationNumber())
                .address(candidateDtoPost.getAddress())
                .phone(candidateDtoPost.getPhone())
                .email(candidateDtoPost.getEmail())
                .birthDate(LocalDate.parse(candidateDtoPost.getBirthDateStr(), dateFormatter))
                .rating((candidateDtoPost.getRating()))
                .observation(candidateDtoPost.getObservation())
                .skill(candidateDtoPost.getSkill())
                .wantedJob(candidateDtoPost.getWantedJob())
                .jobInterviewDate(LocalDate.parse(candidateDtoPost.getJobInterviewDateStr(), dateFormatter))
                .build();
        candidateRepository.save(candidate);
        return candidateToCandidateDtoGet(candidate);
    }


    private CandidateDtoGet candidateToCandidateDtoGet (Candidate candidate){
        return CandidateDtoGet.builder()
                .id(candidate.getId())
                .name(candidate.getName())
                .identificationNumber(candidate.getIdentificationNumber())
                .address(candidate.getAddress())
                .phone(candidate.getPhone())
                .email(candidate.getEmail())
                .birthDate(candidate.getBirthDate())
                .rating(candidate.getRating())
                .observation(candidate.getObservation())
                .skill(candidate.getSkill())
                .wantedJob(candidate.getWantedJob())
                .jobInterviewDate(candidate.getJobInterviewDate())
                .build();
    }

    private Candidate getById(Integer id){
        return candidateRepository.findById(id).orElseThrow(()-> new NotFoundException(id.toString()));
    }


    @Override
    public CandidateDtoGet update(int id, CandidateDtoPost candidateDtoPost) {
        Candidate candidate = getById(id);
        candidate.setName(candidateDtoPost.getName());
        candidate.setIdentificationNumber(candidateDtoPost.getIdentificationNumber());
        candidate.setAddress(candidateDtoPost.getAddress());
        candidate.setPhone(candidateDtoPost.getPhone());
        candidate.setEmail(candidateDtoPost.getEmail());
        candidate.setBirthDate(LocalDate.parse(candidateDtoPost.getBirthDateStr(), dateFormatter));
        candidate.setRating(candidateDtoPost.getRating());
        candidate.setObservation(candidateDtoPost.getObservation());
        candidate.setSkill(candidateDtoPost.getSkill());
        candidate.setWantedJob(candidateDtoPost.getWantedJob());
        candidate.setJobInterviewDate(LocalDate.parse(candidateDtoPost.getJobInterviewDateStr(), dateFormatter));

        candidateRepository.save(candidate);
        return candidateToCandidateDtoGet(candidate);
    }

    @Override
    public boolean delete(int id) {
        Candidate candidate = getById(id);
        candidateRepository.delete(candidate);
        return true;
    }

    @Override
    public CandidateDtoGet findById(int id) {
        return candidateToCandidateDtoGet(getById(id));
    }

    @Override
    public List<CandidateDtoGet> findAll() {
        return candidatesToCandidatesDtoGets((List<Candidate>) candidateRepository.findAll()) ;
    }

    private List<CandidateDtoGet> candidatesToCandidatesDtoGets(List<Candidate> candidates){
        return candidates.stream().map(this::candidateToCandidateDtoGet).collect(Collectors.toList());
    }
}


/*
    public List<FilmDtoGet> findAllFilmByDirector ( int directorId){
        Director director = directorService.getById(directorId);
        List<Film> filmsByDirector = director.getFilms();
        return filmsTofilmDtoGets(filmsByDirector);
    }
}*/
