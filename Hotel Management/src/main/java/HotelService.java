import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.util.Date;


public class HotelService   {

    @Autowired
    private HotelRepository hotelRepository;

    public ResponseEntity<Object> bookingRooms(Date checkInDate, Date checkOutDate, int numberOfRooms) {

       Bookings bookings = hotelRepository.findAvailableRooms(numberOfRooms, checkInDate, checkOutDate);
        if (bookings == null) {
            return new ResponseEntity<Object>(bookings, HttpStatus.OK);
        }
        return new ResponseEntity<Object>("Rooms not available for your dates, please try some other configurations", HttpStatus.OK);
    }

}
