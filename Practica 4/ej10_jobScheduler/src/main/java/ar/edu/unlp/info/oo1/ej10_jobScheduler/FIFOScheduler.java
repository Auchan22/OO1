package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class FIFOScheduler extends JobScheduler {
	
	public FIFOScheduler() {
		super();
	}

	@Override
	protected JobDescription next() {
		if(this.getJobs().size() > 0) {
			JobDescription firstItem = this.getJobs().get(0);
			this.unschedule(firstItem);
			return firstItem;
		}
		return null;
	}
}
