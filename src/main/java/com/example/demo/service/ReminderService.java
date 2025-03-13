package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Reminder;
import com.example.demo.repo.RemindersRepo;

import java.util.List;

@Service
public class ReminderService {

    @Autowired
    private RemindersRepo reminderRepository;

    public List<Reminder> getAllReminders() {
        return reminderRepository.findAll();
    }

    public void saveReminder(Reminder reminder) {
        reminderRepository.save(reminder);
    }

    public void deleteReminder(Long id) {
        reminderRepository.deleteById(id);
    }
}
