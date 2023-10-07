package ku.cs.shibaqueuerestapi.controller;

import ku.cs.shibaqueuerestapi.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BookingController {
    @Autowired
    private BookingService service;

    @GetMapping("/booking")
    public List<Booking> getAllBookings(){
        return service.getAll();
    }

    @GetMapping("/booking/{idBooking}")
    public Booking getBookingById(@PathVariable UUID idBooking){
        return service.getBookingById(idBooking);
    }

    @PostMapping("/booking")
    public Booking create(@RequestBody Booking booking){
        return service.create(booking);
    }
}
