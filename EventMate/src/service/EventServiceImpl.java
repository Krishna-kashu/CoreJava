package service;

import dto.EventDTO;

public class EventServiceImpl implements EventService{
    public EventServiceImpl(){
        System.out.println("no-arg constructor of EventServiceImpl");
    }
    @Override
    public boolean save(EventDTO eventDTO) {
        return false;
    }
}
