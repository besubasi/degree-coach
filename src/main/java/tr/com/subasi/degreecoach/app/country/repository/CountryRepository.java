package tr.com.subasi.degreecoach.app.country.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.degreecoach.app.country.entity.CountryEntity;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

}
