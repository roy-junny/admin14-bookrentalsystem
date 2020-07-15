package bookrental;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class BookListStatus {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String bookName;
    public Integer rentalFee;
    public String rentalStatus;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getRentalFee() {
        return rentalFee;
    }
    public void setRentalFee(Integer rentalFee) {
        this.rentalFee = rentalFee;
    }

    public String getRentalStatus() {
        return rentalStatus;
    }
    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
}