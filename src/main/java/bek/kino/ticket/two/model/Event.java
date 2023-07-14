package bek.kino.ticket.two.model;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "t_events")
@Getter
@Setter
public class Event extends BaseModel {

	private String eventName;

	private String event_date;

	private String author;

	private String pictureLink;

	@ManyToOne
	private Hall hall;

	private int price;

	private String status;

}
