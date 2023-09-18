package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class PriorityScheduler extends JobScheduler{
	public PriorityScheduler() {
		super();
	}
	
	@Override
	protected JobDescription next() {
		if(this.getJobs().size() > 0) {
			JobDescription highestP = this.getJobs().stream().max((j1, j2) -> Integer.compare(j1.getPriority(), j2.getPriority())).orElse(null);
			this.unschedule(highestP);
			return highestP;
		}
		return null;
	}
}
