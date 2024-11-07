package repository;

import model.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WriterRepository extends JpaRepository<Writer, Long> {
    boolean existsByName(String name);
    Writer findByName(String name);

    @Query("SELECT a FROM Writer a WHERE a.yearBirthday >= :year AND :year >= a.yearBirthday")
    List<Writer> searchForYearBirthday(int year);

    @Query("SELECT a FROM Writer a WHERE a.name ILIKE %:writerSearch%")
    List<Writer> searchByName(String writerSearch);

}
