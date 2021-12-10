import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HotelController {

    HotelService hotelService;

    @PostMapping("/api/book-hotel")
    public ResponseEntity<Object> bookingHotel(int CustomerId, Date checkInDate, Date checkOutDate, int numberOfRooms) {
      return hotelService.bookingRooms(checkInDate, checkOutDate, numberOfRooms);
    }

}
