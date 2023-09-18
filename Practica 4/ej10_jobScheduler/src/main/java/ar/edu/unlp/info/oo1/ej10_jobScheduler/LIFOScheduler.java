package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class LIFOScheduler extends JobScheduler {
	public LIFOScheduler() {
		super();
	}
	
	@Override
	protected JobDescription next() {
		if(this.getJobs().size() > 0) {
			JobDescription lastItem = this.getJobs().get(this.getJobs().size() - 1);
			this.unschedule(lastItem);
			return lastItem;
		}
		return null;
	}
}
