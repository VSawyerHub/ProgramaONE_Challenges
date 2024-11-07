package repository;

import model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    boolean existsByTitle(String tittle);

    Book findByTitle(String title);

    @Query("SELECT DISTINCT l.idiom FROM Book l ORDER BY l.idiom")
    List<String> searchIdiom();

    @Query("SELECT l FROM Book l WHERE idiom = :idiomSearch")
    List<Book> searchForIdiom(String idiomSearch);

    List<Book> findTop10ByOrderByNumberDownloadsDesc();
}
