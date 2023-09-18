package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class JobDescription {
	private double effort;
	private int priority;
	private String description;

	public JobDescription(double e, int p, String d) {
		this.effort = e;
		this.priority = p;
		this.description = d;
	}

	public double getEffort() {
		return effort;
	}

	public int getPriority() {
		return priority;
	}

	public String getDescription() {
		return description;
	}

}
