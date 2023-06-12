package com.test;

import com.kratin.MedicationReminder;

public class MedicationManagementDemo {
    public static void main(String[] args) {
        MedicationReminder reminder = new MedicationReminder();

        // Add medications
        reminder.addMedication("Medication A", 1);
        reminder.addMedication("Medication B", 2);

        // Set reminders
        reminder.setReminder("Medication A", 1);
        reminder.setReminder("Medication B", 2);

        // Stop reminders after 5 minutes (for demonstration purposes)
        try {
            Thread.sleep(5 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reminder.stopReminders();
    }
}
