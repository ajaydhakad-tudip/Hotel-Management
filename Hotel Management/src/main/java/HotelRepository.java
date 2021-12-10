import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface HotelRepository extends CrudRepository<Bookings, Integer> {

     @Query(value = "SELECT b from Bookings b where b.room.roomNumber = :room and b.checkInDate = :checkInDate " +
             "and b.checkOutDate = :checkOutDate")
     Bookings findAvailableRooms(  @Param("room") Integer room,
                                   @Param("checkDate") Date checkInDate,
                                   @Param("checkDate") Date checkOutDate);
}

