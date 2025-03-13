package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ReminderService;
import com.example.demo.entity.*;
import java.util.List;
@RestController
@RequestMapping("/reminders")
@CrossOrigin("*")
public class ReminderController {

    @Autowired
    private ReminderService reminderService;
    
    // Show all reminders
    @GetMapping
    public ResponseEntity<List<Reminder>> showReminders() {
    	List<Reminder> list= reminderService.getAllReminders();
        return ResponseEntity.ok(list);
    }

    // Save new reminder
    @PostMapping("/save")
    public ResponseEntity<String> saveReminder(@RequestBody Reminder reminder) {
        reminderService.saveReminder(reminder);
        return ResponseEntity.status(HttpStatus.CREATED).body("saved");
    }

    // Delete a reminder
   @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteReminder(@PathVariable Long id) {
        reminderService.deleteReminder(id);
        return ResponseEntity.ok("deleted");
    }
}
