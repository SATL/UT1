package es.schooleando.UT1.Semana1;

public class ThreadTask {
	public static void main(String[] args) {

		// Create a task
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		};

		task.run();

		// Add task to thread
		for (int i = 0; i < 5; i++) {
			Thread thread = new Thread(task);
			thread.start();
		}

		System.out.println("Done!");
	}
}
