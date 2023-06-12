package com.kratin;
import com.kratin.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MedicationReminder {
	private Map<String, Sample> medicationMap;
	private ScheduledExecutorService executorService;

	public MedicationReminder() {
		medicationMap = new HashMap<>();
		executorService = Executors.newScheduledThreadPool(1);
	}

	public void addMedication(String name, int dosage) {
		Sample medication = new Sample(name, dosage);
		medicationMap.put(name, medication);
	}

	public void setReminder(String medicationName, int intervalMinutes) {
		Sample medication = medicationMap.get(medicationName);
		if (medication != null) {
			executorService.scheduleAtFixedRate(() -> {
				System.out.println("Reminder: Take " + medication.getName() + " - Dosage: " + medication.getDosage());
			}, 0, intervalMinutes, TimeUnit.MINUTES);
		}
	}

	public void stopReminders() {
		executorService.shutdown();
	}
}
