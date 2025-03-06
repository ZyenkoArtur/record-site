package itprogerr.displayingEntriesOnTelegram.repo;

import itprogerr.displayingEntriesOnTelegram.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<Record,Long> {
List<Record> findByAppointmentDate(LocalDate appointmentDate);
}