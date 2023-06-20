package bek.kino.ticket.two.api;


import bek.kino.ticket.two.dto.EventDTO;
import bek.kino.ticket.two.impl.EventRepoImpl;
import bek.kino.ticket.two.mapper.EventMapper;
import bek.kino.ticket.two.model.Event;
import bek.kino.ticket.two.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class EventController {

    private final EventService eventService;

    @GetMapping(value = "/getAllEvents")
    public List<EventDTO> getAllEvents(){
        return eventService.getAllEvents();
    }

    @PostMapping(value = "/addEvent")
    public EventDTO addEvent(@RequestBody EventDTO eventDTO){
        return eventService.addEvent(eventDTO);
    }
    @PostMapping(value = "/getEvent/{id}")
    public EventDTO getEventById(@PathVariable(name = "id") Long id){
        return eventService.getEventById(id);
    }
}
