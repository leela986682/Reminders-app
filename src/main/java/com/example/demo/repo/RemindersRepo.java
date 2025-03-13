package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Reminder;
@Repository
public interface RemindersRepo extends JpaRepository<Reminder, Long> {
}
