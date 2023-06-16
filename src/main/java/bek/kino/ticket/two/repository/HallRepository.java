package bek.kino.ticket.two.repository;

import bek.kino.ticket.two.model.Hall;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface HallRepository extends JpaRepository<Hall,Long> {
}
