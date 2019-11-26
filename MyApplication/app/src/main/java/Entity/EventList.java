package Entity;

import java.util.List;

public class EventList{


    private List<Event> events ;

    public EventList(List<Event> events) {
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Event getByIndex(int index){
        return events.get(index) ;
    }
}
