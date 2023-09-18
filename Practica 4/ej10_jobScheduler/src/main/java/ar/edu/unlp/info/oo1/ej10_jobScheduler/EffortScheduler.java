package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class EffortScheduler extends JobScheduler{
	@Override
	protected JobDescription next() {
		JobDescription maxEffort = this.getJobs().stream().max((j1, j2) -> Double.compare(j1.getEffort(), j2.getEffort())).orElse(null);
		this.unschedule(maxEffort);
		return maxEffort;
	}
}
