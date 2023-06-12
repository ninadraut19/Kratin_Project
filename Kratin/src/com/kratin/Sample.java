package com.kratin;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sample {
	private String name;
	private int dosage;

	public Sample(String name, int dosage) {
		this.name = name;
		this.dosage = dosage;
	}

	public String getName() {
		return name;
	}

	public int getDosage() {
		return dosage;
	}
}
