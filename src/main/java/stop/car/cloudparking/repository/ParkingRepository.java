package stop.car.cloudparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stop.car.cloudparking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
