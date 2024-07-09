package org.example.tp_spring_react.service;

import org.example.tp_spring_react.dto.candidate.CandidateDtoGet;
import org.example.tp_spring_react.dto.candidate.CandidateDtoPost;
import org.example.tp_spring_react.entities.Candidate;
import org.example.tp_spring_react.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
        return candidateToCandidateDto(candidate);
    }

    private CandidateDtoGet candidateToCandidateDto (Candidate candidate){

    }

    @Override
    public CandidateDtoGet update(int id, CandidateDtoPost candidateDtoPost) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public CandidateDtoGet findById(int id) {
        return null;
    }

    @Override
    public List<CandidateDtoGet> findAll() {
        return List.of();
    }
}


/*  @Override
    public FilmDtoGet create(FilmDtoPost filmDtoPost) {
        Film film = Film.builder()
                .name(filmDtoPost.getName())
                .description(filmDtoPost.getDescription())
                .duration(filmDtoPost.getDuration())
                .filmType(FilmType.values()[filmDtoPost.getFilmType()])
                .releaseDate(LocalDate.parse(filmDtoPost.getReleaseDateStr(),dateFormatter))
                .director(directorService.getById(filmDtoPost.getDirectorId()))
                .build();

        repository.save(film);
        return filmToFilmDtoGet(film);
    }

    @Override
    public FilmDtoGet update(int id, FilmDtoPost filmDtoPost) {
        Film film = getById(id);
        film.setName(filmDtoPost.getName());
        film.setDescription(filmDtoPost.getDescription());
        film.setDuration(filmDtoPost.getDuration());
        film.setReleaseDate(LocalDate.parse(filmDtoPost.getReleaseDateStr(),dateFormatter));
        film.setFilmType(FilmType.values()[filmDtoPost.getFilmType()]);
        film.setDirector(directorService.getById(filmDtoPost.getDirectorId()));

        repository.save(film);
        return filmToFilmDtoGet(film);
    }

    @Override
    public boolean delete(int id) {
        Film film = getById(id);
        repository.delete(film);
        return true;
    }

    @Override
    public FilmDtoGet findById(int id) {
        return filmToFilmDtoGet(getById(id));
    }

    @Override
    public List<FilmDtoGet> findAll() {
        return filmsTofilmDtoGets((List<Film>) repository.findAll());
    }

    public List<FilmDtoGet> findAllFilmByDirector ( int directorId){
        Director director = directorService.getById(directorId);
        List<Film> filmsByDirector = director.getFilms();
        return filmsTofilmDtoGets(filmsByDirector);
    }

    private Film getById (Integer id){
        return repository.findById(id).orElseThrow(()-> new NotFoundException(id.toString()));
    }

    private FilmDtoGet filmToFilmDtoGet (Film film){
        return FilmDtoGet.builder()
                .id(film.getId())
                .name(film.getName())
                .description(film.getDescription())
                .duration(film.getDuration())
                .filmType(film.getFilmType())
                .releaseDate(film.getReleaseDate())
                .director(film.getDirector())
                .build();
    }

    private List<FilmDtoGet> filmsTofilmDtoGets (List<Film> films){
        return films.stream().map(this::filmToFilmDtoGet).collect(Collectors.toList());
    }
}*/
