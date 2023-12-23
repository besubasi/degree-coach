package tr.com.subasi.degreecoach.app.city.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.degreecoach.app.city.entity.CityEntity;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {

}
