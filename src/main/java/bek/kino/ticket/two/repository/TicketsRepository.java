package bek.kino.ticket.two.repository;

import bek.kino.ticket.two.model.Tickets;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Transactional
public interface TicketsRepository extends JpaRepository<Tickets,Long> {
    List<Tickets> findAll();
    Tickets findTicketsById(Long id);
    @Query(value = "SELECT t FROM Tickets t WHERE t.user.id = :userId")
    Tickets getUserTicketById(@Param("userId") Long userId);

    List<Tickets> findAllByEvent_Id(Long id);
}
