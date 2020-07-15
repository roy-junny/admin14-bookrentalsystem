package bookrental;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface BookListStatusRepository extends JpaRepository<BookListStatus, Long> {

    BookListStatus findByBookName(@Param("bookName") String booName);
}
