package mineplex.serverdata.database;

import java.util.concurrent.atomic.AtomicInteger;

public class DatabaseRunnable
{
	private Runnable _runnable;
	private String _errorMessage;
	private AtomicInteger _failedAttempts = new AtomicInteger(0);

	public DatabaseRunnable(Runnable runnable, String error)
	{
		_runnable = runnable;
		_errorMessage = error;
	}

	public void run()
	{
		_runnable.run();
	}

	public String getErrorMessage()
	{
		return _errorMessage;
	}

	public void incrementFailCount()
	{
		_failedAttempts.getAndIncrement();
	}

	public int getFailedCounts()
	{
		return _failedAttempts.get();
	}
}
