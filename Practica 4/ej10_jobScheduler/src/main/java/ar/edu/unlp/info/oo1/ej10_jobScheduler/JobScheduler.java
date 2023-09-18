package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class JobScheduler {
	private String strategy;
	protected List<JobDescription> jobs;
	
	public JobScheduler() {
		this.jobs = new ArrayList<JobDescription>();
	}

	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public List<JobDescription> getJobs() {
		return new ArrayList<JobDescription>(this.jobs);
	}
	
	public void schedule(JobDescription job) {
		this.jobs.add(job);
	}
	
	public void unschedule(JobDescription job) {
		if(this.jobs.contains(job)) {
			this.jobs.remove(job);
		}
	}
	
	protected abstract JobDescription next();
	
}
