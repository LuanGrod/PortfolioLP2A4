package threads;

public class UsandoThreads implements Runnable{

	public static int flag = 1000;
	
	@Override
	public void run() {
		System.out.println("Thread (run) -> " + Thread.currentThread().getId());
		flag = flag + 1000;
	}

	public static void main(String[] args) {
		System.out.println("Main Thread -> " + Thread.currentThread().getId());
		Runnable runnable = new UsandoThreads();

		Thread thread = new Thread(runnable);
		
		System.out.println(flag);
		thread.start();
		
		try {
			thread = new Thread(runnable);
			thread.sleep(flag);
			thread.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println(flag);
		}
		
		try {
			thread = new Thread(runnable);
			thread.join();
			thread.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println(flag);
		}
		
		
		
		
	}

}
